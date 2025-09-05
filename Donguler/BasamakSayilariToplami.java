/* Bir sayının basamak sayılarının toplamını hesaplayan program yazınız. */
import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        int sayi,gecicisayi,sonrakam,basamaksayisi=0,toplam=0,tmp=0;


        Scanner tara = new Scanner(System.in);
        System.out.print("Sayıyı girin:");
        sayi = tara.nextInt();
        gecicisayi = sayi; // sayıyı geçici sayıya ata


        while (gecicisayi != 0) {

            gecicisayi = gecicisayi % 10; //gecici sayının 10a bölümünden kalanı gecici sayiya sonrada
            sonrakam = gecicisayi; // sonrakama atadım
            sayi = sayi / 10; // orijinal sayim i 10 a bölerek while içinde geçici sayı gibi tükettim
            gecicisayi = sayi; // gecicisayi = sayi diyerek örneğin sayı 128 ise 10 a bölmüştük 12 oldu
            toplam = toplam + sonrakam; // ve toplam 0 dı toplam + sonrakam

            // bu döngü gecicisayi tüketilene kadar döner


            }
            System.out.print(toplam);


        }



    }

