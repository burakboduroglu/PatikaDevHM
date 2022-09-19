import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number, tempNumber, digit, total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");

        number = scanner.nextInt();
        tempNumber = number;

        while (tempNumber > 0) {
            digit = tempNumber % 10;
            total += digit;
            tempNumber /= 10;
        }
        System.out.println("Toplam : " + total);
        scanner.close();
    }
}



