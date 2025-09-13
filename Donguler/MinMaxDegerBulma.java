
import java.util.Scanner;

public class MinMaxDegerBulma {
    public static void main(String[] args) {
        int girileceksayi = 0, sayi, buyuksayi = 0, kucuksayi = 0, gecicisayi;
        System.out.println("Kaç tane sayı gireceksiniz:");
        Scanner sc = new Scanner(System.in);
        girileceksayi = sc.nextInt();

        for (int j = 1; j <= girileceksayi; j++) {
            System.out.print(j + ".Sayıyı Giriniz :");
            gecicisayi = sc.nextInt();
            sayi = gecicisayi;
            if (j == 1) {           //Donguye girdiginde ilk referans deger 1 buyuk ve kucuk sayiyi girilen ilk degere esitle
                buyuksayi = sayi;
                kucuksayi = sayi;
            }

            else if (sayi > buyuksayi) {    // daha sonrasinda j degeri artacagi icin else if bloklarını kontrol et ve guncelle
                buyuksayi = sayi;
            }
            else if (sayi < kucuksayi ) {
                kucuksayi = sayi;
            }

        }
        System.out.println("Buyuk sayi: " + buyuksayi);
        System.out.println("Kucuk sayi: " + kucuksayi);
    }

}

