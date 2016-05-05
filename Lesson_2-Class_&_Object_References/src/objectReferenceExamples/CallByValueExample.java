package objectReferenceExamples;

public class CallByValueExample {
	
	//A static method can be invoked without using a reference to an object of the 
	//class it was declared in. It can be invoked directly from the class.
	public static void changeVal(int num) {
		num = 3; //This reference does not refer to the same value as the original num. Thus, it changes nothing.
	}
	
	//A COPY of the reference of the original Box object (b1 from main) is received.
	public static void changeRef(Box b1) {
		//The details of the original Box object with the values (1,1,1) are printed. This b1 is a second reference to the
		//original Box object from main.
		b1.printDetails(); 
		
		//A new Box object with the values (2,2,2) is created on the heap and is referenced by THIS b1 (the b1 of the method) 
		//that was a reference to the old Box object. The old Box object is now referenced only by the original b1 reference 
		//from main and is not being garbage collected.
		b1 = new Box(2, 2, 2);
		b1.printDetails(); //The details of the new Box object with the values  (2,2,2) are printed.
	}
	
	//A COPY of the reference of the original Box object (b1 from main) is received.
	public static void changeObjectAttributes(Box b1) {
		b1.printDetails(); //The details of the original Box object with the values (1,1,1) are printed.
		b1.setX(9); //The x attribute of the original Box object is changed to 9 using the copy of the original reference.
		b1.printDetails(); //The details of the original Box object with the values (9,1,1) are printed.
	}
	
	public static void main(String[] args) {
		
		int num = 10; //num is a primitive reference variable set to the value 10.
		
		//Invoking a static method via the class. No need to instantiate an object from that class to access a static method.
		CallByValueExample.changeVal(num); //A copy of the int PRIMITIVE value (10) is sent to the method. Not a copy of the reference num.  
		System.out.println(num); //10 will be printed since the method did not affect the value referenced by num.  
		
		Box b1 = new Box(1, 1, 1); //b1 is an OBJECT reference of type Box.
		
		//A COPY of the REFERENCE is sent to the method. The copy affects the same object as the
		//original reference b1.
		CallByValueExample.changeRef(b1);
		
		//This b1 is the original reference to the first Box object. After the method changeRef() is done, the copy of the reference 
		//that was given a new Box object was destroyed, and thus the new Box object has no reference and thus should be garbage collected. 
		//The details of the original Box object with(1,1,1) are printed.
		b1.printDetails();
		
		//A COPY of the REFERENCE is sent to the method. The copy affects the same object as the
		//original reference b1.
		CallByValueExample.changeObjectAttributes(b1);
		
		//This time, the method changeObjectAttribute() affected the original Box object by using a copy of the original Box reference, b1.
		//As before, once the method is done, the copy of the reference b1 to the original Box object was destroyed, but the original reference wasn't.
		//So the original object is still referenced by this b1 and is not being garbage collected. 
		b1.printDetails(); //The detail of the original Box object with the values (9,1,1) are printed.
	}
}
