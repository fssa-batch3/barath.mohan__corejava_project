package day05.solved;

public class TestInfPolygon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon2 p = new Rectangle();
		double area = p.area(5, 6);
		System.out.println("Calculated Area: " + area);
		
		p = new RightAngledTriangle();
		
		area = p.area(5,  6);
		
		System.out.println("Newly calculated Area: " + area);

	}

}