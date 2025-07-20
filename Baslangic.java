/*Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan
alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak,
eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
Not: Ternary Operator kullanarak yapılacak.*/

package Giris;
import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {

        System.out.println("Merhaba");
        int mat,mat2,fiz,fiz2,kim2,kim,tur,tur2,muz,muz2;
        float mats,fizs,kims,turs,muzs;

        Scanner sc=new Scanner(System.in);
        System.out.println("1.Matematik Notunuzu giriniz.");
        mat=sc.nextInt();
        System.out.println("2.Matematik Notunuzu giriniz.");
        mat2=sc.nextInt();
        System.out.println("1.Fizik Notunuzu giriniz.");
        fiz=sc.nextInt();
        System.out.println("2.Fizik Notunuzu giriniz.");
        fiz2=sc.nextInt();
        System.out.println("1.Kimya Notunuzu giriniz.");
        kim=sc.nextInt();
        System.out.println("2.Kimya Notunuzu giriniz.");
        kim2=sc.nextInt();
        System.out.println("1.Türkçe Notunuzu giriniz.");
        tur=sc.nextInt();
        System.out.println("2.Türkçe Notunuzu giriniz.");
        tur2=sc.nextInt();
        mats=(mat+mat2)/2f;
        fizs=(fiz+fiz2)/2f;
        kims=(kim+kim2)/2f;
        turs=(tur+tur2)/2f;

        if (mats>=60) { System.out.println("Matematik Not Ortalamanız"  +mats+ " Geçtiniz...");

        }
        else {System.out.println("Matematik Not Ortalamanız " +mats+ " Kaldınız...");}

        if (fizs>=60) { System.out.println("Fizik Not Ortalamanız " +fizs+ " Geçtiniz...");

        }
        else {System.out.println("Fizik Not Ortalamanız " +fizs+ " Kaldınız...");}

        if (kims>=60) { System.out.println("Kimya Not Ortalamanız " +kims+ " Geçtiniz...");

        }
        else {System.out.println("Kimya Not Ortalamanız " +kims+ " Kaldınız...");}

        if (turs>=60) { System.out.println("Türkçe Not Ortalamanız " +turs+ " Geçtiniz...");

        }
        else {System.out.println("Kimya Not Ortalamanız " +turs+ " Kaldınız...");}


    }

    }


