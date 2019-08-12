package exercise20190810;

import java.awt.Point;

public class Rectangle {
	private int width;
	 private int height;
	 public Rectangle() {

	}
	public Rectangle(Point o,int width, int height) {
		

		this.width = width;
		this.height = height;
	}
	   public double area() {

			return width*height;
		}
	  
}
