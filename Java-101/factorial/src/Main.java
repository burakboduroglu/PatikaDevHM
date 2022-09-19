import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r;
        int subtraction;
        double result;

        System.out.print("C(n,r) 'n' değeri -> ");
        n = scanner.nextInt();

        System.out.print("C(n,r) 'r' değeri -> ");
        r = scanner.nextInt();

        subtraction = n - r;

        n = factorial(n);
        r = factorial(r);
        subtraction = factorial(subtraction);

        result = n/(r * subtraction);
        System.out.print("Kombinasyonun Cevabı : " + result);
    }

    public static int factorial(int x){
        int result = 1;

        for(int i = 1; i <= x; i++){
          result *= i;
        }
        return result;
    }
}
