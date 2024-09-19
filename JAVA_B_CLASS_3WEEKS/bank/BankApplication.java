package week_3_Bank;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
	
	Account[] ac = new Account[100];
	int accnt = 0;
	Scanner sc = new Scanner(System.in);
		
	
	public void createAccount() {
		System.out.println("계좌번호 :");
		String accountNumber = sc.nextLine();
		System.out.println("계좌주 :");
		String acountHolder = sc.nextLine();
		System.out.println("초기입금액 :");
		int startAccMoney = sc.nextInt();
		
		Account newacc = new Account(accountNumber,acountHolder,startAccMoney);
		ac[accnt] = newacc;
		accnt ++;
		
		System.out.println("결과 : 계좌가 생성 되었습니다");
		
	}
	
	
	public void showAccList() {
		System.out.println("계좌 목록");
		for (int i = 0; i < accnt; i++) {
			System.out.println(ac[i].toString());
		}
	}
	
	
	public void plusMoney() {
		System.out.println("계좌번호 :");
		String acc = sc.nextLine();
		
		for (int i = 0; i < accnt; i++) {
			if(ac[i].getAccountNumber().equals(acc)) {
				System.out.println("예금액 :");
				int money = sc.nextInt();
				ac[i].setStartMoney(ac[i].getStartMoney() + money);//초기금액
			}
		}
		
	}
	
	
	public void  minusMoney() {
		System.out.println("계좌번호 :");
		String acc = sc.nextLine();
		
		for (int i = 0; i < accnt; i++) {
			if(ac[i].getAccountNumber().equals(acc)) {
				System.out.println("출금 :");
				int money = sc.nextInt();
				sc.nextLine();//버퍼비우기
			  if (ac[i].getStartMoney() >= money) {
				  ac[i].setStartMoney(ac[i].getStartMoney() - money);
				  System.out.println("출금되었습니다");
			  }else {
				  System.out.println("현재 금액에서 출금할 수 없는 금액입니다.");
			  }
			  return;
			}
		}
		System.out.println("계좌를 찾을 수 없습니다");
	}
	
	
	
	

}

