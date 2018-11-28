package cloud.rehlat.pages.Hotels.english;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.DataConstants;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;

public class TravellerInformation_HotelsPage {
	public WebDriver driver;
	private PageUtils pageUtils;
	String firstName;
	String middleName;
	String lastName;

	public TravellerInformation_HotelsPage(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}

	// Room 1 Adult details
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[0].FirstName")
	private WebElement R1_adult1_firstName;
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[1].FirstName")
	private WebElement R1_adult2_firstName;
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[2].FirstName")
	private WebElement R1_adult3_firstName;
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[3].FirstName")
	private WebElement R1_adult4_firstName;
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[4].FirstName")
	private WebElement R1_child1_firstName;
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[5].FirstName")
	private WebElement R1_child2_firstName;

	@FindBy(name = "BookingConfirmationRoomList[0].Pax[0].LastName")
	private WebElement R1_adult1_lastName;
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[1].LastName")
	private WebElement R1_adult2_lastName;
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[2].LastName")
	private WebElement R1_adult3_lastName;
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[3].LastName")
	private WebElement R1_adult4_lastName;
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[4].LastName")
	private WebElement R1_child1_lastName;
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[5].LastName")
	private WebElement R1_child2_lastName;

	@FindBy(name = "BookingConfirmationRoomList[0].Pax[0].Gender")
	private WebElement R1_adult1_gender;
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[1].Gender")
	private WebElement R1_adult2_gender;
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[2].Gender")
	private WebElement R1_adult3_gender;
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[3].Gender")
	private WebElement R1_adult4_gender;
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[4].Gender")
	private WebElement R1_child1_gender;
	@FindBy(name = "BookingConfirmationRoomList[0].Pax[5].Gender")
	private WebElement R1_child2_gender;

	// Room 2 Adult details
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[0].FirstName")
	private WebElement R2_adult1_firstName;
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[1].FirstName")
	private WebElement R2_adult2_firstName;
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[2].FirstName")
	private WebElement R2_adult3_firstName;
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[3].FirstName")
	private WebElement R2_adult4_firstName;
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[4].FirstName")
	private WebElement R2_child1_firstName;
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[5].FirstName")
	private WebElement R2_child2_firstName;

	@FindBy(name = "BookingConfirmationRoomList[1].Pax[0].LastName")
	private WebElement R2_adult1_lastName;
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[1].LastName")
	private WebElement R2_adult2_lastName;
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[2].LastName")
	private WebElement R2_adult3_lastName;
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[3].LastName")
	private WebElement R2_adult4_lastName;
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[4].LastName")
	private WebElement R2_child1_lastName;
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[5].LastName")
	private WebElement R2_child2_lastName;

	@FindBy(name = "BookingConfirmationRoomList[1].Pax[0].Gender")
	private WebElement R2_adult1_gender;
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[1].Gender")
	private WebElement R2_adult2_gender;
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[2].Gender")
	private WebElement R2_adult3_gender;
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[3].Gender")
	private WebElement R2_adult4_gender;
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[4].Gender")
	private WebElement R2_child1_gender;
	@FindBy(name = "BookingConfirmationRoomList[1].Pax[5].Gender")
	private WebElement R2_child2_gender;

	// Room 3 Adult details
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[0].FirstName")
	private WebElement R3_adult1_firstName;
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[1].FirstName")
	private WebElement R3_adult2_firstName;
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[2].FirstName")
	private WebElement R3_adult3_firstName;
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[3].FirstName")
	private WebElement R3_adult4_firstName;
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[4].FirstName")
	private WebElement R3_child1_firstName;
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[5].FirstName")
	private WebElement R3_child2_firstName;

	@FindBy(name = "BookingConfirmationRoomList[2].Pax[0].LastName")
	private WebElement R3_adult1_lastName;
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[1].LastName")
	private WebElement R3_adult2_lastName;
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[2].LastName")
	private WebElement R3_adult3_lastName;
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[3].LastName")
	private WebElement R3_adult4_lastName;
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[4].LastName")
	private WebElement R3_child1_lastName;
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[5].LastName")
	private WebElement R3_child2_lastName;

	@FindBy(name = "BookingConfirmationRoomList[2].Pax[0].Gender")
	private WebElement R3_adult1_gender;
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[1].Gender")
	private WebElement R3_adult2_gender;
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[2].Gender")
	private WebElement R3_adult3_gender;
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[3].Gender")
	private WebElement R3_adult4_gender;
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[4].Gender")
	private WebElement R3_child1_gender;
	@FindBy(name = "BookingConfirmationRoomList[2].Pax[5].Gender")
	private WebElement R3_child2_gender;

