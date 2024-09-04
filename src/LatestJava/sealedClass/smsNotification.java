package LatestJava.sealedClass;

public final class smsNotification extends Notification {

	String sms;

	public smsNotification(String message, String sms) {
		super(message);
		this.sms = sms;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send() {
		System.out.println("Message send from " + sms + " Msg is ::" + getMessage());
	}
}
