package interface1.shape;

public class ShapeMain {

	public static void main(String[] args) {
		// 일종의 업캐스팅
		Shape shape = new Triangle();
		shape.getArea();
		shape.getColor();

		Draw draw = new Triangle();
		draw.drawShape();
		draw.drawPen();

		Triangle triangle = new Triangle();
		triangle.drawPen();
		triangle.drawShape();
		triangle.getArea();
		triangle.getColor();
	}

}
