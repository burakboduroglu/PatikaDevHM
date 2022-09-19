import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double kilo, height, index;
	    Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen boyunuzu giriniz : ");
		height = scan.nextDouble();

	    System.out.println("Lütfen kilonuzu giriniz : ");
	    kilo = scan.nextDouble();

	    index = kilo / (height * height);

	    System.out.println("Vücut Kitle İndeksiniz : " + index);
    }
}
