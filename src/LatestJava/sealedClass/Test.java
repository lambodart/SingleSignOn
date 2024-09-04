package LatestJava.sealedClass;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Notification> notification =  List.of(new emailNotification("Hi Msg", "lambodar@gg"),
				new smsNotification("Hi Msg", "123456"), new pushNotification("No Msg Impl"));

		for (Notification notification2 : notification) {
			notification2.send();
		}
	}

}
