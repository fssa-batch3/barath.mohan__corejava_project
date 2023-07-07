package day02.solved;

//Method overloading in Java
 class ShapeCalculator {
		// Calculating Area for Circle
 public double calculateArea(double radius) {
     return Math.PI * radius * radius;
 }
		
		// Calculating Area for Rectangle
 public double calculateArea(double length, double width) {
     return length * width;
 }
}

public class ShapeCalculatorDemo {
 public static void main(String[] args) {
     ShapeCalculator calculator = new ShapeCalculator();
     double circleArea = calculator.calculateArea(3.5);     
     System.out.println(circleArea);// Output: 38.48451000647496
     double rectangleArea = calculator.calculateArea(4.2, 6.8);    
     System.out.println(rectangleArea);// Output: 28.559999999999995
 }
}