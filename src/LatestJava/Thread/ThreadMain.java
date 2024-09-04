package LatestJava.Thread;


import java.util.concurrent.locks.ReentrantLock;

public class ThreadMain {

	public static void name() {
		
	}
	
	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		new Thread(() -> {
			int s = 0;
			lock.lock();
			try {
				for (int i = 0; i < 10; i += 2) {

					s = s + i;
				}
				System.out.println("even Add :" + s);
			} finally {
				lock.unlock();
			}

		}).start();

		new Thread(() -> {
			int s = 0;
			lock.lock();
			try {
				for (int i = 1; i < 10; i += 2) {
					s = s + i;
				}
				System.out.println("Odd Add :" + s); // 13579 = 2 //02468 =20
			} finally {
				lock.unlock();
			}
		}).start();
	}

}
