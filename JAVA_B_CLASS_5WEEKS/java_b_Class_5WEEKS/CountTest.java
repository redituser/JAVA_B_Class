package java_b_Class_5WEEKS;

public class CountTest {

	public static void main(String[] args) {

		Countable[] arr = { new Bird("뻐꾸기", 5), new Bird("독수리", 2), new Tree("사과나무", 10), new Tree("밤나무", 7) };

		for (Countable count : arr) {
			count.count();
			if (count instanceof Bird) {
				((Bird) count).fly();
			} else if (count instanceof Tree) {
				((Tree) count).ripen();
			}

		}

	}

}
