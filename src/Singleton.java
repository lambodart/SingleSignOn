import java.util.concurrent.locks.ReentrantLock;

public class Singleton {

	static Singleton singleton;

	private Singleton() {
		System.out.println("single Obj Creation");
	}

	static Singleton singletonObj() {
		ReentrantLock lock = new ReentrantLock();

		lock.lock();
		if (singleton == null)
			singleton = new Singleton();

		lock.unlock();
		return singleton;
	}
}
