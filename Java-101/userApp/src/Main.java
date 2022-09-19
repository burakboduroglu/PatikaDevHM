import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String userName, password1, change, passwordControl, password2, password = "123";
        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı Adı : ");
        userName = scan.nextLine();

        System.out.print("Şifre : ");
        password1 = scan.nextLine();

        if (userName.equals("patika") && password1.equals("123")){
            System.out.print("Giriş Başarılı.");
        }else{
            System.out.println("Kullanıcı adı veya şifre yanlış.\nŞifre değişikliği yapmak istiyor musunuz? Y/N");
            change = scan.nextLine();
            if (change.equals("Y")){
                System.out.print("Yeni Şifre -> ");
                password2 = scan.nextLine();

                System.out.print("Yeni Şifre Onay -> ");
                passwordControl = scan.nextLine();

                if (password2.equals(password) && passwordControl.equals(password)){
                    System.out.println("Eski şifre ve yeni şifre aynı.");
                }
                else if (password2.equals(passwordControl)){
                    System.out.println("Şifre Değiştirildi.");
                }
                else{
                    System.out.println("Şifre Değiştirilemedi.");
                }
            }
        }

    }
}
