package day05.misc;

interface ShapeInf {
	public void draw();
}

interface Boundary {
	public void calculateBoundary();
}

class Rectangle3 implements ShapeInf, Boundary {

	public void draw() {
		System.out.println("Drawing a Rectangle by implementing inf");
	}

	
	public void calculateBoundary() {
		System.out.println("Calculating Rectangle Boundary");
		
	}
}

class Square2 implements ShapeInf {
	
	public void draw() {
		System.out.println("Drawing a square by implementing inf");
	}
}

public class ShapeInterfaceDemo2 {
	public static void main(String[] args) {
		Rectangle3 rectangle = new Rectangle3();
		ShapeInf rectangleShape = rectangle;
		rectangleShape.draw();
		Boundary rectangleBoundary = rectangle;
		rectangleBoundary.calculateBoundary();
		
		ShapeInf square = new Square2();
		square.draw();
	}
}
