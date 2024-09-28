package Problem3;
public class Test extends Temperature{
	public static void main(String[] args) {
		Temperature t1 = new Temperature();
		t1.setTemperature(100, Scale.C);
		System.out.println(t1.toCelsius() + "\n" + t1.toFahrenheit());
	}
}
