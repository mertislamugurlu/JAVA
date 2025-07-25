import java.time.*;
import java.util.Scanner;

public class HesapMakinesiV2 {
    public static void main(String[] args) {
        long basla = System.nanoTime(); // Başlangıç zamanı (nanotime)

        int n1, n2, select, result;
        Scanner i = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz");
        n1 = i.nextInt();
        System.out.print("2.Sayıyı giriniz");
        n2 = i.nextInt();
        System.out.print("Seçim Yapınız.\n1-Toplama İşlemi\n2-Çıkarma işlemi\n3-Çarpma İşlemi\n4-Bölme İşlemi\n");
        select = i.nextInt();
        switch (select) {
            case 1:
                result = n1 + n2;
                System.out.print("Sonuç : " + n1 + "+" + n2 + "=" + result);
                break;
            case 2:
                result = n1 - n2;
                System.out.print("Sonuç : " + n1 + "-" + n2 + "=" + result);
                break;
            case 3:
                result = n1 * n2;
                System.out.print("Sonuç : " + n1 + "*" + n2 + "=" + result);
                break;
            case 4:
                result=n1/n2;
                System.out.print("Sonuç : "+n1+"/"+n2+"="+result);
        }
        //Geçen Süre
        long bitir = System.nanoTime(); // Bitiş zamanı
        double saniye = (bitir - basla) / 1_000_000_000.0;

        //saniye
        System.out.printf("\nİşlem süresi: %.7f nanosaniye\n", saniye);


    }
}
