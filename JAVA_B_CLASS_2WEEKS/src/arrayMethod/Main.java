package arrayMethod;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PracticeArrayMethod pa = new PracticeArrayMethod();
		int[]arr = {1,2,3,4,5};
		
		
		System.out.println("1~4 까지 입력하세용");
		int selectNumber = sc.nextInt();
		
		
	
		switch(selectNumber) {
		
		case 1 :
			pa.getSum(arr);
			break;
		case 2 :
			pa.getMax(arr);
			break;
		case 3 :
			int number = sc.nextInt();
			pa.getCount(arr, number);
			break;
		case 4 :
			pa.getReverse(arr);
			break;

		}
	}
	
	
	
	
}
