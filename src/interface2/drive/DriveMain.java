package interface2.drive;

public class DriveMain {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Truck truck = new Truck();

		driver.drive(bus);
		driver.drive(truck);

	}

}
