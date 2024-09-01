package arrayMethod;

public class PracticeArrayMethod {

	
	public int getSum(int[]arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		
		return sum;
	}
	
	
	public int getMax(int[]arr) {
		
		int max = 0;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		return arr[0];
	}
	
	
	
	
	
	
	public int getCount(int[]arr , int num) {
		int count = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > num) {
				count++;
			}
		}
		
		
		return count;
	}
	
	
	
	public void getReverse(int[] arr) {
		for (int i = arr.length-1; i >= 0; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	
	
	
}
