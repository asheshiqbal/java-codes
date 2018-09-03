package areaCalc;

public class Cylinder extends Circle {

	double height;

	Cylinder (double rad, double ht ){
		height = ht;
		radius = rad;
	}

	public double calculateArea() {
		return area(radius)* height;
	}
}