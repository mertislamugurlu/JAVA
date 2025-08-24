/*
Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
*/
import java.util.Scanner;
public class NegatifSayiGirinceDurTekSayilarTopla {
    public static void main(String[] args) {
        int sayi=0,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Negatif bir değer girerseniz program biter: Değer girin = : ");



/* Döngünün ne zaman sonlanacağı bilinmediği için while kullanma kararı alıyorum. */

        while (sayi >= 0 ) {
            sayi = input.nextInt();

            if (sayi % 2 == 1){
                toplam += sayi;

            }

        }
        System.out.println("Program sonlandı");
        System.out.print("Girdiğiniz Tek Sayıların Toplamı : " + toplam);











    }
}
