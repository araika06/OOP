package Problem1;
import java.util.Scanner;
public class Print {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Data data = new Data();
		
		String input;
		
		while(true) {
			System.out.println("Enter number (Q to quit): ");
			input = scanner.nextLine();
			
			if (input.equalsIgnoreCase("Q")) {
                break;
            }
			
			try {
				double value = Double.parseDouble(input);
				data.addValue(value);
			}
			catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or Q to quit.");
            }
		}
		System.out.println("Average = " + data.getAverage());
		System.out.println("Maximum = " + data.getMaxValue());
		
		scanner.close();
	}
}
