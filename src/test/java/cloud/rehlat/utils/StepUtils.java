package cloud.rehlat.utils;

import java.util.Map;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.constants.common.DataConstants;
import cloud.rehlat.constants.engine.EngineConstants;
import cucumber.api.DataTable;

public class StepUtils {

	/**
	 * This method is used to get Map from the datatable passed from Cucumber 
	 * @param dataTable
	 * @return Map<String, String>
	 */
	protected Map<String, String> getDataAsMap(DataTable dataTable) {
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		return dataMap;
	}

	/**
	 * This method gets the URL extension from the Constants file for the specific navigation on Visualizer
	 * @param dataMap
	 * @return String
	 */
	/*protected String getUrlExtension(Map<String, String> dataMap) {
		String userRole = dataMap.get("userRole");
		String navigateTo = dataMap.get("navigationTo");
		String assetClass = dataMap.get("assetClass");
		String urlExtension = null;

		if(navigateTo.equalsIgnoreCase(BrowserConstants.DASHBOARD)) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_SUPER_ADMIN)) {
				urlExtension = BrowserConstants.URL_EXT_DASHBOARD_SA;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_PARTNER_ADMIN)) {
				urlExtension = BrowserConstants.URL_EXT_DASHBOARD_PA;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				urlExtension = BrowserConstants.URL_EXT_DASHBOARD_CU;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_RELATIONSHIP_MANAGER)) {
				urlExtension = BrowserConstants.URL_EXT_DASHBOARD_RM;
			} 
		} else if(navigateTo.equalsIgnoreCase(BrowserConstants.ADMIN_TO_DASHBOARD)) {
				urlExtension = BrowserConstants.URL_EXT_DASHBOARD_CU;
		} else if(navigateTo.equalsIgnoreCase(BrowserConstants.EXPLAINER)) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				urlExtension = BrowserConstants.URL_EXT_EXPLAINER_CU;
			}
		} else if(navigateTo.equalsIgnoreCase(BrowserConstants.WATCHLIST)) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				urlExtension = BrowserConstants.URL_EXT_WATCHLISTS_CU;
			}
		} else if(navigateTo.equalsIgnoreCase(BrowserConstants.ALLOCATIONS)) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				urlExtension = BrowserConstants.URL_EXT_ALLOCATIONS_CU;
			}
		} else if(navigateTo.equalsIgnoreCase(BrowserConstants.PERFORMANCE)) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				urlExtension = BrowserConstants.URL_EXT_PERFORMANCE_CU;
			}
		}else if(navigateTo.equalsIgnoreCase(BrowserConstants.HOLDINGS)) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				urlExtension = BrowserConstants.URL_EXT_HOLDINGS_CU;
			}
		}else if(navigateTo.equalsIgnoreCase(BrowserConstants.MATRIX)) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				urlExtension = BrowserConstants.URL_EXT_MATRIX_CU;
			}
		}else if(navigateTo.equalsIgnoreCase(BrowserConstants.HISTORY)) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				urlExtension = BrowserConstants.URL_EXT_HISTORY_CU;
			}
		}else if(navigateTo.equalsIgnoreCase(BrowserConstants.TRANSACTIONS)) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				urlExtension = BrowserConstants.URL_EXT_TRANSACTIONS_CU;
			}
		}else if(navigateTo.equalsIgnoreCase(BrowserConstants.CASHFLOWS)) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				urlExtension = BrowserConstants.URL_EXT_CASHFLOWS_CU;
			}
		}else if(navigateTo.equalsIgnoreCase(BrowserConstants.ANALYTICS)) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				urlExtension = BrowserConstants.URL_EXT_ANALYTICS_CU;
			}
		}else if(navigateTo.equalsIgnoreCase(BrowserConstants.EXPLAINER)) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				urlExtension = BrowserConstants.URL_EXT_EXPLAINER_CU;
			}
		}else if(navigateTo.equalsIgnoreCase(BrowserConstants.DOCUMENTS)) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				urlExtension = BrowserConstants.URL_EXT_DOCUMENTS_CU;
			}
		}else if(navigateTo.equalsIgnoreCase(BrowserConstants.GENERATE_REPORTS)) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				urlExtension = BrowserConstants.URL_EXT_GENERATE_REPORTS_CU;
			}
		}else if(navigateTo.equalsIgnoreCase(BrowserConstants.ASSET_CLASS)) {
			if(assetClass.equalsIgnoreCase(AppConstants.ASSET_CLASS_CASH)) {
				urlExtension = BrowserConstants.URL_EXT_ASSET_CLASS_CASH;
			} else if(assetClass.equalsIgnoreCase(AppConstants.ASSET_CLASS_BOND)) {
				urlExtension = BrowserConstants.URL_EXT_ASSET_CLASS_BOND;
			} else if(assetClass.equalsIgnoreCase(AppConstants.ASSET_CLASS_EQUITY)) {
				urlExtension = BrowserConstants.URL_EXT_ASSET_CLASS_EQUITY;
			} else if(assetClass.equalsIgnoreCase(AppConstants.ASSET_CLASS_FUND)) {
				urlExtension = BrowserConstants.URL_EXT_ASSET_CLASS_FUND;
			} else if(assetClass.equalsIgnoreCase(AppConstants.ASSET_CLASS_LOAN)) {
				urlExtension = BrowserConstants.URL_EXT_ASSET_CLASS_LOAN;
			} else if(assetClass.equalsIgnoreCase(AppConstants.ASSET_CLASS_REAL_ESTATE)) {
				urlExtension = BrowserConstants.URL_EXT_ASSET_CLASS_REAL_ESTATE;
			} else if(assetClass.equalsIgnoreCase(AppConstants.ASSET_CLASS_DERIVATIVE)) {
				urlExtension = BrowserConstants.URL_EXT_ASSET_CLASS_DERIVATIVE;
			} else if(assetClass.equalsIgnoreCase(AppConstants.ASSET_CLASS_INSURANCE)) {
				urlExtension = BrowserConstants.URL_EXT_ASSET_CLASS_INSURANCE;
			} else if(assetClass.equalsIgnoreCase(AppConstants.ASSET_CLASS_DEPOSIT)) {
				urlExtension = BrowserConstants.URL_EXT_ASSET_CLASS_DEPOSIT;
			} 
		}
		return urlExtension;
	}
	*/

	/**
	 * This method compares and validates the expected and actual data are equal or not 
	 * @param expectedString
	 * @param actualString
	 * @return
	 */
	public boolean validateStringData(String expectedString, String actualString) {
		boolean status = false;
		if(expectedString.equalsIgnoreCase(actualString)) {
			status = true;
		}
		return status;
	}
	
	public String getExpectedTitleForEngine(Map<String, String> dataMap) {
		String navigateTo = dataMap.get("navigationTo");
		String expectedTitle = null;
		
		/*if(navigateTo.equalsIgnoreCase(EngineConstants.TITLE_HOMEPAGE)) {
			expectedTitle = EngineConstants.TITLE_HOMEPAGE;
		}*/
		
		return expectedTitle;
	}
}
