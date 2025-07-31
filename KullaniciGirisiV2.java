/* Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak
isterse yeni girdiği şifrenin unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip, şifreler aynı ise ekrana "Şifre oluşturulamadı,
lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız. */

import java.util.Scanner;

public class KullaniciGirisiV2 {
    public static void main(String[] args) {
        String kullaniciAdi, sifre, yeniSifre;
        kullaniciAdi = "mert";
        sifre = "java123";
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Girin :");
        kullaniciAdi = input.nextLine();

        System.out.print("Sifrenizi Girin :");
        sifre = input.nextLine();

        if (kullaniciAdi.equals("mert") && sifre.equals("java123")) {
            System.out.println("Başarıyla Giriş Yaptınız.");
        }
        else if(!kullaniciAdi.equals("mert")) {
            System.out.println("Kullanıcı adı hatalı.");
            }
        else {
            System.out.println("Şifre hatalı.\n1- Şifreyi Sıfırla\n2- Çıkış Yap");
            int cevap = input.nextInt();
            input.nextLine();//boşluk silme


        if (cevap == 1) {
            System.out.println("Yeni Şifreyi Girin");
            yeniSifre = input.nextLine();

            if (yeniSifre.equals("java123")) { //<-- if içerisinde if
                System.out.println("Yakın tarihte kullanmadığınız farklı bir şifre girin.");
            } //<--
            else { //<--
                System.out.println("Şifre başarıyla oluşturuldu");
            }; //<--

        }
        else {
            System.out.println("Çıkış Yapıldı.");
        }

    }
}
}