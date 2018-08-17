package cloud.rehlat.utils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.ContentType;
import javax.mail.internet.MimeMultipart;
import javax.mail.search.FlagTerm;

import com.sun.mail.imap.IMAPFolder;



public class MailUtils {
	private static MailUtils mailUtilsInstance = new MailUtils();
	public static MailUtils getInstance() {
		if (mailUtilsInstance == null) {
			mailUtilsInstance = new MailUtils();
		}
		return mailUtilsInstance;
	}

	/**
	 * This method is used to fetch the recovery code string from the email
	 * @param mailBody
	 * @return
	 */
	public String readMailAndGetRecoveryCode(String mailBody) {
		String recoveryCode = null;
		//if(mailBody.contains("Enter") && mailBody.contains("to access Canopy Visualizer.")) {
		if(mailBody.contains("Your OTP:")) {
			//String mailFirstLine = mailBody.substring(mailBody.indexOf("Enter"), mailBody.indexOf("Visualizer"));
			String mailFirstLine = mailBody.substring(mailBody.indexOf("Your OTP:"), mailBody.indexOf("Expires in: 15 minutes only"));
			System.out.println("Inside the mail body: "+ mailFirstLine);
			recoveryCode = mailFirstLine.split(" ")[2];
			System.out.println(recoveryCode);
		}
		System.out.println("recovery code: "+recoveryCode);
		return recoveryCode;
	}

	/**
	 * This method is used to fetch the correct email based on the subject line
	 * @param expectedMailSubject
	 * @return
	 * @throws MessagingException
	 * @throws IOException
	 */
	public String fetchEmail(String expectedMailSubject) throws MessagingException, IOException {
		String contentStr = null;
		IMAPFolder folder = null;
		Store store = null;
		String subject = null;
		try 
		{
			Properties props = System.getProperties();
			props.setProperty("mail.store.protocol", "imaps");
			Session session = Session.getDefaultInstance(props, null);
			store = session.getStore("imaps");
			store.connect("imap.googlemail.com","qa.automationrehlat@gmail.com", "naga@automation");
			folder = (IMAPFolder) store.getFolder("inbox");
			if(!folder.isOpen()) {
				folder.open(Folder.READ_WRITE);
			}
		    Flags seen = new Flags(Flags.Flag.SEEN);
		    FlagTerm unseenFlagTerm = new FlagTerm(seen, false);
		    Message messages[] = folder.search(unseenFlagTerm);
			System.out.println("No of Total Messages : " + folder.getMessageCount());
			System.out.println("No of Unread Messages : " + folder.getUnreadMessageCount());
			System.out.println(messages.length);
			for (int i=messages.length-1;i>=0; i--) 
			{
				System.out.println("MESSAGE " + (i + 1) + ":");
				Message message =  messages[i];
				subject = message.getSubject();
				System.out.println(subject);
				subject = subject.split("\\-")[0];
				if(expectedMailSubject.equalsIgnoreCase(subject)) {
					System.out.println("Subject: " + message.getSubject());
					System.out.println("From: " + message.getFrom()[0]);
					System.out.println("To: "+message.getAllRecipients()[0]);
					System.out.println("Date: "+message.getReceivedDate());
					System.out.println("Content type: " +message.getContentType());

					ContentType ct = new ContentType(message.getContentType());
					if(ct.getPrimaryType().equals("multipart")) {
						contentStr = getMultiPart(messages[i]);
					} else {
						contentStr = messages[i].getContent().toString();
					}
					folder.setFlags(new Message[] {message}, new Flags(Flags.Flag.SEEN), true);
				}
			}
		}
		finally 
		{
			if (folder != null && folder.isOpen()) { folder.close(true); }
			if (store != null) { store.close(); }
		}
		return contentStr; 

	}

    /**
     * This method is used to fetch the email body based on content type is Multipart
     * @param m
     * @return
     */
	public static String getMultiPart(Message m) {
		StringBuffer stringBuffer = new StringBuffer();
		try {
			MimeMultipart content = ( MimeMultipart )m.getContent();
			for( int i = 0; i < content.getCount(); i++ ) {
				BodyPart part = content.getBodyPart( i );
				stringBuffer.append(part.getContent());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return stringBuffer.toString();
	}
	
	/*
     * This method returns the link which matches the content form the html string
     */
    public String getLinkWithContentInMail( String subject,String linkContent) throws Exception{
         String mailContent = getMail( subject);
         String s = mailContent.replaceAll("\"", " ");
            // separete input by spaces ( URLs don't have spaces )
            String [] parts = s.split("\\s");
	        // Attempt to convert each item into an URL.   
	        for( String item : parts )
	        try {
	            URL url = new URL(item);
	            // If possible then replace with anchor...
	            if(url.toString().contains(linkContent))
	             return url.toString();    
	        } catch (MalformedURLException e) {
	            // If there was an URL that was not it!...
	           // System.out.print( item + " " );
	        }
		 return null;
	}
    /*
	 * @Desc: This function is used to connect to gmail and search the mail with subject in gmail account
	 */
     public static String getMail( String subject) throws Exception{
            System.out.println("Searching for Email with subject:"+subject.trim());
            Properties props = System.getProperties();
            props.setProperty("mail.store.protocol", "imaps");
            Session session = Session.getDefaultInstance(props, null);
            Store store = session.getStore("imaps");
            try {
                        store.connect("imap.gmail.com","qa.automation@canopy.cloud", "JhumriTilaiya@001");
                        //store.connect("dev.slando.com",993, "build", "Ruo7aidu1maNgoovailahngai");
                        //System.out.println(store);
                        /*
                         * If the mail is found then the loop below terminates with the return statement
                         * If the mail is not in the in box then it pauses for few seconds and check again
                         * It repeats for 20 times before it confirms that there is not mail in the inbox
                         */
                        for( int count=0; count<60;){
                                Folder inbox = store.getFolder("Inbox");
                                inbox.open(Folder.READ_WRITE);
                                Message messages[] = inbox.getMessages();
                                System.out.println(messages.length);
                                /*
                                 * this for loop Starts with the latest mails in the inbox and goes on.
                                 */
                                for (int i=messages.length-1;i>=0; i--) {
                                    //System.out.print(messages[i].getSubject());
                                    //This if condition checks for the mail with the given subject
                                	System.out.println(messages[i].getSubject());
                                    if(messages[i].getSubject().contains(subject)){
                                        System.out.println(i + ": " + messages[i].getFrom()[0]+ "\t" + messages[i].getSubject());
                                        //System.out.println(messages[i].getContent());
                                        String contentStr = null;
                                         ContentType ct = new ContentType(messages[i].getContentType() );
                                        if(ct.getPrimaryType().equals("multipart")) {
                                            contentStr = getMultiPart(messages[i]);
                                        } else {
                                            contentStr = messages[i].getContent().toString();
                                        }
                                        return messages[i].getSubject().toString()+ " " + contentStr;
                                    }
                                }
                                Thread.sleep(200);
                                count++;
                        return "";
                    }
                } catch (NoSuchProviderException e) {
                    e.printStackTrace();
                    return "";
                } catch (MessagingException e) {  
                    e.printStackTrace();
                    return "";
                }
                catch(NullPointerException e)
                {
                    System.out.println("in null catch");
                }
                catch (Exception e) {
                    System.out.println("The error is " + e.toString());
                    return "";
                }
                finally{
                    store.close();
                }
                return "";
    }
}