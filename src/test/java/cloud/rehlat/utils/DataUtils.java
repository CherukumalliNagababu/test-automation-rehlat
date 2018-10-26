package cloud.rehlat.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtils {

	public static String getDateInSpecifiedFormat(String format) {
		String strDate = null;
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		strDate = dateFormat.format(date);
		return strDate;
	}
	public static String DaybeforeYesterdayDate(String format) {
		 Calendar cal = Calendar.getInstance();
		 cal.add(Calendar.DATE, -2);
		  return new SimpleDateFormat(format).format(cal.getTime());
		  
		}
	public static String YesterdayDate(String format) {
		 Calendar cal = Calendar.getInstance();
		 cal.add(Calendar.DATE, -1);
		  return new SimpleDateFormat(format).format(cal.getTime());
		  
		}

	public static String[] splitString(String input, String delimiter) {
		String [] arrSplitString = input.split(delimiter);
		return arrSplitString;
	}

	public static String getDigitsFromString(String input) {
		String strResult = null;
		if(input.contains("Total:") && input.contains("(") && input.contains(")")){
			strResult = "(" + input.replaceAll("[^0-9?!\\.]","") + ")";
		} else if(input.contains("Total:")){
			strResult = input.replaceAll("[^0-9?!\\.]","");
		} else if(input.contains(" ")) {
			String [] arrSplitString = splitString(input, " ");
			strResult = arrSplitString[0].replaceAll("[^0-9?!\\.]","");
		} else {
			strResult = input.replaceAll("[^0-9?!\\.]","");
		}
		return strResult;
	}
	
	public static Double getDoubleFromString(String input) {
		double result = 0.00;
		if(input.contains("(") && input.contains(")")) {
			input = input.replaceAll("\\(", "").replaceAll("\\)", "");
			result = -(Double.parseDouble(input));
		} else {
			result = Double.parseDouble(input);
		}
		return result;
	}
}
