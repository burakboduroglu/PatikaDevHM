import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float tutar, kdvTutar, sonTutar;
        Scanner scan = new Scanner(System.in);

        System.out.println("Tutar Giriniz: ");
        tutar = scan.nextFloat();

        if((tutar > 0) && (tutar <= 100)){
            kdvTutar = tutar * 18/100;
            sonTutar = kdvTutar + tutar;
            System.out.println("Toplam Tutar: " + sonTutar + "\n" + "KDV Tutarı: " + kdvTutar);
        }else{
            kdvTutar = tutar * 8/100;
            sonTutar = kdvTutar + tutar;
            System.out.println("Toplam Tutar: " + sonTutar + "\n" + "KDV Tutarı: " + kdvTutar);
        }

    }
}
