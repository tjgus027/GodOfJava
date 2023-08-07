package part23;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
	Random r = new Random();
	
	public static void main(String[] args) {
		RandomNumberMaker sample = new RandomNumberMaker();
		for(int i = 0; i < 10; i++) {
			System.out.println(sample.getSixNumber());
		}
	}
	
	public HashSet<Integer> getSixNumber(){
		HashSet<Integer> numberSet = new HashSet<Integer>();
		
		while(numberSet.size() != 6) {
			int tempNumber = r.nextInt(44) + 1;
			numberSet.add(tempNumber);
		}
		
		return numberSet;
	}
	
}
