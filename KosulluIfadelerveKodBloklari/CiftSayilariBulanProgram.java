

import java.util.Scanner;

public class CiftSayilariBulanProgram {
    public static void main(String[] args) {
        int sayi = 0, toplam = 0, miktar = 0;


        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        sayi = input.nextInt();

        if (sayi <0) {
            System.out.print("Negatif bir sayı girdiniz. ");
        }
        else if (sayi <= 11) {
            System.out.println("3 ve 4 e bölünen bir sayı bulunamadı. ");
        }


        for (int i = 0; i <= sayi; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                miktar++;
            }
        }

        if (miktar > 0) {                                                           // Sayı adedi kontrolü
            System.out.println("Ortalama: " + ((float) toplam / miktar));
        }
    }

}



