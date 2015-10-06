package oop_intefrace;

public class RectTriangle implements Figure {

	@Override
	public int area(int a, int b) {
		int c = a * b / 2;
		return c;
	}

	@Override
	public String name() {

		return "RectTriangle = ";
	}

}
