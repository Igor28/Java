package oop_abstract;

public class Circle extends Figure {
	private final int r;
	
	public Circle(int r) {
		this("Circle", r);
	}
	public Circle(String name, int r) {
		super(name);
		this.r = r;
		
	}
	@Override
	int square() {
		
		return (int) (Math.PI * r * r);
	}
}
