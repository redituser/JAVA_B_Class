package manyStar;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ManyStar ms = new ManyStar();
		
		System.out.println("번호 입력");
		int number = sc.nextInt();
		
		
		
		switch(number) {
		case 1: ms.star1();
		break;
		case 2: ms.star2();
		break;
		case 3: ms.star3();
		break;
		case 4: ms.star4();
		break;
		case 5: ms.star5();
		break;
		case 6: ms.star6();
		break;
		
		}
		
	}
}
