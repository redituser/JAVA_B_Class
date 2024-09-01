package student;

import java.util.Scanner;

public class Exam {

	public static int getNumberKeyboard(int number) {
		return number;
	}

	public int[] getScoresLines(int number) {
		System.out.println("성적 입력");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[number];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		return arr;

	}

	public void printSumAverage(int[] arr) {
		int sum = 0;
		int average = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		average = sum / arr.length;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
	}

}
