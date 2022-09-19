import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, pow1, pow2;

        System.out.print("Sayı Giriniz : ");
        number = scanner.nextInt();

        System.out.print("Dört sayısının kuvvetleri :\n");
        for (int i = 1; i <= number;i++){
           pow1 = (int)(Math.pow(4, i));
           if(pow1 >= 100){
              break;
           }else {
               System.out.print(pow1 + " ");
           }
        }

        System.out.print("\nBeş sayısının kuvvetleri :\n");
        for (int i = 0; i <= number; i++){
            pow2 = (int)(Math.pow(5, i));
            if(pow2 >= 100){
                break;
            }else {
                System.out.print(pow2 + " ");
            }
        }
    }
}
