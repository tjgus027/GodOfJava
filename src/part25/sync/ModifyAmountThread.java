package part25.sync;

public class ModifyAmountThread extends Thread{
	private CommonCalculate cal;
	private boolean addFlag;
	
	public ModifyAmountThread(CommonCalculate cal, boolean addFlag) {
		this.cal = cal;
		this.addFlag = addFlag;
	}
	
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 1000; i++) {
			if(addFlag) {
				cal.plus(1);
			} else {
				cal.minus(1);
			}
		}
	}
}
