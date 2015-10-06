package oop_intefrace;

public class Rectangle implements Figure {

	
	@Override
	public int area(int a, int b) {
		int c = a * b;
		return c;
	}

	@Override
	public String name() {
		return "Rectangle = ";
	}

}
