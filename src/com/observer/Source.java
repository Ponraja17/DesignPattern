package com.observer;

public class Source {

		public static void main(String args[]) {
			Subject Yt = new Channel();
			User U1 = new User("Jav");
			User U2 = new User("Dev");
			User U3 = new User("Zoh");
			Yt.add(U1);
			Yt.add(U2);
			Yt.add(U3);
			
			U1.UserChannel(Yt);
			U2.UserChannel(Yt);
			U3.UserChannel(Yt);

			Yt.upload("Notified");
		}
	}

