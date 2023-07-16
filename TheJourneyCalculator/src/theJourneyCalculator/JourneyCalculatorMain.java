package theJourneyCalculator;
import java.util.Scanner;
public class JourneyCalculatorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		double speed = sc.nextDouble();
		double time=sc.nextDouble();
		System.out.printf("%.2f",journeyCalculator.calculateDistance(speed, time));
		sc.close();
	}
}
