
import java.util.Scanner;

public class YildizlarlaUcgen {
    public static void main(String[] args) {
        int yildiz = 0, girilensayi, topla = 0;
        System.out.print("Adım sayısını giriniz: ");
        Scanner input = new Scanner(System.in);
        yildiz = input.nextInt();
        girilensayi = yildiz;


        for (int i = 1; i <= girilensayi; i++) {
            for (int j = 1; j <= (girilensayi - i); j++) { //girilen sayı -1 boşluk
                System.out.print(" ");


            }

            for (int j = 0; j <= (2 * i- 1) ; j++) {
                System.out.print("*");
            }

            System.out.println();

        }


    }
}

