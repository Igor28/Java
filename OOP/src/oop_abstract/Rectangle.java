package oop_abstract;

public class Rectangle extends Figure{
//який з двох правильний?
	private final int a;
	private final int b;
	

	public Rectangle(int a, int b) {
		this("Rectangle", a, b);
	}
	public Rectangle(String name, int a, int b) {
		super(name);
		this.a = a;
		this.b = b;
	}
	

	@Override
	int square() {
		return a*b;
	}

	
}
