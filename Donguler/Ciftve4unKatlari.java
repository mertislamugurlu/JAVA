/*
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve
 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/
import java.util.Scanner;
public class Ciftve4unKatlari {
    public static void main(String[] args) {
        int sayi=0,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Tek sayı girerseniz program biter: Değer girin = : ");



        /* Döngünün ne zaman sonlanacağı bilinmediği için while kullanma kararı alıyorum. */

        while (sayi % 2 == 0 ) {
            sayi = input.nextInt();

            if (sayi % 4 == 0){
                toplam += sayi;

            }


        }
        System.out.println("Program sonlandı");
        System.out.print("Girdiğiniz Çift ve 4'ün Katları Sayılarının Toplamı : " + toplam);











    }
}
