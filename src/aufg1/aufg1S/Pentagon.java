package aufg1.aufg1S;

public class Pentagon implements GeomCalculation {


	private int length;	
	
	
	public Pentagon (int length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		final double AREACONST = Math.sqrt(25 + 10 * Math.sqrt(5)) / 4;
		return this.length * this.length * AREACONST;
	}

	@Override
	public double getPerimeter() {
		return 5 * this.length;
	}

}
