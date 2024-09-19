package week_3_Class;

public class Circle {

	final double pi = 3.14;
	double radius = 0;
	
	public Circle(double radius) {
		this.radius = radius;
		
	}
	
	//넓이 = Area
	public void arear() {
		
		double a = this.radius * this.radius * this.pi;
		
		System.out.println("반지름이" + radius +"인 원의 넓이는" + a +"입니다." );
	}
	
	
	
}

