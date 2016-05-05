package personImportExample; // package declaration

//Import the class Person from another package for not having to use the fully 
//qualified name of the class in the code. 

import personClassExample.Person;

//Using the same class name here and in the other package:
public class PersonTest {

	public static void main(String[] args) {

		Person p1 = new Person("David", 101, 25);
		Person p2 = new Person("Yosi", 102, 15);
		
		p1.printDetails();
		p2.printDetails();

	}

}
