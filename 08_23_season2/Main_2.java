package exam;

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("정수 입력: ");
            double a = sc.nextDouble();
            int integer = (int)Math.floor(a);
            
            if (integer % 2 == 0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
        } finally {
            sc.close();
        }
    }
}