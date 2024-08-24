package exam;

import java.util.Scanner;

public class Main_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("변수 a 입력: ");
            int a = sc.nextInt();
            System.out.print("변수 b 입력: ");
            int b = sc.nextInt();
            
            System.out.println("Swapping 결과 > ");
            int temp = a;
            a = b;
            b = temp;
            
            System.out.println("변수 a: " + a + " 변수 b: " + b);
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다. 정수를 입력해주세요.");
        } finally {
            sc.close();
        }
    }
}