


import java.util.Scanner;

public class AsalsayiRecursive {

    static int bolenAdedi(int n, int i) {
        if (i == 0)
            return 0;

        if (n % i == 0) {
            return 1 + bolenAdedi(n, i - 1);
        } else {
            return bolenAdedi(n, i - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı: ");
        int n = sc.nextInt();

        int bolenSayisi = bolenAdedi(n, n);
        System.out.println(n + " sayısının bölen sayısı: " + bolenSayisi);

        if (bolenSayisi == 2) {
            System.out.println(n + " asal sayıdır");
        } else {
            System.out.println(n + " asal sayı değildir");
        }


    }

}
