package timeConverter;
import java.util.Scanner;
public class TimeConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minutes = sc.nextInt();
		System.out.println(convertToHours(minutes));
		sc.close();
	}
	public static double convertToHours(int minutes) {
		return minutes/60.0;
	}
}
