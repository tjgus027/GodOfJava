package part6;

public class InterestManager {
	public static void main(String[] args) {
		InterestManager interest = new InterestManager();
		for(int i = 10; i <= 370; i += 10) {
			double money = interest.calcuateAmount(i, 1000000);
			System.out.println(i+": "+money);
		}
	}
	
	public double getInterestRate(int day){
		if(day < 91) return 0.5;
		else if(day > 90 && day <= 180) return 1;
		else if(day > 180 && day < 364) return 2;
		else return 5.6;
	}
	
	public double calcuateAmount(int day, long amount) {
		double rate = getInterestRate(day);
		double money = (rate*amount) / 100.0;
		money += amount;
		return money;
	}
}
