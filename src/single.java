import java.util.concurrent.locks.ReentrantLock;

public class single {

	static single single;
	
	private single(){
		System.out.println("single Obj");
	}
	static single gSingle() {
		
		ReentrantLock lock = new ReentrantLock();
		lock.lock();
		
		if (single == null) {
			single = new single();
		}
		
		lock.unlock();
		return single;
	}
}
