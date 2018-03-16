package by.pvt.fortune.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fortune {
	private static String[] loveFortune = new String[] { "love", "doesnt love" };
	private static String[] kids = new String[] { "1 kid", "2 kids", "3 kids", "7 kids" };

	public static List<String> getLoveFortune() {
		return new ArrayList<>(Arrays.asList(loveFortune));
	}

	public static List<String> getKidsFortune() {
		return new ArrayList<>(Arrays.asList(kids));
	}
}
