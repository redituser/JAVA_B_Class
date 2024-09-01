package manyStar;

public class ManyStar {

	public void star1() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void star2() {

		for (int i = 5; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void star3() {

		for (int i = 0; i < 5; i++) {

			for (int k = 0; k < 5 - i - 1; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	public void star4() {
		for (int i = 5; i > 0; i--) {

			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void star5() {
		
		for (int i = 0; i < 5; i++) {
			 
			for (int j = 0; j < 9-i-1; j++) {		
				System.out.print(" ");
			}
			for (int j = 0; j <= i*2; j++) {
				System.out.print("*");
			}
			 System.out.println();
		}
	}
	
		
	public void star6() {
			
	for (int i = 0; i < 5; i++) {
			
			for (int j = 0;	j < i ; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < 9-i*2; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	
		}
}
