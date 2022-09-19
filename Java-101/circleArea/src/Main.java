import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        double centralAngle, result;
        Scanner scan = new Scanner(System.in);

        System.out.println("Dairenin Yarıçapı : ");
        r = scan.nextInt();

        System.out.println("Dairenin Merkez Açı Ölçüsü : ");
        centralAngle = scan.nextDouble();

        result = (pi*(r*r)*centralAngle)/360;
        System.out.println("Daire diliminin alanı : " + result);


    }
}
