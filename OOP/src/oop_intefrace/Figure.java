package oop_intefrace;

public interface Figure {

	int area(int a, int b);
	String name();
	default int area(int r) {
		return r;
	}

}
