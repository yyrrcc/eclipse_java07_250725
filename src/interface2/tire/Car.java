package interface2.tire;

public class Car {
	// 필드
	Tire frontLeftTire = new HTire(); // 업캐스팅
	Tire frontRightTire = new HTire();
	Tire backLeftTire = new HTire();
	Tire backRightTire = new HTire();

	public void run() {
		frontLeftTire.roll(); // 변수의 타입이 Tire이지만 오버라이딩된 자식의 메서드를 불러옴
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
