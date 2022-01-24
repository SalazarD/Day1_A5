package problem1;

public class Land {
	
	private double length;
	private double width;
	
	public Land(double length, double width) {
		
		this.length = length;
		this.width = width;
		
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getParameter() {
		return 2 * length + 2 * width;
	}
	
	public double getArea() {
		return length * width;
	}
	

}
