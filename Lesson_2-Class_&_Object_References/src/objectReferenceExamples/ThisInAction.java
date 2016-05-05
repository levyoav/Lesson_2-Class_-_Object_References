package objectReferenceExamples;

public class ThisInAction {
	
	public static void main(String[] args) {
		
		Box b1 = new Box(1, 1, 1);
		b1.setX(100); // non static (has this reference)
		
	}
	
}
