package javaexceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import loggers.CarService;

public class CarSelector {

	private static Logger logg = LoggerFactory.getLogger(CarSelector.class);

	public static void main(String[] args) {

		CarService carService = new CarService();
		for (String arg : args) {
			if (isValid(arg)) {
				carService.process(arg);
			} else {
				System.err.println("Ignoring this: " + arg);
			}
		}
	}

	private static boolean isValid(String arg) {
		try {
			CarState.valueOf(arg);
		} catch (RuntimeException e) {
			return false;
		}
		return true;

	}

}
