import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int km, age, tripType;
        double totalPrice, ageDiscount = 0, tripDiscount = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz (KM cinsinden): ");
        km = scanner.nextInt();

        System.out.print("Yaşınızı Giriniz : ");
        age = scanner.nextInt();

        System.out.print("1-) Tek Yön\n2-) Gidiş Dönüş\nYolculuk tipini belirtiniz (1-2): ");
        tripType  = scanner.nextInt();

        if((km > 0) && (age > 0) && (tripType == 1 || tripType == 2)){
            totalPrice = km * 0.1;
            if(age < 12){
                ageDiscount = totalPrice * 0.5;
            }
            else if (age >= 12 && age <= 24){
                ageDiscount = totalPrice * 0.1;
            }
            else if(age > 65){
                ageDiscount = totalPrice * 0.3;
            }
            totalPrice -= ageDiscount;
            if(tripType == 2){
                tripDiscount = totalPrice * 0.2;
                totalPrice -= tripDiscount;
                System.out.print("\nToplam Tutar = " + totalPrice*2);
            }else{
                System.out.print("\nToplam Tutar : " + totalPrice);
            }

        }else{
            System.out.print("\nHatalı Veri Girdiniz!");
        }
    }
}
