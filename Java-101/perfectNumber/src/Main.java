import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = scanner.nextInt();
        int total = 0;

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                total += i;
            }
        }
        if(number == total){
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }

    }
}
