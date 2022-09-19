import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double taximeter = 10;
        double perKm = 2.20, totalPrice;
        int km;

        Scanner scan = new Scanner(System.in);
        System.out.println("KM cinsinden mesafeyi giriniz : ");
        km = scan.nextInt();

        totalPrice = (km * perKm) + taximeter;

        if(totalPrice < 20){
            System.out.println("Toplam Tutar : 20 Tl");
        }else{
            System.out.println("Toplam Tutar : " + totalPrice);
        }
    }
}
