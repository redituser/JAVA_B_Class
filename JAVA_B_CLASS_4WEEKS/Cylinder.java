package week4;

public class Cylinder extends Circle{
	private double Height;
	
	
	public Cylinder(double radius , double height) {
		super(radius);
		this.Height = height;
	}


	public double getHeight() {
		return Height;
	}


	public void setHeight(double height) {
		Height = height;
	}




	@Override
	public double getArea() {
	   
	    return getRadius() * getRadius() * PI * this.Height;
	}
	
	
	
	

	
	
	
	
	
	
	
	
}
