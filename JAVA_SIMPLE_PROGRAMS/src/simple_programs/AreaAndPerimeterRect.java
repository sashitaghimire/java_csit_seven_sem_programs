package simple_programs;

import java.util.Scanner;

public class AreaAndPerimeterRect {
	final double PI = 3.14;
	
	public AreaAndPerimeterRect() {	}
	
	public double areaRect(double length,double breadth) {
		return length * breadth;
	}
	
	public double perimeterRect(double length ,double breadth) {
		return (2*(length+breadth));
	}
	
	public double areaCircle(double radius) {
		return 2*PI*radius;
	}
	
	

	public static void main(String[] args) {
		double rectLength;
		double rectBreath;
		double circleRadius ;
		AreaAndPerimeterRect areaAndPerimeterRect = new AreaAndPerimeterRect();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of Rect :");
		 rectLength = scanner.nextDouble();
		
		System.out.println("Enter breadth of Rect : ");
		rectBreath = scanner.nextDouble();
		
		System.out.println("Enter Radius of Circle :");
		circleRadius = scanner.nextDouble();
		
		double rectArea = areaAndPerimeterRect.areaRect(rectLength, rectBreath);
		double rectPerimeter = areaAndPerimeterRect.perimeterRect(rectLength,rectBreath);
		double circArea = areaAndPerimeterRect.areaCircle(circleRadius);
		
		System.out.println("Area of Rect is :"+rectArea );
		System.out.println("Perimeter of Rect is :"+rectPerimeter );
		System.out.println("Area of Circle is :"+circArea );

	}

}
