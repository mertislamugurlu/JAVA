/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
Senaryo
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

*/

import java.util.Scanner;
public class AsalSayilariBulanProgram {
    public static void main(String[] args) {
        int toplam = 0,sayac=1,sayi=100;
        Scanner input = new Scanner(System.in);

        for (int i = 2; i <= sayi; i++) {
            int bolenadedi = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    bolenadedi++;
                }

            }
            if (bolenadedi == 2) {
                System.out.print(i + " ");
            }

        }

    }
}
