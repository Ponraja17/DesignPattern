package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	private List <User> Datas = new ArrayList();
	String title;
	
	
	@Override
	public void add(User Data) {
		Datas.add(Data);
	}
	@Override
	public void remove(Observer Data) {
		Datas.remove(Data);
	}
	
	@Override
	public void notifyUser() {
		for(Observer Data : Datas) {
			Data.update();
		}
		
	}
	
	@Override
	public void upload(String title) {
		this.title=title;
		System.out.println(title);
		notifyUser();
	}
	
}