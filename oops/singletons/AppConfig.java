package oops.singletons;

public class AppConfig {
	
	private AppConfig() { // default constructor privated 
		
	}
	
	private static AppConfig obj = null ; //new AppConfig();   // static class
	
	public static AppConfig getInstance() { 
		if(obj == null ) {
			obj = new AppConfig();
		}
		return obj;
	}

}
