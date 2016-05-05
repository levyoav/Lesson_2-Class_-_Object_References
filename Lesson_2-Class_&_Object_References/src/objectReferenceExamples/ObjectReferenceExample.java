package objectReferenceExamples;

import personClassExample.Person;

public class ObjectReferenceExample {

	public static void main(String[] args) {
		//p1 is a Person type reference variable to an object of type Person.
		Person p1 = new Person("David", 101, 22); 
		
		//p2 is also a Person type reference variable that is assigned the same reference to the same object. There is not 
		//another object of type Person being created on the heap. Only a new reference, p2, to the same object is created on
		//the stack.
		Person p2 = p1;
		
		//Printing the details of the same object.
		p1.printDetails();
		p2.printDetails();
		
		//Both p1 and p2 affect the same object.
		p1.setName("Yosi"); //Changing the name attribute of the object using the reference p1. 
		p2.printDetails(); //Printing the details of the same object by using the reference p2.
	}
}
