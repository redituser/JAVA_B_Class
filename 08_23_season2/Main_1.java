package exam;

import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("직사각형의 가로 길이: ");
            double a = sc.nextDouble();
            System.out.println("직사각형의 가로 길이: " + a);
            
            System.out.print("직사각형의 세로 길이: ");
            double b = sc.nextDouble();
            System.out.println("직사각형의 세로 길이: " + b);
            
            System.out.println("직사각형의 넓이는 " + a*b + "cm 입니다");
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
        } finally {
            sc.close();
        }
    }
}