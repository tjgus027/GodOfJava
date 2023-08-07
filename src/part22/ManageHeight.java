package part22;

import java.util.ArrayList;

public class ManageHeight {
	ArrayList<ArrayList<Integer>> gradeHeigths = new ArrayList<ArrayList<Integer>>();
	
	public static void main(String[] args) {
		ManageHeight sample = new ManageHeight();
		sample.setData();
		
		for(int i = 1; i <= 5; i++) {
//			sample.printHeigth(i);
			sample.printAverage(i);
		}
	}
	
	public void setData() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(170);
		list1.add(180);
		list1.add(173);
		list1.add(175);
		list1.add(177);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(160);
		list2.add(165);
		list2.add(167);
		list2.add(186);
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(158);
		list3.add(177);
		list3.add(187);
		list3.add(176);
		
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(173);
		list4.add(182);
		list4.add(181);
		
		ArrayList<Integer> list5 = new ArrayList<Integer>();
		list5.add(170);
		list5.add(180);
		list5.add(165);
		list5.add(177);
		list5.add(172);
		
		gradeHeigths.add(list1);
		gradeHeigths.add(list2);
		gradeHeigths.add(list3);
		gradeHeigths.add(list4);
		gradeHeigths.add(list5);
	}
	
	public void printHeigth(int classNo) {
		ArrayList<Integer> list = gradeHeigths.get(classNo-1);
		System.out.println("Class No.: " + classNo);
		for(int num : list) {
			System.out.println(num);
		}
	}
	
	public void printAverage(int classNo) {
		ArrayList<Integer> list = gradeHeigths.get(classNo-1);
		System.out.println("Class No.: " + classNo);
		double sum = 0;
		for(int num : list) {
			sum += num;
		}
		sum /= list.size();
		System.out.println("Heigth average: " + sum);
	}
	
}
