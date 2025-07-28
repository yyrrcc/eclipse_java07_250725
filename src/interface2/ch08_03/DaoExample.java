package interface2.ch08_03;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();

	}

	public static void main(String[] args) {
		// static으로 만든 dbWork 메서드라서 객체 생성 필요없이 진행 가능
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}
}
