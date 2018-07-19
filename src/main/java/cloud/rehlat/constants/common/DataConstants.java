package cloud.rehlat.constants.common;

import java.io.File;

public class DataConstants {
	//User role codes
	public static final String ROLE_SUPER_ADMIN = "SA";
	public static final String ROLE_PARTNER_ADMIN = "PA";
	public static final String ROLE_CUSTOMER = "CU";
	public static final String ROLE_EMPLOYEE = "EM";
	public static final String ROLE_RELATIONSHIP_MANAGER = "RM";
	public static final String ROLE_CUSTOMER_LS = "CU_LS";
	public static final String USERNAME_SA = "automation_sa";
	public static final String USERNAME_EM = "automation_emp";
	public static final String USERNAME_PA = "automation_pa";
	public static final String USERNAME_CU = "canopy_static";
	public static final String USERNAME_RM = "automation_rm";
	public static final String USERNAME_CU_LS = "automation_cu";
	
	
	public static final String USER_PHONE_NUMBER = "9030220071";
	public static final String USER_SELECT_DATE = "22";
	
	//Arabic
	public static final String USER_SELECT_ARABIC_DATE = "١٩";
	
	public static final String GMAIL_USERNAME = "naga.ch199@gmail.com";
	public static final String GMAIL_PASSWORD = "naga@qtselenium88";
	
	//
	public static final String USERNAME_My = "automation_cu"; 
	
	//Passwords for different users
	public static final String PASSWORD_SA = "Automation$123";
	public static final String PASSWORD_EM = "Automation$123";
	public static final String PASSWORD_PA = "Automation$123";
	public static final String PASSWORD_CU = "cAn0pyStat!c";
	public static final String PASSWORD_RM = "Automation$123";
	public static final String PASSWORD_CU_LS = "Automation$123";
	
	public static final String DISPLAY_NAME_SA = "automation_sa";
	public static final String DISPLAY_NAME_PA = "automation_pa";
	public static final String DISPLAY_NAME_RM = "automation_rm";
	public static final String DISPLAY_NAME_CU = "For automated testing. Pls dun change ($cAn0pystat)";
	
	//Login type
	public static final String LOGINTYPE_INVALID_USER = "invalidUser";
	public static final String LOGINTYPE_INVALID_PASSWORD = "invalidPassword";
	
	//Invalid login credentials
	public static final String USERNAME_INVALID = "wrong_user";
	public static final String PASSWORD_INVALID = "abcdefghi";
	
	//New Parent Account Details
	public static final String NEW_ACCOUNT_CODE = "automation";
	public static final String NEW_ACCOUNT_DISPLAY_NAME = "automation";
	public static final String NEW_ACCOUNT_PASSWORD = "TestAutomation@1";
	public static final String NEW_ACCOUNT_EMAIL = "automation@gmail.com";
	public static final String AUTOMATION_EMAIL_PASSWORD = "JhumriTilaiya@001";
	public static final String NEW_ACCOUNT_CURRENCY = "SGD";
	public static final String NEW_NAME = "automation";
	public static final String NEW_REGISTER_PASSWORD = "TestAutomation@1";
	
	//Paths of files to upload
	public static final String CANOPY_DOCUMENT_PATH = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator +
			"resources" + File.separator + "cloud" + File.separator + "canopy" + File.separator + "documents" + File.separator + "visualizer" + File.separator;
}
