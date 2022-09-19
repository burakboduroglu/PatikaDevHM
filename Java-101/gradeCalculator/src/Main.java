import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, tarih, muzik;
        double ortalama;

        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik Notunuz : ");
        mat = scan.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = scan.nextInt();

        System.out.println("Kimya Notunuz :");
        kimya = scan.nextInt();

        System.out.println("Tarih Notunuz :");
        tarih = scan.nextInt();

        System.out.println("Müzik Notunuz :");
        muzik = scan.nextInt();

        System.out.println("Türkçe Notunuz :");
        turkce = scan.nextInt();

        ortalama = (mat + tarih + turkce + fizik + kimya + muzik)/6;

        if (ortalama < 60){
            System.out.println("Sınıfta Kaldınız.\nOrtalama: " + ortalama);
        }else{
            System.out.println("Sınıfı Geçtiniz.\nOrtalama: "+ ortalama);
        }

    }
}