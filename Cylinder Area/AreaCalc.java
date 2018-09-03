package areaCalc;

import java.util.Scanner;

public class AreaCalc {

	public static void main(String[] args) {

		double height, radius;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter radius: ");
		radius = scan.nextDouble();

		System.out.println("Enter height: ");
		height = scan.nextDouble();

		Cylinder c = new Cylinder(radius, height);
		System.out.println("Area of the cylinder: "+ c.calculateArea() );
	}

}