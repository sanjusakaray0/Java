package thePowerOfSquares;
import java.util.Scanner;
public class PowerSquare {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	System.out.println(squareNumber(num));
	sc.close();
}
public static int squareNumber(int num) {
	return num*num;
}
}
