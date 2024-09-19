package week_3_Bank;

public class Main {
	public static void main(String[] args) {
		
	
    BankApplication app = new BankApplication();
    boolean run = true;
    while(run) {
        System.out.println("\n1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.print("선택> ");
        int choice = app.sc.nextInt();//이 문법은 다시
        app.sc.nextLine(); // 버퍼 비우기

        switch(choice) {
            case 1: app.createAccount(); break;
            case 2: app.showAccList(); break;
            case 3: app.plusMoney(); break;
            case 4: app.minusMoney(); break;
            case 5: run = false; break;
            default: System.out.println("잘못된 선택입니다.");
        }
    }
    System.out.println("프로그램 종료");
	
	}

}
