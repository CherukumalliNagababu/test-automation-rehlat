package cloud.rehlat.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import cloud.rehlat.constants.common.DataConstants;

public class TestDataUtils {
	private static long timeInMillis;
	public static int randomNumber;
	public static String uniqueAccountCode;
	public static String rmAccountCode;
	public static String firstParentAccount;
	public static String firstChildAccount;
	public static String secondParentAccount;
	public static String secondChildAccount;
	public static String uniqueSecurityCode;
	public static String uniqueName;
	public static String uniqueRegisterFirstName;
	public static String uniqueRegisterLastName;
	public static String firstRegisterAccount;
	public static String secondRegisterAccount;
	public static String uniqueAdultName; 
	public static String uniqueFirstName;
	public static String uniqueMiddleName;
	public static String uniqueLastName;
	public static String uniquePassword;
	public static long getCurrentTimeInMillis() {
		timeInMillis = System.currentTimeMillis();
		return timeInMillis;

	}
	public static long  getRandomNumbers()
	  {
		Random rand = new Random(); 
		  randomNumber = rand.nextInt(9999);
		  System.out.println(randomNumber);
		return randomNumber;
	  }
	public static String getUsernameForRole1(String userRole, String loginType) {
		String username = null;

		if (loginType == null) {
			if (userRole.equalsIgnoreCase(DataConstants.ROLE_SUPER_ADMIN)) {

			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_EMPLOYEE)) {
				username = DataConstants.USERNAME_EM;
			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_PARTNER_ADMIN)) {
				username = DataConstants.USERNAME_PA;
			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				username = DataConstants.USERNAME_CU;
			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_RELATIONSHIP_MANAGER)) {
				username = DataConstants.USERNAME_RM;
			}
		}
		return username;
	}

	/**
	 * This method is used to get the username corresponding to the user role
	 * 
	 * @param userRole
	 * @param loginType
	 * @return String
	 */
	public static String getUsernameForRole(String userRole, String loginType) {
		String username = null;

		if (loginType == null) {
			if (userRole.equalsIgnoreCase(DataConstants.ROLE_SUPER_ADMIN)) {
				username = DataConstants.USERNAME_SA;
			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_EMPLOYEE)) {
				username = DataConstants.USERNAME_EM;
			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_PARTNER_ADMIN)) {
				username = DataConstants.USERNAME_PA;
			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				username = DataConstants.USERNAME_CU;
			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_RELATIONSHIP_MANAGER)) {
				username = DataConstants.USERNAME_RM;
			}
		} else {
			if (loginType.equalsIgnoreCase(DataConstants.LOGINTYPE_INVALID_USER)) {
				username = DataConstants.USERNAME_INVALID;
			} else if (loginType.equalsIgnoreCase(DataConstants.LOGINTYPE_INVALID_PASSWORD)) {
				username = DataConstants.USERNAME_CU; // giving a valid CU
														// username for invalid
														// password scenario
			}
		}
		return username;
	}

	/**
	 * This method is used to get the password corresponding to the user
	 * 
	 * @param userRole
	 * @param loginType
	 * @return String
	 */
	public static String getPasswordForRole(String userRole, String loginType) {
		String password = null;
		if (loginType == null) {
			if (userRole.equalsIgnoreCase(DataConstants.ROLE_SUPER_ADMIN)) {
				password = DataConstants.PASSWORD_SA;
			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_EMPLOYEE)) {
				password = DataConstants.PASSWORD_EM;
			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_PARTNER_ADMIN)) {
				password = DataConstants.PASSWORD_PA;
			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				password = DataConstants.PASSWORD_CU;
			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_RELATIONSHIP_MANAGER)) {
				password = DataConstants.PASSWORD_RM;
			}
		} else {
			if (loginType.equalsIgnoreCase(DataConstants.LOGINTYPE_INVALID_USER)) {
				password = DataConstants.PASSWORD_CU; // giving a valid CU
														// password for invalid
														// user scenario
			} else if (loginType.equalsIgnoreCase(DataConstants.LOGINTYPE_INVALID_PASSWORD)) {
				password = DataConstants.PASSWORD_INVALID;
			}
		}
		return password;
	}

	/**
	 * Random names
	 * @return
	 */
	
	 private static String[] Beginning = { "David", "Larry", "Robert", "Mrok", "Shawn",
	         "Harry", "Wayne", "Philip", "Jeremy", "Richard", "William", "Johnny", "Terry", "Scott",
	         "Jesse", "Gary", "George", "Howard", "Richard", "Bobby", "Sean", "Raymond", "Carl",
	         "Keith", "Terry","Daniel","Brian","Wayne","Scott","Victor","Alan" };
	 
	   private static String[] Middle = { "Alan", "Jimmy", "Gary", "William", "Patrick", "Jeffrey",
	         "Dennis", "Gregory", "Joseph", "Donald", "Jerry", "Joseph", "Roy", "Jonathan", "Benjamin",
	         "Henry", "Philip", "Raymond", "Adam", "Keith" };
	   private static String[] End = { "Clarence", "Chris", "Craig", "Jeremy", "Louis", "Bruce", "Randy",
	         "Billy", "Joe", "Andrew", "Frank", "Ryan", "James","Eric"};
	   
	   private static Random rand = new Random();

	   public static String generateFirstName() {
            
		   return Beginning[rand.nextInt(Beginning.length)];
	   } 
		   public static String generateMiddleName() {
	            
			   return Middle[rand.nextInt(Middle.length)];
		   }
		   public static String generateLastName() {
	            
			   return End[rand.nextInt(End.length)];
		   }
				   
	      /*return Beginning[rand.nextInt(Beginning.length)] + 
	            Middle[rand.nextInt(Middle.length)]+
	            End[rand.nextInt(End.length)];*/

		   public static String getFirstName() {
				uniqueFirstName = generateFirstName();
				System.out.println("uniqueFirstName: " + uniqueFirstName);
				return uniqueFirstName;
			}
		   public static String getMiddleName() {
				uniqueMiddleName = generateMiddleName();
				System.out.println("uniqueMiddleName: " + uniqueMiddleName);
				return uniqueMiddleName;
			}
		   public static String getlastName() {
				uniqueLastName = generateLastName();
				System.out.println("uniqueLastName: " + uniqueLastName);
				return uniqueLastName;
			}
		   
	public static String randomIdentifier() {
		final String lexicon = "abcdefghijklmnopqrstuvwxyz";
		final java.util.Random rand = new java.util.Random();
		final Set<String> identifiers = new HashSet<String>();
		StringBuilder builder = new StringBuilder();
		String randomValue=null;
		while (builder.toString().length() == 0) {
			int length = rand.nextInt(5) + 5;
			for (int i = 0; i < length; i++) {
				builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
			}
			if (identifiers.contains(builder.toString())) {
				builder = new StringBuilder();
			}
			 randomValue =builder.toString();
		}
		return randomValue;
	}
	/**
	 * This method is used to get unique password
	 * 
	 * @return String
	 */
	public static String getUniquePassword() {
		uniquePassword = DataConstants.NEW_NAME + randomIdentifier();
		System.out.println("uniquePassword: " + uniquePassword);
		return uniquePassword;
	}
	
	/**
	 * This method is used to get unique name for the user during register first name
	 * 
	 * @return String
	 */
	public static String getUniqueRegisterFirstName() {
		uniqueRegisterFirstName = DataConstants.NEW_NAME + randomIdentifier();
		System.out.println("uniqueRegisterFirstName: " + uniqueRegisterFirstName);
		return uniqueRegisterFirstName;
	}
	/**
	 * This method is used to get unique name for the user during register Last name
	 * 
	 * @return String
	 */
	public static String getUniqueRegisterLastName() {
		uniqueRegisterLastName = DataConstants.NEW_NAME + randomIdentifier();
		System.out.println("uniqueRegisterLastName: " + uniqueRegisterLastName);
		return uniqueRegisterLastName;
	}
	
	
	/**
	 * This method is used to get unique name for the user during register first name
	 * 
	 * @return String
	 */
	public static String getAdultName() {
		uniqueAdultName = DataConstants.ADULT_NEW_NAME;
		//System.out.println("uniqueAdultName: " + uniqueAdultName);
		return uniqueAdultName;
	}
	
	/**
	 * This method is used to get unique account code for the user during
	 * account creation
	 * 
	 * @return String
	 */
	public static String getUniqueAccountCode() {
		uniqueAccountCode = DataConstants.NEW_ACCOUNT_CODE + getCurrentTimeInMillis();
		System.out.println("uniqueAccountCode: " + uniqueAccountCode);
		return uniqueAccountCode;
	}

	/**
	 * This method is used to get unique display name for the user during
	 * account creation
	 * 
	 * @return String
	 */
	public static String getUniqueDisplayName() {
		String uniqueDisplayName = DataConstants.NEW_ACCOUNT_DISPLAY_NAME + timeInMillis;
		System.out.println("uniqueDisplayName: " + uniqueDisplayName);
		return uniqueDisplayName;
	}
	
	
	
	/**
	 * This method is used to get unique display name for the user during
	 * account creation
	 * 
	 * @return String
	 */
	public static String getUniqueEmailId() {
		String strEmailId = DataConstants.NEW_ACCOUNT_EMAIL;
		getRandomNumbers();
		System.out.println("randomNumber:"+randomNumber);
		StringBuilder strBuilderEmailId = new StringBuilder(strEmailId);
		String uniqueEmailId = (strBuilderEmailId.insert(strEmailId.indexOf("@"), "+" +randomNumber)).toString();
		System.out.println("uniqueEmailId: " + uniqueEmailId);
		return uniqueEmailId;
	}

	/**
	 * This method is used to get unique name for the automation activities
	 * 
	 * @return String
	 */
	public static String getUniqueName() {
		uniqueName = DataConstants.NEW_NAME + getCurrentTimeInMillis();
		System.out.println("uniqueName: " + uniqueName);
		return uniqueName;
	}
}
