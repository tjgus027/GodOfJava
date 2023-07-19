package part7;

public class ManageHeight {
	int[][] gradeHeights;
	
	public static void main(String[] args){
		ManageHeight mh = new ManageHeight();
		mh.setData();
		for(int i = 1; i < 6; i++) {
			System.out.println("Class No.: " + i);
			//mh.printHeight(i);
			mh.printAverage(i);
		}
	}
	
	public void setData(){
		gradeHeights = new int[5][];
		gradeHeights[0] = new int[] {170, 180, 173, 175, 177};
		gradeHeights[1] = new int[] {160, 165, 167, 186};
		gradeHeights[2] = new int[] {158, 177, 187, 176};
		gradeHeights[3] = new int[] {173, 182, 181};
		gradeHeights[4] = new int[] {170, 180, 165, 177, 172};
	}
	
	public void printHeight(int classNo){
		classNo--;
		for(int i = 0; i < gradeHeights[classNo].length; i++) {
			System.out.println(gradeHeights[classNo][i]);
		}
	}
	
	public void printAverage(int classNo) {
		classNo--;
		double sum = 0;
		for(int arr : gradeHeights[classNo]) {
			sum += arr;
		}
		sum /= gradeHeights[classNo].length;
		System.out.println(sum);
	}
}
