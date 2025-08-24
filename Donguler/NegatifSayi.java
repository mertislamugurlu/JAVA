/* Kullanıcıdan negatif sayı girene kadar sayı isteyen program
* while ve for ile
*
*  */
import java.util.Scanner;
public class NegatifSayi {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);

        for (sayi = 0; sayi >= 0;) {
            System.out.print("Sayı Giriniz: ");
            sayi = input.nextInt();
        }

        System.out.print("Negatif Sayı Girdiniz. ");


    }
}

