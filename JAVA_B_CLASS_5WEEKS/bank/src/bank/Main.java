package bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MemberApplication app = new MemberApplication();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        
        while(run) {
            System.out.println("\n1.회원등록 | 2.회원목록 | 3.로그인 | 4.로그아웃 | 5.회원정보 | 6.회원탈퇴 | 7.종료");
            System.out.print("선택> ");
            int choice = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            switch(choice) {
                case 1: app.createMember(); break;
                case 2: app.showMemberList(); break;
                case 3:
                    System.out.println("ID: ");
                    String loginId = sc.nextLine();
                    System.out.println("비밀번호: ");
                    String loginPw = sc.nextLine();
                    app.login(loginId, loginPw);
                    break;
                case 4:
                    System.out.println("로그아웃할 ID: ");
                    String logoutId = sc.nextLine();
                    app.logout(logoutId);
                    break;
                case 5:
                    System.out.println("ID: ");
                    String infoId = sc.nextLine();
                    System.out.println("비밀번호: ");
                    String infoPw = sc.nextLine();
                    app.info(infoId, infoPw);
                    break;
                case 6:
                    System.out.println("삭제할 회원 ID: ");
                    String removeId = sc.nextLine();
                    app.remove(removeId);
                    break;
                case 7: run = false; break;
                default: System.out.println("잘못된 선택입니다.");
            }
        }
        System.out.println("프로그램 종료");
        sc.close();
    }
}