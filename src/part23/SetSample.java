package part23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {
	public static void main(String[] args) {
		SetSample sample = new SetSample();
		String[] cars = new String[] {
				"Tico", "Sonata", "BMW", "Benz", 
				"Lexus", "Mustang", "Grandeure", 
				"The Beetle", "Mini Cooper", "i30",
				"BMW", "Lexus", "Carnibal", "SM5", 
				"SM7", "SM3", "Tico"
		};
		System.out.println(sample.getCarKinds(cars));
	}
	
	public int getCarKinds(String[] cars) {
		if(cars == null) return 0; //null 체크를 안하면 NullPointerException 발생
		if(cars.length == 1) return 1; //1인 경우 체크로직을 수행 안 해도 됨
		
		Set<String> carSet = new HashSet<String>();
		for(String car : cars) {
			carSet.add(car);
		}
		
		printCarSet2(carSet);
		return carSet.size();
	}
	
	public void printCarSet(Set<String> carSet) {
		for(String car : carSet) {
			System.out.print(car + " ");
		}
		System.out.println();
	}
	
	public void printCarSet2(Set<String> carSet) {
		Iterator<String> iterator = carSet.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}
}
