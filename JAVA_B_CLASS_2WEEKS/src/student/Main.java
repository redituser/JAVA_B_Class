package student;

public class Main {
	
	
	public static void main(String[] args) {
		Exam exam = new Exam();
		
		int numStudent = exam.getNumberKeyboard(5);
		int[] scores = exam.getScoresLines(numStudent);
		exam.printSumAverage(scores);
		
	}
}
