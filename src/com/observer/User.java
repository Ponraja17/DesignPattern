package com.observer;

public class User implements Observer {
	private String name;
	private Subject channel=new Channel();
	
	@Override
	public void update() {
		System.out.println(name+" Data updated ");
		
	}
	
	@Override
	public void UserChannel(Subject ch) {
		channel = ch;
	}

	public User(String name) {
		super();
		this.name = name;
	}
}
