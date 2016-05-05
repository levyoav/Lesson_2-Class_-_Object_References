package personClassExample;

public class PersonTest {

	public static void main(String[] args) {

		// instantiating an object
		Person p1 = new Person();

		// assign attributes values
		p1.setName("David");
		p1.setId(101);
		p1.setAge(25);

		// printing attribute values
		System.out.println(p1.getName());
		System.out.println(p1.getId());
		System.out.println(p1.getAge());
	}

}