	// Room 4 Adult details
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[0].FirstName")
	private WebElement R4_adult1_firstName;
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[1].FirstName")
	private WebElement R4_adult2_firstName;
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[2].FirstName")
	private WebElement R4_adult3_firstName;
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[3].FirstName")
	private WebElement R4_adult4_firstName;
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[4].FirstName")
	private WebElement R4_child1_firstName;
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[5].FirstName")
	private WebElement R4_child2_firstName;

	@FindBy(name = "BookingConfirmationRoomList[3].Pax[0].LastName")
	private WebElement R4_adult1_lastName;
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[1].LastName")
	private WebElement R4_adult2_lastName;
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[2].LastName")
	private WebElement R4_adult3_lastName;
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[3].LastName")
	private WebElement R4_adult4_lastName;
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[4].LastName")
	private WebElement R4_child1_lastName;
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[5].LastName")
	private WebElement R4_child2_lastName;

	@FindBy(name = "BookingConfirmationRoomList[3].Pax[0].Gender")
	private WebElement R4_adult1_gender;
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[1].Gender")
	private WebElement R4_adult2_gender;
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[2].Gender")
	private WebElement R4_adult3_gender;
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[3].Gender")
	private WebElement R4_adult4_gender;
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[4].Gender")
	private WebElement R4_child1_gender;
	@FindBy(name = "BookingConfirmationRoomList[3].Pax[5].Gender")
	private WebElement R4_child2_gender;

	// Room 5 Adult details
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[0].FirstName")
	private WebElement R5_adult1_firstName;
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[1].FirstName")
	private WebElement R5_adult2_firstName;
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[2].FirstName")
	private WebElement R5_adult3_firstName;
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[3].FirstName")
	private WebElement R5_adult4_firstName;
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[4].FirstName")
	private WebElement R5_child1_firstName;
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[5].FirstName")
	private WebElement R5_child2_firstName;

	@FindBy(name = "BookingConfirmationRoomList[4].Pax[0].LastName")
	private WebElement R5_adult1_lastName;
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[1].LastName")
	private WebElement R5_adult2_lastName;
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[2].LastName")
	private WebElement R5_adult3_lastName;
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[3].LastName")
	private WebElement R5_adult4_lastName;
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[4].LastName")
	private WebElement R5_child1_lastName;
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[5].LastName")
	private WebElement R5_child2_lastName;

	@FindBy(name = "BookingConfirmationRoomList[4].Pax[0].Gender")
	private WebElement R5_adult1_gender;
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[1].Gender")
	private WebElement R5_adult2_gender;
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[2].Gender")
	private WebElement R5_adult3_gender;
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[3].Gender")
	private WebElement R5_adult4_gender;
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[4].Gender")
	private WebElement R5_child1_gender;
	@FindBy(name = "BookingConfirmationRoomList[4].Pax[5].Gender")
	private WebElement R5_child2_gender;

	public void room1_Adult1() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R1_adult1_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R1_adult1_lastName, lastName);
		pageUtils.selectByVisibleText(R1_adult1_gender, "Male");

	}

	public void room1_Adult2() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R1_adult2_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R1_adult2_lastName, lastName);
		pageUtils.selectByVisibleText(R1_adult2_gender, "Male");

	}

	public void room1_Adult3() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R1_adult3_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R1_adult3_lastName, lastName);
		pageUtils.selectByVisibleText(R1_adult3_gender, "Male");

	}

	public void room1_Adult4() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R1_adult4_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R1_adult4_lastName, lastName);
		pageUtils.selectByVisibleText(R1_adult4_gender, "Male");

	}
	
	//
	public void room2_Adult1() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R2_adult1_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R2_adult1_lastName, lastName);
		pageUtils.selectByVisibleText(R2_adult1_gender, "Male");

	}

	public void room2_Adult2() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R2_adult2_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R2_adult2_lastName, lastName);
		pageUtils.selectByVisibleText(R2_adult2_gender, "Male");

	}

	public void room2_Adult3() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R2_adult3_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R2_adult3_lastName, lastName);
		pageUtils.selectByVisibleText(R2_adult3_gender, "Male");

	}

	public void room2_Adult4() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R2_adult4_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R2_adult4_lastName, lastName);
		pageUtils.selectByVisibleText(R2_adult4_gender, "Male");

	}
	
	///
	public void room3_Adult1() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R3_adult1_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R3_adult1_lastName, lastName);
		pageUtils.selectByVisibleText(R3_adult1_gender, "Male");

	}

	public void room3_Adult2() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R3_adult2_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R3_adult2_lastName, lastName);
		pageUtils.selectByVisibleText(R3_adult2_gender, "Male");

	}

	public void room3_Adult3() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R3_adult3_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R3_adult3_lastName, lastName);
		pageUtils.selectByVisibleText(R3_adult3_gender, "Male");

	}

	public void room3_Adult4() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R3_adult4_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R3_adult4_lastName, lastName);
		pageUtils.selectByVisibleText(R3_adult4_gender, "Male");

	}
