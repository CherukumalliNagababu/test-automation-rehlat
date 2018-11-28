package cloud.rehlat.constants.common;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import cloud.rehlat.utils.BrowserUtils;

public class DataConstants {
	// User role codes
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
	
	
	//
	public static final String ROLE_SA = "SA";
	public static final String ROLE_COM = "COM";
	public static final String ROLE_AE= "AE";
	public static final String ROLE_EG = "EG";
	
	//Environments for Engine Titles
		public static final String ENV_PRD = "PRD";
		public static final String ENV_TST = "TST";
		public static final String ENV_STG = "STG";

	public static final String USER_PHONE_NUMBER = "9030220071";
	public static final String USER_SELECT_DATE = "10";
	public static final String USER_SELECT_DATE1 = "12";
	// Hotels
	public static final String USER_SELECT_CHECK_IN_DATE = "10";
	public static final String USER_SELECT_CHECK_OUT_DATE = "14";

	// Hotels
	// Room1
	public static final String R1_NUM_ADULTS = "1";
	public static final String R1_NUM_CHILDS = "1";
	public static final String R1_CHILDS1_AGE = "12";
	public static final String R1_CHILDS2_AGE = "13";
	// Room2
	public static final String R2_NUM_ADULTS = "2";
	public static final String R2_NUM_CHILDS = "1";
	public static final String R2_CHILDS1_AGE = "12";
	public static final String R2_CHILDS2_AGE = "13";
	// Room3
	public static final String R3_NUM_ADULTS = "2";
	public static final String R3_NUM_CHILDS = "1";
	public static final String R3_CHILDS1_AGE = "12";
	public static final String R3_CHILDS2_AGE = "13";
	// Room4
	public static final String R4_NUM_ADULTS = "3";
	public static final String R4_NUM_CHILDS = "2";
	public static final String R4_CHILDS1_AGE = "12";
	public static final String R4_CHILDS2_AGE = "13";
	// Room5
	public static final String R5_NUM_ADULTS = "4";
	public static final String R5_NUM_CHILDS = "1";
	public static final String R5_CHILDS1_AGE = "12";
	public static final String R5_CHILDS2_AGE = "13";

	// Arabic
	public static final String USER_SELECT_ARABIC_DATE = "١٩";

	public static final String GMAIL_USERNAME = "naga.ch199@gmail.com";
	public static final String GMAIL_PASSWORD = "naga@qtselenium88";
//FB
	public static final String  FACEBOOK_USERNAME = "123456789";
	public static final String FACEBOOK_PASSWORD = "123456789";
	
	//Forgot password email
	public static final String FORGOT_MAIL_USERNAME = "qa.automationrehlat@gmail.com";
	
	//
	public static final String USERNAME_My = "automation_cu";

	// Passwords for different users
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

	// Login type
	public static final String LOGINTYPE_INVALID_USER = "invalidUser";
	public static final String LOGINTYPE_INVALID_PASSWORD = "invalidPassword";

	// Invalid login credentials
	public static final String USERNAME_INVALID = "wrong_user";
	public static final String PASSWORD_INVALID = "abcdefghi";

	// New Parent Account Details
	public static final String NEW_ACCOUNT_CODE = "automation";
	public static final String NEW_ACCOUNT_DISPLAY_NAME = "automation";
	public static final String NEW_ACCOUNT_PASSWORD = "TestAutomation@1";
	public static final String NEW_ACCOUNT_EMAIL = "automation@gmail.com";
	public static final String AUTOMATION_EMAIL_PASSWORD = "JhumriTilaiya@001";
	public static final String NEW_ACCOUNT_CURRENCY = "SGD";
	public static final String NEW_NAME = "automation";
	public static final String NEW_REGISTER_PASSWORD = "TestAutomation@1";
	public static final String ADULT_NEW_NAME = "David";
	public static final String CHILD_NEW_NAME = "test";
	
	public static final String featurePath ="src/test/resources/features/flight/english/OneWay.feature";

	// Paths of files to upload
	public static final String CANOPY_DOCUMENT_PATH = System.getProperty("user.dir") + File.separator + "src"
			+ File.separator + "main" + File.separator + "resources" + File.separator + "cloud" + File.separator
			+ "canopy" + File.separator + "documents" + File.separator + "visualizer" + File.separator;


	/**
	 * Get the path to the document resources based on availability of shared storage (In the case of k8s & grid)
	 * @return {String} the absolute path to the documents folder
	 */
	private static String getDocumentPath() {
		String resourcesPath = System.getenv("RESOURCES_PATH");
		if (resourcesPath == null || resourcesPath.trim().isEmpty() || !Files.exists(Paths.get(resourcesPath))) {
			Path currentPath = Paths.get(System.getProperty("user.dir"));
			return Paths.get(currentPath.toString(), "src", "main", "resources", "cloud", "Rehlat", "documents").toString();
		}
		return Paths.get(resourcesPath, "cloud", "canopy", "documents").toString();
	}

	public static String getDownloadsPath() {
		String resourcesPath = System.getenv("RESOURCES_PATH");
		if (resourcesPath == null || resourcesPath.trim().isEmpty() || !Files.exists(Paths.get(resourcesPath))) {
			return System.getProperty("user.dir").replace("\\", "/") + "/downloads";
		}
		return Paths.get(resourcesPath, "downloads").toString();
	}

	
	/**
	 * Get the path to a engine document
	 * @param file {String} The filename
	 * @return {String} the absolute path to the document file
	 */
	public static String getDocumentPath(String file) {
		return Paths.get(getDocumentPath(), "Flights", file).toString();
	}


}
