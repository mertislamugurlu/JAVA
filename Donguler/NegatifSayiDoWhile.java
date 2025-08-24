/* Kullanıcıdan negatif sayı girene kadar sayı isteyen program
 * while ve for ile
 *
 *  */

import java.util.Scanner;

public class NegatifSayiDoWhile {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        sayi = 0;
        do {
            System.out.println("Sayı Girin:");
            sayi = input.nextInt();
        } while (sayi >= 0);
        System.out.println("Negatif Sayı Girdiniz.");

    }
}

