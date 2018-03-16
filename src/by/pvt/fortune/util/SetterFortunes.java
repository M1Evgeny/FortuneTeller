package by.pvt.fortune.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.pvt.fortune.model.Fortune;

public class SetterFortunes {
	public static Map<Integer, List<String>> setFortunes() {
		Map<Integer, List<String>> fortunes = new HashMap<>();
		fortunes.put(1, Fortune.getLoveFortune());
		fortunes.put(2, Fortune.getKidsFortune());
		return fortunes;
	}
}
