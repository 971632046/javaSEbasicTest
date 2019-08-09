package com.smh;
import java.awt.Point;
/**
 * @author smh
 * @since 20190807
 * @version 1.0
 */
import java.util.Scanner;

public class Circle {
	int x;
	int y;	
	int r;
	Point p; 
	public Circle(int r,Point p){ 
	this.r=r; 
	this.p = p;
	} 
	public Circle(int x,int y, int r) {
		this.x=x;
		this.y=y;
		this.r=r;
	}
	public double Contains(Point p) {
		double b = (x-p.x)*(x-p.x)+(y-p.y)*(y-p.y);
		if(b<r*r) {
			System.out.println("点在圆内");
			}
		else {
			System.out.println("点不在圆内");
			}
		return b;	
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
	public double getArea(){ 
	double l=Math.PI*r*r; 
	return l; 
	}
	public static void main(String[] args) { 
		 Point p=new Point(2,1);
		Circle r=new Circle(3,p); 
		double b =r.Contains(1,2);
		System.out.println(r.getArea());
		System.out.print(r.Contains(p));
		
	} 
    	 }

		
