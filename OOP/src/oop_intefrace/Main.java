package oop_intefrace;

public class Main {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.name() + rectangle.area(4, 5));
		RectTriangle rectTriangle = new RectTriangle();
		System.out.println(rectTriangle.name() + rectTriangle.area(4, 5));
		Square square = new Square();
		System.out.println(square.name()+ square.area(5));
		Circle circle=new Circle();
		System.out.println(circle.name()+circle.area(3));
	}

}
