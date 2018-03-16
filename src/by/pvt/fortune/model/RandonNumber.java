package by.pvt.fortune.model;

import java.util.Random;

public class RandonNumber {
	private static Random rd = new Random();
	private static final int MIN_NUM_PETAL = 1;

	public static int getRandomNumber() {
		return MIN_NUM_PETAL + rd.nextInt(10);
	}

}
