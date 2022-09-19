import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result  = 1, number1, number2;

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        number1 = scanner.nextInt();

        System.out.print("Üssü giriniz : ");
        number2 = scanner.nextInt();

        for(int i = 1; i <= number2; i++){
            result *= number1;
        }
        System.out.print("Sonuç : " + result);
    }
}
