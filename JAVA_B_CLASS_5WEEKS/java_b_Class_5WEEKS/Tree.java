package java_b_Class_5WEEKS;

public class Tree implements Countable {

	String name;
	int cnt;
	
	public Tree(String name, int cnt) {
		super();
		this.name = name;
		this.cnt = cnt;
	}

	@Override
	public void count() {
		System.out.println(name + "가" + cnt +"그루 있다.");
		
	}
	
	public void ripen() {
	System.out.println(cnt + "그루" + name + "에 열매가 잘 익었다.");	
	}

}
