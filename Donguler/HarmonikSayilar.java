
import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {

        double N, harmonik = 0, toplam = 0, sayac = 0 , sonuc=0;
        Scanner input = new Scanner(System.in);
        System.out.print("N Değerini Giriniz :");
        N = input.nextInt();

        for (double i = 1; i < N; i++) {
            harmonik = harmonik + (1 / (i + 1));
            System.out.println(i + ". " + harmonik);
            sayac = sayac + (1 / (i + 1));
        }
        System.out.println(harmonik);
        //harmonik = harmonik - sayac;
        toplam = harmonik + toplam;
        System.out.println(harmonik+1);

        System.out.print("Sonuç : " + (harmonik+1));

    }
}
