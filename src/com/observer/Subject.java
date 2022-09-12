package com.observer;

public interface Subject {


	void add(User Data);

	void remove(Observer Data);

	void notifyUser();

	void upload(String title);

}