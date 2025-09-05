/* Armstrong Sayılar */

import java.util.Scanner;

public class ArmstongSayi {
    public static void main(String[] args) {

        int sayi, basamaksayisi = 0, gecicisayi = 1, sonrakam = 0 , toplam=0 , tmp;
        System.out.print("Bir sayı girin :");
        Scanner tara = new Scanner(System.in);
        sayi = tara.nextInt();


        gecicisayi = sayi;
        tmp = sayi;
        while (sayi != 0) {
            sayi = sayi / 10;
            basamaksayisi++;
        }
        System.out.println("Girilen Sayının Basamak Sayısı :" + basamaksayisi);



        while (gecicisayi != 0) {

            sonrakam = gecicisayi % 10;
            gecicisayi = gecicisayi / 10;
            int k=1;
            for (int i = 1; i <= basamaksayisi; i++) {
                k = k * sonrakam;

        }
            toplam = toplam + k;
        }



        if (tmp == toplam) {System.out.println("Armstrong sayıdır.");
        }
        else {System.out.println("Armstrong sayı değildir.");}



        System.out.println("Girilen Sayının Üsleri Toplamı  :" + toplam);


    }
}



