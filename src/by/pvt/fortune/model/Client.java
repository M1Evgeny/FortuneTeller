package by.pvt.fortune.model;

import java.util.Date;

public class Client {
	private Date testDate;

	public Client() {
	}

	public Client(Date date) {
		testDate = date;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

}
