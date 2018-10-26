package cloud.rehlat.pages.slacknotifications;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.utils.DataUtils;
import cloud.rehlat.utils.PageUtils;

public class Repricing_Html_Report extends RepricingPage {
	
		
		// TODO Auto-generated constructor stub
	

	public WebDriver driver;
	private PageUtils pageUtils;
	
	public Repricing_Html_Report(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}
	
	static int All_Repricing_total;
	static int All_TransactionHold_total;
	static int All_Confirmationpending_total;

	public  void html_report() throws EmailException {
		// Repricing
		 System.out.println("EG_RP_Wego:"+EG_RP_Wego);
		 System.out.println("Com_RP_Repricing_Total:"+Com_RP_Repricing_Total);
		String COM_RP_Total = new Integer(Com_RP_Repricing_Total).toString();
		String AE_RP_Total = new Integer(AE_RP_Repricing_Total).toString();
		String SA_RP_Total = new Integer(SA_RP_Repricing_Total).toString();
		String EG_RP_Total = new Integer(EG_RP_Repricing_Total).toString();
       
		int RP_TotalValue = Integer.parseInt(COM_RP_Total) + Integer.parseInt(AE_RP_Total)
				+ Integer.parseInt(SA_RP_Total) + Integer.parseInt(EG_RP_Total);
		All_Repricing_total = RP_TotalValue;
		System.out.println("REPRICING  GRAND TOTAL:::----" + All_Repricing_total);

		// Confirmation pending
		String COM_CP_Total = new Integer(Com_CP_conformation_pending_Total).toString();
		String AE_CP_Total = new Integer(AE_CP_conformation_pending_Total).toString();
		String SA_CP_Total = new Integer(SA_CP_conformation_pending_Total).toString();
		String EG_CP_Total = new Integer(EG_CP_conformation_pending_Total).toString();

		int CP_TotalValue = Integer.parseInt(COM_CP_Total) + Integer.parseInt(AE_CP_Total)
				+ Integer.parseInt(SA_CP_Total) + Integer.parseInt(EG_CP_Total);
		All_Confirmationpending_total = CP_TotalValue;
		System.out.println("CONFIRMATION PENDING GRAND TOTAL:::----" + All_Confirmationpending_total);

		// Transaction Hold
		String COM_TH_Total = new Integer(Com_TH_Transactionhold_total).toString();
		String AE_TH_Total = new Integer(AE_TH_Transactionhold_total).toString();
		String SA_TH_Total = new Integer(SA_TH_Transactionhold_total).toString();
		String EG_TH_Total = new Integer(EG_TH_Transactionhold_total).toString();
		int TH_TotalValue = Integer.parseInt(COM_TH_Total) + Integer.parseInt(AE_TH_Total)
				+ Integer.parseInt(SA_TH_Total) + Integer.parseInt(EG_TH_Total);
		All_TransactionHold_total = TH_TotalValue;
		System.out.println("TRANSACTION HOLD GRAND TOTAL:::----" + All_TransactionHold_total);

		// Mail sent
		StringBuilder htmlStringBuilder=new StringBuilder();
		System.out.println("Started");
		HtmlEmail email = new HtmlEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		System.out.println("1");
		email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
		email.setSSLOnConnect(true);
		email.setFrom("naga123.ch@gmail.com");
		email.setSubject("" + DataUtils.YesterdayDate("dd-mm-yyyy") + " " + "To" + " "
				+ DataUtils.getDateInSpecifiedFormat("dd-mm-yyyy") + "  Repricing 2:00 AM Status Report");
		System.out.println("2");
		
		email.setHtmlMsg(""+htmlStringBuilder.append(" <table width =200  height = 100 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th> <th>DOMAIN</th>  <th> TOTAL</th><th> GRAND TOTAL </th></tr> "));

		//Repricing
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >REPRICING</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Com</td> <td>"+Com_RP_Repricing_Total+"</td><td rowspan=5>"+All_Repricing_total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_RP_Repricing_Total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_RP_Repricing_Total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_RP_Repricing_Total+"</td></tr>"));
				
			
		//Confirmation pending
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >CONFIRMATION PENDING</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_CP_conformation_pending_Total+"</td><td rowspan=5>"+All_Confirmationpending_total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td><td>"+AE_CP_conformation_pending_Total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td><td>"+SA_CP_conformation_pending_Total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td><td>"+EG_CP_conformation_pending_Total+"</td></tr>"));
		
		//Trancation Hold

		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >TRANSACTION HOLD-REPRICING</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td><td>"+Com_TH_Transactionhold_total+"</td><td rowspan=5>"+All_TransactionHold_total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td><td>"+AE_TH_Transactionhold_total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_TH_Transactionhold_total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_TH_Transactionhold_total+"</td></tr>"));
		
		/*email.addTo("Sreenivas.bodige@rehlat.com");
		email.addCc("tariqraza@rehlat.com");
		email.addCc("qateam@rehlat.com");
		email.addCc("rajendra.purohit@rehlat.com");
		email.addCc("veerendra.parvataneni@rehlat.com");
		email.addCc("suresh.kakarlapudi@rehlat.com");*/
		
	 email.addTo("naga.ch199@gmail.com");
		System.out.println("3");
		email.send();
		System.out.println("END");
		
			
	}

}
