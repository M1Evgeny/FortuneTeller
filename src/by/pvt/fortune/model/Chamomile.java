package by.pvt.fortune.model;

import java.util.ArrayList;
import java.util.List;

import by.pvt.fortune.util.RandonNumber;

public class Chamomile {

	private List<String> petal;
	private int capacity;

	public Chamomile() {
		capacity = RandonNumber.getRandomNumber();
		petal = new ArrayList<>(capacity);
	}

	public List<String> getChamomilePetal() {
		return petal;
	}

	public void setPetttal(String s) {
		if (petal != null) {
			petal.add(s);
		}
	}

	public String getPetal(int index) {
		String s = null;
		if (index < petal.size()) {
			s = petal.get(index);
		}
		return s;
	}

	public int size() {
		return capacity;
	}

}
