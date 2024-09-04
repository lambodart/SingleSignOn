package LatestJava.sealedClass;

public final class emailNotification extends Notification {

	String mail;
	public emailNotification(String message,String email) {
		super(message);
		this.mail=email;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send() {
		System.out.println("Message send from "+ mail +" Msg is ::"+ getMessage() );
	}
}
