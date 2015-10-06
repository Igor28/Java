package oop_abstract;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Figure> figures = new ArrayList<Figure>();
		figures.add(new Rectangle( 5, 4));
		figures.add(new Circle(5));
		figures.add(new RectTriangle(6, 5));
		figures.add(new Square(5));
		
		for(Figure f : figures) {
			System.out.println(f.name + " = " + f.square());
		}
	}

}
