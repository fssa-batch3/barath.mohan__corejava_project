package day02.misc;

abstract class Shape {

	String type;

	abstract void getArea();
}

class Triangle extends Shape {
	int height;
	int breadth;

	Triangle(int h, int b) {
		height = h;
		breadth = b;
	}

	void getArea() {
		System.out.println("Area of triangle is " + ((height * breadth) * 1 / 2));
	}
}

class Square extends Shape {
	int side;

	Square(int a) {
		side = a;
	}

	void getArea() {
		System.out.println("Area of square is " + (side * side));
	}
}

public class AbstractDemo {
	public static void main(String[] args) {

		Shape[] shapes = new Shape[4];
		shapes[0] = new Triangle(15, 8);
		shapes[1] = new Square(15);
		shapes[2] = new Triangle(15, 16);
		shapes[3] = new Square(20);

		for (Shape s : shapes) {
			s.getArea();
		}

	}
}
