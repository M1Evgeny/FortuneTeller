package by.pvt.fortune.runner;

import by.pvt.fortune.model.Client;
import by.pvt.fortune.model.FortuneTeller;

public class MainApp {

	public static void main(String[] args) {
		FortuneTeller clarra = new FortuneTeller();
		Client Bill = new Client();
		clarra.tellFortunes(Bill);
		clarra.tellFortunes(Bill);
	}
}
