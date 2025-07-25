package interface1.remotecontrol;

public class RemoteMain {
	// 인터페이스를 필드로 선언 가능
	RemoteControl rc = new Televison();

	public RemoteMain(RemoteControl rc) {
		this.rc = rc;
	}

	public void methodA() {
		// 인터페이스는 로컬변수로도 가능
		RemoteControl rc = new Audio();
	}

	// 인터페이스는 매개변수로도 가능
	public void methodB(RemoteControl rc) {

	}

}
