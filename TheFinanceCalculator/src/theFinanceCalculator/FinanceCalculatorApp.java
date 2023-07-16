package theFinanceCalculator;
import java.util.Scanner;
public class FinanceCalculatorApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	FinanceCalculator calculator = new FinanceCalculator();
	double principal = sc.nextDouble();
	double rate = sc.nextDouble();
	double time = sc.nextDouble();
	System.out.printf("%.2f",calculator.calculateSimpleInterest(principal, rate, time));
	sc.close();
}
}
