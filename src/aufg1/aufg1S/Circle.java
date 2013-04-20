package aufg1.aufg1S;

public class Circle implements GeomCalculation {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

}
