package aufg1.aufg1S;
import java.util.Iterator;
import java.util.LinkedList;


public class Program {

	private static LinkedList<GeomCalculation> geomObjects;
	
	public static void main(String[] args) {
		geomObjects = new LinkedList<GeomCalculation>();
		geomObjects.add(new Circle(1));
		geomObjects.add(new Circle(5));
		geomObjects.add(new Pentagon(1));
		geomObjects.add(new Pentagon(5));
		
		
		
		double perimeterSum = 0;
		double areaSum = 0;
		Iterator<GeomCalculation> geomIterator = geomObjects.iterator();
		while (geomIterator.hasNext()) {
			GeomCalculation gc = geomIterator.next();
			perimeterSum += gc.getPerimeter();
			areaSum += gc.getArea();
		}
		
		System.out.println("Umfang: \t" + perimeterSum);
		System.out.println("Flaeche:\t" + areaSum);
		
	}

}
