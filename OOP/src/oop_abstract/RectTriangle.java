package oop_abstract;

public class RectTriangle extends Rectangle {

	public RectTriangle( int a, int b) {
		super("RectTriangle", a, b);
	}
	
	public RectTriangle(String name, int a, int b) {
		super(name, a, b);
		
	}
	
	public int square() {
		int rectSquare = super.square();
		return rectSquare /2 ;
	}

}
