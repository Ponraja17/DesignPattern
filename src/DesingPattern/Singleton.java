package DesingPattern;

import java.lang.reflect.Constructor;

public class Singleton {
	
	private static Singleton Object;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	public static Singleton getInstance() {
		
		if(Object == null) {
			
			Object = new Singleton();
			
		}
		
		return Object;
	}
	
	public void ConnectDB() {
		System.out.println("Connected");
	}
	public void Insert() {
		System.out.println("Completed");
	}

}

