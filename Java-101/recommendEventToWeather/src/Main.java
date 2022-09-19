import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weather;

        System.out.print("Hava sıcaklığını giriniz -> ");
        weather = scanner.nextInt();
        if (weather < 5){
            System.out.print("Kayak yapabilirsiniz.");
        }
        else if(weather > 5 && weather < 15){
            System.out.print("Sinemaya gidebilirsiniz");
        }
        else if(weather > 10 && weather < 25){
            System.out.print("Pikniğe gidebilirsiniz");
        }
        else {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }
    }
}
