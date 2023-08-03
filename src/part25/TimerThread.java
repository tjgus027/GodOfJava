package part25;

import java.util.Date;

public class TimerThread extends Thread{
	public TimerThread() {
		
	}
	
	@Override
	public void run() {
		super.run();
		printCurrentTime();
	}
	
	public void printCurrentTime() {
		try {
			for(int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				long time = System.currentTimeMillis();
				System.out.println(new Date(time) + " " + time);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
