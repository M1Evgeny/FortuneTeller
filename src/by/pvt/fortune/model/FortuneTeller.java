package by.pvt.fortune.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static by.pvt.fortune.util.CreateChamomile.*;
import by.pvt.fortune.util.FortuneScanner;
import by.pvt.fortune.util.RandonNumber;
import static by.pvt.fortune.util.SetterFortunes.*;

public class FortuneTeller {
	private List<Chamomile> chamomile;
	private Map<Integer, List<String>> fortunes;
	private List<Client> clients = new ArrayList<>();
	private int capacity;
	private static final int INCREASE_BY_ONE_DAY = 1;

	public FortuneTeller() {
		capacity = RandonNumber.getRandomNumber();
		chamomile = createChamomiles(capacity);
		fortunes = setFortunes();
	}

	public FortuneTeller(int capacity) {
		this.capacity = capacity;
		chamomile = createChamomiles(capacity);
		fortunes = setFortunes();
	}

	public void tellFortunes(Client client) {
		if (!chamomile.isEmpty() && checkDate(client)) {
			getTopics();
			int choice = FortuneScanner.readChoiseNumber();
			List<String> answers = getFortune(choice);
			setChamomileAnswers(answers);
			fortuneTelling();
			removeChamomile();
			addClient(client);
			setUsageDate(client);
		} else {
			System.out.println("go away!");
		}
	}

	private void getTopics() {
		System.out.println("1 - love...");
		System.out.println("2 - how many children will you have?");
		System.out.println();
	}

	private List<String> getFortune(int choice) {
		List<String> answers = null;
		if (choice > 0 && choice < 3) {
			switch (choice) {
			case 1:
				answers = fortunes.get(1);
				break;

			case 2:
				answers = fortunes.get(2);
				break;
			}
		}
		return answers;
	}

	private void setChamomileAnswers(List<String> answers) {
		int fortuneNumber = 0;
		if (answers != null && !chamomile.isEmpty()) {
			Chamomile ch = chamomile.get(0);
			for (int i = 0; i < ch.size(); i++) {
				if (fortuneNumber == answers.size()) {
					fortuneNumber = 0;
				}
				if (fortuneNumber < answers.size()) {
					ch.setPetttal(answers.get(fortuneNumber));
				}
				fortuneNumber++;
			}
		} else {
			System.out.println("Im not in the mood!");
		}
	}

	private void fortuneTelling() {
		if (!chamomile.isEmpty() && chamomile.get(0) != null) {
			int size = chamomile.get(0).size();
			for (int i = 0; i < size; i++) {
				if (chamomile.get(0).getPetal(i) != null) {
					System.out.println("I'm guessing!");
					if (i == chamomile.get(0).size() - 1) {
						System.out.println(chamomile.get(0).getPetal(size - 1));
						System.out.println();
					}
				}
			}
		}
	}

	private void removeChamomile() {
		if (!chamomile.isEmpty()) {
			chamomile.remove(0);
		}
	}

	private void setUsageDate(Client client) {
		Date testDate = new Date();
		client.setTestDate(testDate);
	}

	private boolean checkDate(Client client) {
		if (client != null) {
			Date curentDate = new Date();
			Date fortuneDate = getClientsDate(client);
			if (fortuneDate != null) {
				if (curentDate.after(fortuneDate)) {
					return true;
				}
				return false;
			}
		}
		return true;
	}

	private Date getClientsDate(Client client) {
		Date fortuneDate = client.getTestDate();
		Calendar cal = Calendar.getInstance();
		if (fortuneDate != null) {
			cal.setTime(fortuneDate);
			cal.add(Calendar.DAY_OF_MONTH, INCREASE_BY_ONE_DAY);
			return cal.getTime();
		}
		return null;
	}

	private void addClient(Client client) {
		if (client != null) {
			clients.add(client);
		}
	}
}
