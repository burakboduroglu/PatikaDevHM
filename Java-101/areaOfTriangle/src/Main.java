import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ilkKenar, ikinciKenar, ucuncuKenar, cevre;
        double alan;

        System.out.println("İlk Kenar : ");
        ilkKenar = scan.nextInt();

        System.out.println("İkinci Kenar : ");
        ikinciKenar = scan.nextInt();

        System.out.println("Üçüncü Kenar : ");
        ucuncuKenar = scan.nextInt();

        cevre = (ilkKenar+ikinciKenar+ucuncuKenar);
        double u = cevre / 2;

        alan = u * (u-ilkKenar) * (u-ikinciKenar) * (u-ucuncuKenar);

        System.out.println("Çevre : " + cevre + "\n" + "Alan : " + Math.sqrt(alan));
    }
}
