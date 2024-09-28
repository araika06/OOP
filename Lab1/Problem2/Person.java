package Problem2;

public class Person {
	private static int totalPersons=0;
	
	private final String id;
	
	private String name;
	private int age;
	private Gender gender;
	
	{
		this.age = 0;
	}
	
	public Person(String id, String name, int age, Gender gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		totalPersons++;
	}
	
	public Person(String id, String name, Gender gender) {
		this(id, name, 0, gender);
	}
	
	
	public static int getTotalPersons() {
		return totalPersons;
	}
	
	public String getName() {
		return this.name;
	}
	public  String toString() {
		return "Id: " + this.id + "\nName: " + this.name + "\nAge: " + this.age + "\nGender: " + this.gender;
	}
	
	
}
