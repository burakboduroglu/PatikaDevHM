import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean oddNumber = false;
        Scanner scanner = new Scanner(System.in);
        int number, total = 0;

        do {
            System.out.print("Sayı Giriniz : ");
            number = scanner.nextInt();
            if(number % 2 == 1){
                oddNumber = true;
            }else{
                if((number % 4 == 0)){
                    total += number;
                }
            }
        }while(oddNumber != true);
        System.out.print("Toplam Sonuç : " + total);
    }
}
