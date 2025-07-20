/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp
ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;

********
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

*/


package Giris;
import java.util.Scanner;
public class kdvtutari {
    public static void main(String[] args) {
        double gtutar,ktutari18=0.18,ktutari8=0.08,kdvsizfiyat,kdvlifiyat;
        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen Tutar Giriniz.");
        gtutar=sc.nextDouble();
        System.out.println("KDV'siz Fiyatı " + gtutar);
        System.out.print    ((gtutar>1000 ?
                "KDV'Li Fiyatı " + (gtutar+gtutar*ktutari8) + "\n" +
                "KDV Oranı " + ktutari8 + "\n" +
                "KDV Tutarı " + gtutar*ktutari8
                :
                "KDV'Li Fiyatı " + (gtutar+gtutar*ktutari18) + "\n" +
                "KDV Oranı " + ktutari18 + "\n" +
                "KDV Tutarı " + gtutar*ktutari18   ));
    }
}
