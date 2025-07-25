package interface1.shape;

// 자바에서 인터페이스는 클래스가 구현해야 할 메서드의 집합을 정의하는 일종의 약속(규격)
// 인터페이스는 class 대신 interface 라고 뜬다.

// 인터페이스는 메서드 시그니처만 정의하고 실제 코드는 구현하지 않으며
// 여러 클래스에서 공통적으로 구현해야 할 메서드를 강제함

// 인터페이스 내에서는 상수(static final)만 선언 가능하다.
// 추상 메서드만 사용 가능하다. (따라서 abstract 생략 가능)
// 생성자는 생성 불가하다. 객체(인스턴트) 생성 불가.
// 다중 구현 가능(implements .., .., )

// 인터페이스를 구현하려면 클래스에서 implements 키워드를 사용해서
// 인터페이스에 선언된 모든 추상 메서드를 반드시 오버라이드해서 구현
public interface Shape {
	public static final int a = 10;

	public abstract void getArea();

	public abstract String getColor();

}
