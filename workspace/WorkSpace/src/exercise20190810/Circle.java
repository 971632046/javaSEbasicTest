package exercise20190810;

import java.awt.Point;

public class Circle extends Shape{
	private int r;
	Point p; 
	  public Circle() {

	}
	public Circle(Point center,int r) {
		super.location=center;
		this.r = r;
		this.p = center;
	}
	  public double area() {

			return Math.PI*r*r ;
		}
	  public  double Contains(int x,int y) {
			double b = (x-p.x)*(x-p.x)+(y-p.y)*(y-p.y);
			if(b<r*r) {
				System.out.println("点在圆内");
				}
			else {
				System.out.println("点不在圆内");
				}
			return b;
			
		}
}
