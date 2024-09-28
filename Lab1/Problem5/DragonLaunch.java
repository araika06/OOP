package Problem5;
import java.util.Vector;
import Problem5.Gender;
import Problem5.Person;
public class DragonLaunch {
	private Vector<Person>kidnapStudents;
	
	private DragonLaunch() {
		kidnapStudents = new Vector<>();
	}
	
	public void kidnap(Person p) {
		kidnapStudents.add(p);
	}
	
	public void WillDragonEatOrNot() {
		int index = 0;
		while(index < kidnapStudents.size()-1) {
			if(kidnapStudents.get(index).getGender() == Gender.B && kidnapStudents.get(index + 1).getGender() == Gender.G) {
				
				kidnapStudents.remove(index);
				kidnapStudents.remove(index);
				
				index = Math.max(0, index - 1);
			}
			else {
				index++;
			}
		}
		
		if(kidnapStudents.isEmpty()) {
			System.out.println("No students left for lunch");
			}
		else {
			System.out.println("Students left for lunch" + kidnapStudents);
			}
		}
	public static void main(String[] args) {
		
		DragonLaunch dragonlaunch = new DragonLaunch();
		
		dragonlaunch.kidnap(new Person("Aliya ", Gender.G));
		dragonlaunch.kidnap(new Person("Mansur ", Gender.B));
		dragonlaunch.kidnap(new Person("Azhar ", Gender.G));
		dragonlaunch.kidnap(new Person("Rasul ", Gender.B));
		dragonlaunch.kidnap(new Person("Aruzhan ", Gender.G));
		dragonlaunch.kidnap(new Person("Azat ", Gender.B));
		
		dragonlaunch.WillDragonEatOrNot();
	}
}

