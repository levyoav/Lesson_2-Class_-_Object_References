package personClassExample;

public class PersonTest2 {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		System.out.println(p1.getName());
		System.out.println(p1.getId());
		System.out.println(p1.getAge());
		
		System.out.println();
		Person p2 = new Person("Yosi", 102, 28);
		System.out.println(p2.getName());
		System.out.println(p2.getId());
		System.out.println(p2.getAge());
	}
}
