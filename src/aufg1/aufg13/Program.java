package aufg1.aufg13;

public class Program {

	private static GeomCalculation[] geomObjects;
	
	public static void main(String[] args) {
		geomObjects = new GeomCalculation[] {
			new Circle(1),
			new Circle(5),
			new Pentagon(1),
			new Pentagon(5) 
			};
		
		double perimeterSum = 0;
		double areaSum = 0;
		for (GeomCalculation gc : geomObjects) {
			perimeterSum += gc.getPerimeter();
			areaSum += gc.getArea();
		}
		
		System.out.println("Umfang: \t" + perimeterSum);
		System.out.println("Flaeche:\t" + areaSum);
		
	}

}
