
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int right = 3;
        int balance = 1283;
        int select;
        String userName, password;
        Scanner input = new Scanner(System.in);

        while (right > 0) {


            System.out.print("Your Name : ");
            userName = input.nextLine();
            System.out.print("Your Password : ");
            password = input.nextLine();

            if (userName.equals("mert") && password.equals("mert123")) {
                System.out.println("Sisteme giriş yaptınız.");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1- Para Yatırma \n2- Para çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.println("Para Miktarı :");
                        int price = input.nextInt();
                        balance = balance + price;
                    } else if (select == 2) {
                        System.out.println("Para Miktarı :");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz");
                        } else {
                            balance = balance - price;
                        }



                    }
                    else if (select == 3) {
                        System.out.println("Bakiyeniz :" + balance);
                    }
                } while (select != 4);
                System.out.println("Hoşçakal.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                } else {
                    System.out.println("Kalan hakkınız" + right);
                }

            }
        }


    }
}
