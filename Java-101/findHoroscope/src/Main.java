import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int month, day;
        String horoscope = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğduğunuz Ay (1-12) : ");
        month = scanner.nextInt();

        System.out.println("Doğduğunuz Gün : ");
        day = scanner.nextInt();

        //January
        if((day >=1) && (day <=31) && (month == 1)){
            if((day < 22)) {
                horoscope = "Oğlak";
            }
            else {
                horoscope = "Kova";
            }
        }

        //February
        else if((day >= 1) && (day <= 28) && (month == 2)){
            if((day < 20)) {
                horoscope = "Kova";
            }
            else {
                horoscope = "Balık";
            }
        }

        //March
        else if((day >= 1) && (day <= 31) && (month == 3)){
            if((day < 21)) {
                horoscope = "Balık";
            }
            else {
                horoscope = "Koç";
            }
        }

        //April
        else if((day >= 1) && (day <= 30) && (month == 4)){
            if((day < 21)) {
                horoscope = "Koç";
            }
            else {
                horoscope = "Boğa";
            }
        }

        //May
        else if((day >= 1) && (day <= 31) && (month == 5)){
            if((day < 22)) {
                horoscope = "Boğa";
            }
            else {
                horoscope = "İkizler";
            }
        }

        //June
        else if((day >= 1) && (day <= 30) && (month == 6)){
            if((day < 23)) {
                horoscope = "İkizler";
            }
            else {
                horoscope = "Yengeç";
            }
        }

        //July
        else if((day >= 1) && (day <= 31) && (month == 7)){
            if((day < 23)) {
                horoscope = "Yengeç";
            }
            else {
               horoscope = "Aslan";
            }
        }

        //August
        else if((day >= 1) && (day <= 31) && (month == 8)){
            if((day < 23)) {
                horoscope = "Aslan";
            }
            else {
                horoscope = "Başak";
            }
        }

        //September
        else if((day >= 1) && (day <= 30) && (month == 9)){
            if((day < 23)) {
                horoscope = "Başak";
            }
            else {
                horoscope = "Terazi";
            }
        }

        //October
        else if((day >= 1) && (day <= 31) && (month == 10)){
            if((day < 23)) {
                horoscope = "Terazi";
            }
            else {
                horoscope = "Akrep";
            }
        }

        //September
        else if((day >= 1) && (day <= 30) && (month == 11)){
            if((day < 22)) {
                horoscope = "Akrep";
            }
            else {
                horoscope = "Yay";
            }
        }

        //December
        else if((day >= 1) && (day <= 31) && (month == 12)){
            if((day < 22)) {
                horoscope = "Yay";
            }
            else {
                horoscope = "Oğlak";
            }
        }

        else{
            System.out.println("Geçerli bir tarih değeri girilmedi.");
        }
        System.out.println("Burcunuz : " + horoscope);
    }
}
