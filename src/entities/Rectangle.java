package entities;

public class Rectangle {
	public double Whidth;
	public double Heigth;
	
	public double area() {
		return Whidth * Heigth;
	}
	
	public double perimeter() {
		
		return 2 * (Whidth + Heigth);
	}
	
	public double diagonal () {
		
		return Math.sqrt((Whidth * Whidth + Heigth * Heigth));
	}
	

}
