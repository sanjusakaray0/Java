package theTemperatureConverter;
import java.util.Scanner;
public class TemperatureConverterApp {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	TemperatureConverter temperatureConverter = new TemperatureConverter();
	double fahrenheit = scanner.nextDouble();
	System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
	scanner.close();
}
}
