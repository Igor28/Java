package oop_intefrace;

public class Circle implements Figure{
	int r;
	
	@Override
	public int area(int r) {
		
		return (int) (Math.PI * r * r);
	}

	@Override
	public String name() {
		return "Circle = ";
	}

	@Override
	public int area(int a, int b) {
		return 0;
	}

}
