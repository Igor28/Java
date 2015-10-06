package oop_intefrace;

public class Square extends Rectangle {

	public int area(int a) {
		return a * a;
	}

	@Override
	public String name() {
		return "Square = ";
	}

	// @Override
	// public int square(int a, int b) {
	// int c=a*a;
	// return c;
	// }
	
	
}
