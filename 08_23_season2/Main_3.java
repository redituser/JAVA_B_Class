package exam;

import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        
        try {
            System.out.print("반지름 입력: ");
            double a = sc.nextDouble();
            
            double s = a * a * PI;
            System.out.print("원의 넓이는 ");
            System.out.printf("%.2f", s);
            System.out.println("cm 입니다");
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
        } finally {
            sc.close();
        }
    }
}