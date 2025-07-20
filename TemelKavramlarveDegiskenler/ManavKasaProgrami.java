/*Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;
Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL */

import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        float toplamtutar, armut = 2.14f, elma = 3.67f, domates = 1.11f, muz = 0.95f, patlican = 5f;
        float karmut, kelma, kdomates, kmuz, kpatlican;
        Scanner sc = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        karmut = sc.nextFloat();
        System.out.print("Elma Kaç Kilo ? :");
        kelma = sc.nextFloat();
        System.out.print("Domates Kaç Kilo ? :");
        kdomates = sc.nextFloat();
        System.out.print("Muz Kaç Kilo ? :");
        kmuz = sc.nextFloat();
        System.out.print("Patlican Kaç Kilo ? :");
        kpatlican = sc.nextFloat();
        toplamtutar = (karmut * armut) + (kelma * elma) + (kdomates * domates) + (kmuz * muz) + (kpatlican * patlican);
        if (karmut < 0 || kelma < 0 || kdomates < 0 || kmuz < 0 || kpatlican < 0) {
            System.out.println("Negatif bir kilo girdiniz. Tekrar deneyin.");
        }
        else{
            System.out.println("Toplam Tutar : " + toplamtutar);
        }
    }
}
