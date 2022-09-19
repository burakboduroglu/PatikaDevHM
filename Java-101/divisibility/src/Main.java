import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number, total = 0, result;
        int count = 0;


        System.out.print("Sayı Giriniz : ");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                total += i;
                count++;
            }
        }
        result = total / count;
        System.out.print("Ortalama : " + result);




    }
}
