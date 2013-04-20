package aufg1.aufg14;

public class Field {
	private int[] values;
	
	public Field(int size) {
		this.values = new int[size];
	}
	
	public void setFieldNumber(int position, int value) throws MissingFieldException {
		if (position < 0) {
			throw new MissingFieldException("position has to be positive");
		} else if (position >= values.length) {
			throw new MissingFieldException("position is out of range.");
		}
		
		this.values[position] = value;
	}
	
	public int getFieldNumber(int position) throws MissingFieldException {
		if (position < 0) {
			throw new MissingFieldException("position has to be positive.");
		} else if (position >= values.length) {
			throw new MissingFieldException("position is out of range.");
		}
		
		return this.values[position];
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (int i = 0; i < this.values.length; i++) {
			sb.append(" " + this.values[i]);
			
			if (i < this.values.length -1) {
				sb.append(",");
			}
		}
		sb.append(" }");
		return sb.toString();
	}
}
