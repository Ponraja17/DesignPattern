package DesingPattern;


public class SingletonMain {
	
	public static void main(String[] args) {
		
		Singleton Obj =Singleton.getInstance();
		Obj.ConnectDB();
		Obj.Insert();
	}

}
