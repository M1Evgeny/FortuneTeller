package by.pvt.fortune.util;

import java.util.ArrayList;
import java.util.List;

import by.pvt.fortune.model.Chamomile;

public class CreateChamomile {

	public static List<Chamomile> createChamomiles(int capacity) {
		List<Chamomile> chamomile = new ArrayList<>(capacity);
		for (int i = 0; i < capacity; i++) {
			chamomile.add(new Chamomile());
		}
		return chamomile;
	}
}
