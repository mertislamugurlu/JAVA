

import java.util.Scanner;

public class AtmSwitchCase {
    public static void main(String[] args) {
        int right = 3;
        int balance = 1283;
        int select;
        int price;
        String userName, password;
        Scanner input = new Scanner(System.in);


        while (right > 0) {

            System.out.print("Adınız: ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();

            if (userName.equals("mert") && password.equals("mert123")) {
                System.out.println("Başarıyla giriş yaptınız");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                System.out.println("1- Para Yatırma \n2- Para çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                select = input.nextInt();
                if (select == 4) {
                    System.out.print("Çıkış yapıldı");
                    break;
                } else {
                    switch (select) {
                        case 1:
                            System.out.println("Para Miktarı :");
                            price = input.nextInt();
                            balance = balance + price;
                            break;
                        case 2:
                            System.out.println("Para Miktarı :");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz");
                            } else {
                                balance = balance - price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                            break;

                    }

                }


            } else {

                right--;
                System.out.println("Kullanıcı adı veya şifre hatalı.");
                if (right == 0) {
                    System.out.println("giriş hakkınız bitti");

                } else {
                    System.out.println("Kalan hakkınız: " + right);

                }


            }

        }
    }
}

