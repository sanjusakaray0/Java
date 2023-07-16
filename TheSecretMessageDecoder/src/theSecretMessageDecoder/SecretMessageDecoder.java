package theSecretMessageDecoder;
import java.util.Scanner;
public class SecretMessageDecoder {
public static void main(String[] args) {
	MessageDecoder decoder = new MessageDecoder();
	Scanner sc = new Scanner(System.in);
	char ch=sc.nextLine().charAt(0);
	System.out.println(decoder.decodeCharacter(ch));
	sc.close();
}
}
