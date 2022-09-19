import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int kilo;
	    double pear = 2.14 ,apple = 3.67 ,tomato = 1.11 ,banana = 0.95, aubergine = 5, total = 0;
	    Scanner scan = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? : ");
        kilo  = scan.nextInt();
        total += kilo * pear;

        System.out.println("Elma Kaç Kilo ? : ");
        kilo  = scan.nextInt();
        total += kilo * apple;

        System.out.println("Domates Kaç Kilo ? : ");
        kilo  = scan.nextInt();
        total += kilo * tomato;

        System.out.println("Muz Kaç Kilo ? : ");
        kilo  = scan.nextInt();
        total += kilo * banana;

        System.out.println("Patlıcan Kaç Kilo ? : ");
        kilo  = scan.nextInt();
        total += kilo * aubergine;

       System.out.println("Toplam Tutar : " + total);
    }
}
