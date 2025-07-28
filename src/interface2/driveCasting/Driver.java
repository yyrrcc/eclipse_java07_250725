package interface2.driveCasting;

public class Driver {
	// 매개변수로 인터페이스를 받아서, 인터페이스를 상속 받은 클래스를 불러 올 수 있다
	public void drive(Vehicle vehicle) {
		// vehicle 변수가 Bus 강제형변환이 된다면 실행
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}

		vehicle.run();
	}

}
