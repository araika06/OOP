package Problem2;
import Problem2.Person;
public class Print{
public static void main(String[] args) {
	Person person1 = new Person("23B012", "Aliya", 16, Gender.FEMALE);
	Person person2 = new Person("23B013", "Mansur", Gender.MALE);
	
	
	System.out.println("Person 1: " + person1);
	System.out.println("Person 2: " + person2);
	System.out.println("Total persons: " + Person.getTotalPersons());
}
}
