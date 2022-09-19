import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0, min  = 0, inputNumber;
        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        int number = scanner.nextInt();

        for(int i = 1; i <= number; i++){
            System.out.print(i + ". Sayı : ");
            inputNumber = scanner.nextInt();
            if(i == 1){
                max = inputNumber;
                min = inputNumber;
            } else {
                if(inputNumber > max){
                    max = inputNumber;
                }
                else if (inputNumber < min){
                    min = inputNumber;
                }
            }
        }
        System.out.println("Maksimum Sayı : " + max);
        System.out.println("Minimum Sayı : " + min);
    }
}