////
	public void room4_Adult1() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R4_adult1_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R4_adult1_lastName, lastName);
		pageUtils.selectByVisibleText(R4_adult1_gender, "Male");

	}

	public void room4_Adult2() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R4_adult2_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R4_adult2_lastName, lastName);
		pageUtils.selectByVisibleText(R4_adult2_gender, "Male");

	}

	public void room4_Adult3() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R4_adult3_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R4_adult3_lastName, lastName);
		pageUtils.selectByVisibleText(R4_adult3_gender, "Male");

	}

	public void room4_Adult4() {
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, R4_adult4_firstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, R4_adult4_lastName, lastName);
		pageUtils.selectByVisibleText(R4_adult4_gender, "Male");

	}
	
	/////
		public void room5_Adult1() {
			randomNames();
			pageUtils.sendKeysAfterClearingElement(driver, R5_adult1_firstName, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, R5_adult1_lastName, lastName);
			pageUtils.selectByVisibleText(R5_adult1_gender, "Male");

		}

		public void room5_Adult2() {
			randomNames();
			pageUtils.sendKeysAfterClearingElement(driver, R5_adult2_firstName, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, R5_adult2_lastName, lastName);
			pageUtils.selectByVisibleText(R5_adult2_gender, "Male");

		}

		public void room5_Adult3() {
			randomNames();
			pageUtils.sendKeysAfterClearingElement(driver, R5_adult3_firstName, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, R5_adult3_lastName, lastName);
			pageUtils.selectByVisibleText(R5_adult3_gender, "Male");

		}

		public void room5_Adult4() {
			randomNames();
			pageUtils.sendKeysAfterClearingElement(driver, R5_adult4_firstName, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, R5_adult4_lastName, lastName);
			pageUtils.selectByVisibleText(R5_adult4_gender, "Male");

		}

	public void adultDetails(Map<String, String> dataMap) {
		String numofRooms = dataMap.get("rooms");
		if (numofRooms.equals("1")) {
			if (DataConstants.R1_NUM_ADULTS.equals("1")) {
				room1_Adult1();
			} else if (DataConstants.R1_NUM_ADULTS.equals("2")) {
				room1_Adult1();
				room1_Adult2();
			} else if (DataConstants.R1_NUM_ADULTS.equals("3")) {
				room1_Adult1();
				room1_Adult2();
				room1_Adult3();
			} else if (DataConstants.R1_NUM_ADULTS.equals("4")) {
				room1_Adult1();
				room1_Adult2();
				room1_Adult3();
				room1_Adult4();
			}
		}
		else if (numofRooms.equals("2")) {
			if (DataConstants.R2_NUM_ADULTS.equals("1")) {
				room1_Adult1();
				room2_Adult1();
			} else if (DataConstants.R2_NUM_ADULTS.equals("2")) {
				room1_Adult1();
				room2_Adult1();
				room1_Adult2();
				room2_Adult2();
			} else if (DataConstants.R2_NUM_ADULTS.equals("3")) {
				room1_Adult1();
				room2_Adult1();
				room1_Adult2();
				room2_Adult2();
				room1_Adult3();
				room2_Adult3();
			} else if (DataConstants.R2_NUM_ADULTS.equals("4")) {
				room1_Adult1();
				room2_Adult1();
				room1_Adult2();
				room2_Adult2();
				room1_Adult3();
				room2_Adult3();
				room1_Adult4();
				room2_Adult4();
			}
		}
		else if (numofRooms.equals("3")) {
			if (DataConstants.R3_NUM_ADULTS.equals("1")) {
				room1_Adult1();
				room2_Adult1();
				room3_Adult1();
			} else if (DataConstants.R3_NUM_ADULTS.equals("2")) {
				room1_Adult1();
				room2_Adult1();
				room3_Adult1();
				room1_Adult2();
				room2_Adult2();
				room3_Adult2();
			} else if (DataConstants.R3_NUM_ADULTS.equals("3")) {
				room1_Adult1();
				room2_Adult1();
				room3_Adult1();
				room1_Adult2();
				room2_Adult2();
				room3_Adult2();
				room1_Adult3();
				room2_Adult3();
				room3_Adult3();
			} else if (DataConstants.R3_NUM_ADULTS.equals("4")) {
				room1_Adult1();
				room2_Adult1();
				room3_Adult1();
				room1_Adult2();
				room2_Adult2();
				room3_Adult2();
				room1_Adult3();
				room2_Adult3();
				room3_Adult3();
				room1_Adult4();
				room2_Adult4();
				room3_Adult4();
			}
		}
		else if (numofRooms.equals("4")) {
			if (DataConstants.R4_NUM_ADULTS.equals("1")) {
				room1_Adult1();
				room2_Adult1();
				room3_Adult1();
				room4_Adult1();
			} else if (DataConstants.R4_NUM_ADULTS.equals("2")) {
				room1_Adult1();
				room2_Adult1();
				room3_Adult1();
				room4_Adult1();
				room1_Adult2();
				room2_Adult2();
				room3_Adult2();
				room4_Adult2();
			} else if (DataConstants.R4_NUM_ADULTS.equals("3")) {
				room1_Adult1();
				room2_Adult1();
				room3_Adult1();
				room4_Adult1();
				room1_Adult2();
				room2_Adult2();
				room3_Adult2();
				room4_Adult2();
				room1_Adult3();
				room2_Adult3();
				room3_Adult3();
				room4_Adult3();
			} else if (DataConstants.R4_NUM_ADULTS.equals("4")) {
				room1_Adult1();
				room2_Adult1();
				room3_Adult1();
				room4_Adult1();
				room1_Adult2();
				room2_Adult2();
				room3_Adult2();
				room4_Adult2();
				room1_Adult3();
				room2_Adult3();
				room3_Adult3();
				room4_Adult3();
				room1_Adult4();
				room2_Adult4();
				room3_Adult4();
				room4_Adult4();
			}
		}
		else if (numofRooms.equals("5")) {
			if (DataConstants.R5_NUM_ADULTS.equals("1")) {
				room1_Adult1();
				room2_Adult1();
				room3_Adult1();
				room4_Adult1();
				room5_Adult1();
			} else if (DataConstants.R5_NUM_ADULTS.equals("2")) {
				room1_Adult1();
				room2_Adult1();
				room3_Adult1();
				room4_Adult1();
				room5_Adult1();
				room1_Adult2();
				room2_Adult2();
				room3_Adult2();
				room4_Adult2();
				room5_Adult2();
			} else if (DataConstants.R5_NUM_ADULTS.equals("3")) {
				room1_Adult1();
				room2_Adult1();
				room3_Adult1();
				room4_Adult1();
				room5_Adult1();
				room1_Adult2();
				room2_Adult2();
				room3_Adult2();
				room4_Adult2();
				room5_Adult2();
				room1_Adult3();
				room2_Adult3();
				room3_Adult3();
				room4_Adult3();
				room5_Adult3();
			} else if (DataConstants.R5_NUM_ADULTS.equals("4")) {
				room1_Adult1();
				room2_Adult1();
				room3_Adult1();
				room4_Adult1();
				room5_Adult1();
				room1_Adult2();
				room2_Adult2();
				room3_Adult2();
				room4_Adult2();
				room5_Adult2();
				room1_Adult3();
				room2_Adult3();
				room3_Adult3();
				room4_Adult3();
				room5_Adult3();
				room1_Adult4();
				room2_Adult4();
				room3_Adult4();
				room4_Adult4();
				room5_Adult4();
			}
		}
	}

	/**
	 * this method is used to generate random values for Adults,Childs,Infants
	 */
	public void randomNames() {
		firstName = TestDataUtils.getFirstName();
		middleName = TestDataUtils.getMiddleName();
		lastName = TestDataUtils.getlastName();
	}

}
