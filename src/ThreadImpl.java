
public class ThreadImpl implements Runnable{

	public static void main(String[] args) {
		System.out.println("Main :: "+Thread.currentThread().getName());
		// TODO Auto-generated method stub
		ThreadImpl ThreadImpl = new ThreadImpl();
		Thread m = new Thread(ThreadImpl);
		m.run();
		m.run();
		m.start();
		
		System.out.println("Main :: "+Thread.currentThread().getName());

	}

	@Override
	public void run() {
		System.out.println("Run :: "+Thread.currentThread().getName());
	}

}
