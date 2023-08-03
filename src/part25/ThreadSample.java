package part25;

public class ThreadSample extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println("This is ThreadSample's run() method.");
	}
}
