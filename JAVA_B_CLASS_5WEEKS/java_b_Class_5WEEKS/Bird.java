package java_b_Class_5WEEKS;

public class Bird implements Countable {

	
	String name;
	int cnt;
	
	public Bird(String name, int cnt) {
		super();
		this.name = name;
		this.cnt = cnt;
	}

	@Override
	public void count() {
		System.out.println(name + "가" + cnt +"마리 있다.");
		
	}
	
	public void fly() {
	System.out.println(cnt + "마리" + name + "가 날아간다");	
	}
	
	
}
