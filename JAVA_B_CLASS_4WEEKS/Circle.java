package week4;

public class Circle {
	static double PI = 3.14;
	private double raidus;
	
	
	
	
	
	
	
	public Circle(double raidus) {
		this.raidus = raidus;
	}
	public double getRadius() {
		return raidus;
	}
	public void setRaidus(double raidus) {
		this.raidus = raidus;
	}
	
	public double getArea() {
		return  getRadius() * getRadius() * PI;
	}
	
	

}
