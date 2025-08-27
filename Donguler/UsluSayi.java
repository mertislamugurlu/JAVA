
import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int sayi, sayinin_ussu, us_t = 1, atama = 1, sonuc = 1 ,toplam=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı :");
        sayi = sc.nextInt();
        System.out.print("Sayının üssü :");
        sayinin_ussu = sc.nextInt();


            for (int j=1;j<=sayinin_ussu;j++){
                sonuc = sonuc * sayi ;

            }

System.out.print(sonuc);

    }
}
