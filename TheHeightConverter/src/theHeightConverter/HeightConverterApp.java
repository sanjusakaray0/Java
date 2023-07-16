package theHeightConverter;
import java.util.Scanner;
public class HeightConverterApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HeightConverter converter = new HeightConverter();
	double inches = sc.nextDouble();
	System.out.printf("%.2f",converter.convertInchesToFeet(inches));
	sc.close();
}
}
