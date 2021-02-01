package Control_Flow.miscelanous;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Switch_Enum_Class {

	public static void main(String[] args) {
		// getNews();
		getWeekDay();
	}

	static int dayNumber = 0;
	static int thisDayNumber = Calendar.DAY_OF_WEEK;

	public static String getWeekDay() {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Sunday");
		map.put(2, "Monday");
		map.put(3, "Tuesday");
		map.put(4, "Wednesday");
		map.put(5, "Thursday");
		map.put(6, "Friday");
		map.put(7, "Saturday");
		String thisDay = map.get(thisDayNumber);
		System.out.println(thisDay);
		return thisDay;

	}
}
