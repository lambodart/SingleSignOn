package LatestJava.sealedClass;

public sealed abstract class Notification permits smsNotification,emailNotification,pushNotification{

	 private final String message;

	    public Notification(String message) {
	        this.message = message;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public  void send() {
	    	System.out.println("This is default implementation :(");
	    }
	    
	    static void m1() {
		}
	    
	    //abstract void m2();
	    
}
