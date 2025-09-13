
import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        int toplam = 0;
        System.out.println("Bir sayı giriniz :");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                toplam = toplam + i;
            }
        }

        if (N == toplam) {
            System.out.println(N + "Mükemmel sayıdır");
        }
        else {
            System.out.println(N + "Mükemmel sayı değildir");
        }


    }
}
