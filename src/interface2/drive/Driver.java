package interface2.drive;

public class Driver {
	// 매개변수로 인터페이스를 받아서, 인터페이스를 상속 받은 클래스를 불러 올 수 있다
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}

}
