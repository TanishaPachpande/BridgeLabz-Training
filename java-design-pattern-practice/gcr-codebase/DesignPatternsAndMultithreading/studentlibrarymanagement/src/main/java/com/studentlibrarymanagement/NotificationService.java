package com.studentlibrarymanagement;
import java.util.ArrayList;
import java.util.List;

public class NotificationService implements Subject {

	private List<Observer> users = new ArrayList<>();

	@Override
	public void subscribe(Observer o) {
		users.add(o);
	}

	@Override
	public void unsubscribe(Observer o) {
		users.remove(o);
	}

	@Override
	public void notifyUsers(String msg) {
		for (Observer o : users) {
			o.update(msg);
		}
	}
}
