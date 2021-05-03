package lang.classes.Enum.Enum_Example.Enum_Advanced;

//@Getter
//@Setter
public class EnumAdvanced {

	// Enum with a variable,method and constructor
	enum SeasonCustomized {
		WINTER(1, "cold"), SPRING(2, "nice"), SUMMER(3, "hot"), FALL(4, "medium");

		// variable
		private int code;
		private String weather;


		// method
		public int getCode() {
			return code;
		}

		// Constructor-only private or (default)
		// modifiers are allowed
		SeasonCustomized(int code, String weather) {
			this.code = code;
			this.weather = weather;
		}

		// Getting value of enum from code
		public static SeasonCustomized valueOf(int code) {
			for (SeasonCustomized season : SeasonCustomized.values()) {
				if (season.getCode() == code)
					return season;
			}
			throw new RuntimeException("value not found");// Just for kicks
		}

		// Using switch statement on an enum
		public int getExpectedMaxTemperature() {
			switch (this) {
			case WINTER:
				return 5;
			case SPRING:
			case FALL:
				return 10;
			case SUMMER:
				return 20;
			}
			return -1;// Dummy since Java does not recognize this is possible :)
		}

		public String getWeather() {
			return weather;
		}

		public void setWeather(String weather) {
			this.weather = weather;
		}
	};

	public static void main(String[] args) {
		SeasonCustomized season = SeasonCustomized.WINTER;

		/*
		 * //Enum constructor cannot be invoked directly //Below line would
		 * cause COMPILER ERROR SeasonCustomized season2 = new
		 * SeasonCustomized(1);
		 */

		for(SeasonCustomized customized: SeasonCustomized.values()) {

			System.out.println(customized.getWeather());
		}


//		System.out.println(season.getCode());// 1
//
//		System.out.println(season.getExpectedMaxTemperature());// 5
//
//		System.out.println(SeasonCustomized.valueOf(4));// FALL

	}

}