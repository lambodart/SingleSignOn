package LatestJava.Thread;

import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

public class EvenOddNonOptimized {
	private static final int LIMIT = 10;

	public static void main(String[] args) {

		new Thread(() -> {
			for (int i = 1; i <= LIMIT; i += 2) {
				System.out.println("Odd: " + i);
				try {
					Thread.sleep(50); // Short sleep to allow context switch
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		}).start();

		new Thread(() -> {
			for (int i = 2; i <= LIMIT; i += 2) {
				System.out.println("Even: " + i);
				try {
					Thread.sleep(50); // Short sleep to allow context switch
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		}).start();

		new Thread(() -> {
			ReentrantLock r = new ReentrantLock();
			r.lock();
			for (int i = 0; i < 5; i++) {
				System.out.println("even");
			}
			r.unlock();
		}).start();
		
		new Thread(() -> {
			ReentrantLock r = new ReentrantLock();
			r.lock();
			for (int i = 0; i < 5; i++) {
				System.out.println("odd");
			}
			r.unlock();
		}).start();

	}
}
