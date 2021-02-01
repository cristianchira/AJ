package Control_Flow.miscelanous;

public enum Switch_Enum {

	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

	public static Switch_Enum from(String day) {

		switch (day) {
		case "Sunday":
			return SUNDAY;
			
		case "Monday":
			return MONDAY;
			

		default:

		}
		return null;

	}

}
