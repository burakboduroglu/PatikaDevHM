import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1, number2;

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak istediğiniz işlemin numarasını giriniz : ");
        int select = scan.nextInt();

        System.out.print("İlk Sayı : ");
        number1 = scan.nextInt();

        System.out.print("İkinci Sayı : ");
        number2 = scan.nextInt();

        switch (select){
            case 1 : System.out.print("Toplam : " + (number1+number2)); break;
            case 2:  System.out.print("Çıkarma : " + (number1-number2)); break;
            case 3:  System.out.print("Çarpma : " + (number1*number2)); break;
            case 4:  System.out.print("Bölme : " + (number1/number2)); break;

        }
    }
}
