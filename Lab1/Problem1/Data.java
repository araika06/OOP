package Problem1;
import java.util.Scanner;
public class Data {
	private double sum;
	private double max;
	private int count;
	
	public Data() {
		this.sum = 0;
		this.max = Double.MIN_VALUE;
		this.count = 0;
	}
	
	public void addValue(double value) {
		sum += value;
		if(value > max) {
			max = value;
		}
		count++;
	}
	
	public double getAverage() {
		if(count == 0) {
			return 0;
		}
		return sum/count;
	}
	
	public double getMaxValue() {
		if(count == 0) {
			return 0;
		}
		return max;
	}
	
}