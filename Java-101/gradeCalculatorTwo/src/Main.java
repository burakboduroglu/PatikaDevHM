import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] lectures = {"Türkçe", "Matematik", "Fizik", "Kimya", "Müzik"};
        Scanner scan = new Scanner(System.in);
        int grade, totalGrade = 0;
        double average;

        for (String lecture : lectures) {
            System.out.print(lecture + " Notu : ");
            grade = scan.nextInt();

            if (grade < 0 || grade > 100){
                grade = 0;
                System.out.println("Girilen not değeri istenilen aralıkta olmadığı için 0 olarak alınacaktır.\n");
            }else{
                totalGrade += grade;
            }
        }
        average = totalGrade/5;
        System.out.print("Ortalamanız : " + average);


    }
}
