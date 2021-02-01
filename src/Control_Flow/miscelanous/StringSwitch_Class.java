package Control_Flow.miscelanous;

public class StringSwitch_Class {

	public static int getMonthNumber(String month) {

		int monthNumber;

		/*
		 * if (month == null) { return monthNumber; }
		 */

		switch (month.toLowerCase()) {
		case "january":
			monthNumber = 1;
			break;
		case "february":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		case "april":
			monthNumber = 4;
			break;
		case "may":
			monthNumber = 5;
			break;
		case "june":
			monthNumber = 6;
			break;
		case "july":
			monthNumber = 7;
			break;
		case "august":
			monthNumber = 8;
			break;
		case "september":
			monthNumber = 9;
			break;
		case "october":
			monthNumber = 10;
			break;
		case "november":
			monthNumber = 11;
			break;
		case "december":
			monthNumber = 12;
			break;
		default:
			if (month.isEmpty()) {
				monthNumber = 0;
			} else {
				monthNumber = 500;
			}

		}
		return monthNumber;
	}

	public static void main(String[] args) {

		String month = "December";

		int monthNumber = StringSwitch_Class.getMonthNumber(month);
		if (monthNumber == 0) {
			System.out.println("Empty..");
		} else if (monthNumber == 500) {
			System.out.println("Invalid month...");
		} else {
			System.out.println(monthNumber);
		}
	}
}
