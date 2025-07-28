package interface2.tire;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();

		car.frontLeftTire = new KTire();
		car.frontRightTire = new KTire();
		car.run();

	}

}
