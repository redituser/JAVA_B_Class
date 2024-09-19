package week_3_Class;

public class Cat {

	private String breed;
	private String color;
	private String age;

	public Cat(String breed, String color, String age) {
		super();
		this.breed = breed;
		this.color = color;
		this.age = age;
	}

	public Cat(String breed, String color) {

		this.breed = breed;
		this.color = color;

	}

	public Cat(String breed) {

		this.breed = breed;

	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void eat(String time) {
		System.out.println(time + "에 사료를 먹습니다");
	}

	public void meow() {
		System.out.println("야옹");
	}

	public void scratch() {
		System.out.println("스크래치를 긁습니다");
	}

}
