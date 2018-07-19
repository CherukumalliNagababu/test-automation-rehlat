package cloud.rehlat.utils;

import cloud.rehlat.constants.common.DataConstants;


public class TestDataUtils {
	private static long timeInMillis;
	public static String uniqueAccountCode;
	public static String rmAccountCode;
	public static String firstParentAccount;
	public static String firstChildAccount;
	public static String secondParentAccount;
	public static String secondChildAccount;
	public static String uniqueSecurityCode;
	public static String uniqueName;
	
	public static long getCurrentTimeInMillis() {
		timeInMillis = System.currentTimeMillis();
		return timeInMillis;
		
	}
	
	
	
	
	public static String getUsernameForRole1(String userRole, String loginType) {
		String username = null;

		if(loginType==null) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_SUPER_ADMIN)) {
				
				
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_EMPLOYEE)) {
				username = DataConstants.USERNAME_EM;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_PARTNER_ADMIN)) {
				username = DataConstants.USERNAME_PA;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				username = DataConstants.USERNAME_CU;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_RELATIONSHIP_MANAGER)) {
				username = DataConstants.USERNAME_RM;
			} 
		}return username;
		}
	
	

	/**
	 * This method is used to get the username corresponding to the user role
	 * @param userRole
	 * @param loginType
	 * @return String
	 */
	public static String getUsernameForRole(String userRole, String loginType) {
		String username = null;

		if(loginType==null) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_SUPER_ADMIN)) {
				username = DataConstants.USERNAME_SA;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_EMPLOYEE)) {
				username = DataConstants.USERNAME_EM;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_PARTNER_ADMIN)) {
				username = DataConstants.USERNAME_PA;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				username = DataConstants.USERNAME_CU;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_RELATIONSHIP_MANAGER)) {
				username = DataConstants.USERNAME_RM;
			} 
		} else {
			if(loginType.equalsIgnoreCase(DataConstants.LOGINTYPE_INVALID_USER)) {
				username = DataConstants.USERNAME_INVALID;
			} else if(loginType.equalsIgnoreCase(DataConstants.LOGINTYPE_INVALID_PASSWORD)) {
				username = DataConstants.USERNAME_CU;			// giving a valid CU username for invalid password scenario
			}
		}
		return username;
	}

	/**
	 * This method is used to get the password corresponding to the user
	 * @param userRole
	 * @param loginType
	 * @return String
	 */
	public static String getPasswordForRole(String userRole, String loginType) {
		String password = null;
		if(loginType==null) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_SUPER_ADMIN)) {
				password = DataConstants.PASSWORD_SA;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_EMPLOYEE)) {
				password = DataConstants.PASSWORD_EM;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_PARTNER_ADMIN)) {
				password = DataConstants.PASSWORD_PA;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				password = DataConstants.PASSWORD_CU;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_RELATIONSHIP_MANAGER)) {
				password = DataConstants.PASSWORD_RM;
			}	
		} else {
			if(loginType.equalsIgnoreCase(DataConstants.LOGINTYPE_INVALID_USER)) {
				password = DataConstants.PASSWORD_CU;									// giving a valid CU password for invalid user scenario
			} else if(loginType.equalsIgnoreCase(DataConstants.LOGINTYPE_INVALID_PASSWORD)) {
				password = DataConstants.PASSWORD_INVALID;			
			}
		}
		return password;
	}

	
	
	
	
	/**
	 * This method is used to get unique account code for the user during account creation
	 * @return String
	 */
	public static String getUniqueAccountCode() {
		uniqueAccountCode = DataConstants.NEW_ACCOUNT_CODE + getCurrentTimeInMillis();
		System.out.println("uniqueAccountCode: "+uniqueAccountCode);
		return uniqueAccountCode;
	}

	/**
	 * This method is used to get unique display name for the user during account creation
	 * @return String
	 */
	public static String getUniqueDisplayName() {
		String uniqueDisplayName = DataConstants.NEW_ACCOUNT_DISPLAY_NAME + timeInMillis;
		System.out.println("uniqueDisplayName: "+uniqueDisplayName);
		return uniqueDisplayName;
	}

	/**
	 * This method is used to get unique display name for the user during account creation
	 * @return String
	 */
	public static String getUniqueEmailId() {
		String strEmailId = DataConstants.NEW_ACCOUNT_EMAIL;
		StringBuilder strBuilderEmailId = new StringBuilder(strEmailId);
		String uniqueEmailId = (strBuilderEmailId.insert(strEmailId.indexOf("@"), "+" + timeInMillis)).toString();
		System.out.println("uniqueEmailId: "+uniqueEmailId);
		return uniqueEmailId;
	}
	
	/**
	 * This method is used to get unique name for the automation activities
	 * @return String
	 */
	public static String getUniqueName() {
		uniqueName = DataConstants.NEW_NAME + getCurrentTimeInMillis();
		System.out.println("uniqueName: "+uniqueName);
		return uniqueName;
	}
}
