package part25.object;

public class RunObjectThreads{
	public static void main(String[] args) {
		RunObjectThreads sample = new RunObjectThreads();
		sample.checkThreadState2();
	}
	
	public void checkThreadState2() {
		Object monitor = new Object();
		StateThread thread = new StateThread(monitor);
		StateThread thread2 = new StateThread(monitor);
		
		try {
			System.out.println("thread state = " + thread.getState());
			thread.start();
			thread2.start();
			System.out.println("thread state(after start) = " + thread.getState());
			
			Thread.sleep(100);
			//notify로 부르지 않고 wait 상태의 기다리는 중이기 떄문에 waiting 출력
			System.out.println("thread state(after 0.1 sec) = " + thread.getState()); 
			
			synchronized (monitor) {
				monitor.notifyAll();
			}
			Thread.sleep(100);
			System.out.println("thread state(after notify) = " + thread.getState());
			
			thread.join();
			System.out.println("thread state(after join) = " + thread.getState());
			thread2.join();
			System.out.println("thread2 state(after join) = " + thread.getState());

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
