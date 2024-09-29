package java_b_Class_5WEEKS_3;

public class MySqlDao implements DataAccessObject {

	String db = "MySql DB";

	@Override
	public void select() {
		System.out.println(db + "에서 검색");

	}

	@Override
	public void insert() {
		System.out.println(db + "에서 삽입");

	}

	@Override
	public void update() {
		System.out.println(db + "에서 수정");

	}

	@Override
	public void delete() {
		System.out.println(db + "에서 삭제");

	}

}
