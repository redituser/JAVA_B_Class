package evenandodd;

import java.util.Scanner;

public class EvenAndOdd {

	
	
	public static void evenOrOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("홀짝 검사를 위해 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		 
		if(num % 2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		
		System.out.println("계속하시겠습니까? (0-멈춤/1-계속) : ");
		int answer = sc.nextInt();
		if(answer == 1) {
			evenOrOdd();
		}else if(answer == 0) {
			return;
		}else {
			System.out.println("다시 입력하세요");
			evenOrOdd();
		}
	
		
	}

}
