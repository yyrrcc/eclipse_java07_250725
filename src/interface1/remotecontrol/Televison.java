package interface1.remotecontrol;

public class Televison implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("티비를 켜다");
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끄다");
	}

}
