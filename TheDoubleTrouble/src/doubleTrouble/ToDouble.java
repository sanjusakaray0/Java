package doubleTrouble;
import java.util.Scanner;
public class ToDouble {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(doubleTheNumber(n));
	sc.close();
}
public static int doubleTheNumber(int num) {
	return num * 2;
}
}
