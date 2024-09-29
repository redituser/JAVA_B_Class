package java_b_Class_5WEEKS_2;

public class SoundableExample {
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		
	}
}
