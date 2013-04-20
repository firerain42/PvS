package aufg1.aufg14;

public class ProgramException {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size = 20;
		Field field = new Field(size);
		
		System.out.println("[START] Writing numbers");
		for (int i = -1; i < size + 1; i++) {
			try {
				field.setFieldNumber(i, i+55);

			} catch (MissingFieldException e) {
				if (i==-1)
					System.out.println("[OK] (" + e.getMessage()+")");
				else if (i>=size)
					System.out.println("[OK] (" + e.getMessage()+")");
				else
					System.out.println("[FAILED] Invalid exception found (" +  
             	e.getMessage()+")");
			}
		}
		System.out.println("[END] Writing numbers");
		
		System.out.println("\n[START] Reading numbers");
		for (int i = -1; i < size + 1; i++) {
			try {
				if (field.getFieldNumber(i)!=i+55)
					System.out.println("[FAILED] Expected: "+(i+55)+
					"; Found: "+field.getFieldNumber(i));

			} catch (MissingFieldException e) {
				if (i==-1)
					System.out.println("[OK] (" + e.getMessage()+")");
				else if (i>=size)
					System.out.println("[OK] (" + e.getMessage()+")");
				else
					System.out.println("[FAILED] Invalid exception found (" + 
					e.getMessage()+")");
			}
		}
		System.out.println("[END] Reading numbers");
		System.out.println("\n"+field.toString());
	}
}

