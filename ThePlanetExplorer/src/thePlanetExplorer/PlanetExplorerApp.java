package thePlanetExplorer;
import java.util.Scanner;
public class PlanetExplorerApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	PlanetExplorer explorer = new PlanetExplorer();
	double radius = sc.nextDouble();
	System.out.printf("%.2f",explorer.calculateSurfaceArea(radius));
	sc.close();
}
}
