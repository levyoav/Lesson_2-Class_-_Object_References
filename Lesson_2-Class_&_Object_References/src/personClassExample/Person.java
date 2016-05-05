package personClassExample;

/*
 * This is a demo class
 * It shows how to define class members
 * attributes
 * CTORs
 * methods
 * */

/**
 * The Person class represents a person with name, age and ID attributes.
 * */
public class Person {

	// attributes
	private String name; //Person name
	private int id; //Person ID
	private int age; //Person age

	// CTOR 1
	/**
	 * This CTOR creates a person object with default initial state.
	 * name: defaultName, id: -1, age: 18
	 */
	public Person() {
		name = "defaultName";
		id = -1;
		age = 18;
	}

	// CTOR 2
	/**
	 * This CTOR receives parameters to be assigned to the Person object's attributes.  
	 * @param nameArg
	 * @param idArg
	 * @param ageArg
	 */
	public Person(String nameArg, int idArg, int ageArg) {
		name = nameArg;
		id = idArg;
		age = ageArg;
	}

	// methods
	/**
	 * prints the details of this person.
	 * */
	public void printDetails() {
		System.out.print("name: ");
		System.out.print(name);
		System.out.print(", ID: ");
		System.out.print(id);
		System.out.print(", age: ");
		System.out.println(age);

	}

	// getters and setters (methods)
	public void setName(String nameArg) {
		name = nameArg;
	}

	public String getName() {
		return name;
	}

	public void setId(int idArg) {
		id = idArg;
	}

	public int getId() {
		return id;
	}

	public void setAge(int ageArg) {
		age = ageArg;
	}

	public int getAge() {
		return age;
	}

}
