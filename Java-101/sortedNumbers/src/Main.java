import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, second, third;

        System.out.println("İlk Numara : ");
        first = scanner.nextInt();

        System.out.println("İkinci Numara : ");
        second = scanner.nextInt();

        System.out.println("Üçüncü Numara : ");
        third = scanner.nextInt();

        if((first < second) && (first < third)){
            if(second < third){
                System.out.println(first + "<" + second + "<" + third);
            }else{
                System.out.println(first + "<" + third + "<" + second);
            }
        }
        else if((second < first) && (second < third)){
            if(first < third){
                System.out.println(second + "<" + first + "<" + third);
            }else{
                System.out.println(second + "<" + third + "<" + first);
            }
        } else {
            if(first > second){
                System.out.println(third + "<" + second + "<" + first);
            }else {
                System.out.println(third + "<" + first + "<" + second);
            }
        }
    }
}
