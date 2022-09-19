import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        year  = scanner.nextInt();
        if(year % 4 == 0){
            System.out.print(year + " Yılı artık bir yıldır.");
        }
        else if((year % 100 == 0) && (year % 400 == 0)){
            System.out.print(year + " Yılı artık bir yıldır.");
        }
        else {
            System.out.print(year + " ılı artık bir yıl değildir.");
        }
    }
}
