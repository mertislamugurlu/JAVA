/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/

import java.util.Scanner;
public class SinifGecmeDurumu  {
    public static void main(String[] args) {

        int mat, fiz, tur, kim, muzik;

        Scanner input = new Scanner(System.in);


        System.out.print("Matematik notunu girin :");
        mat = input.nextInt();


        System.out.print("Fizik notunu girin :");
        fiz = input.nextInt();

        System.out.print("Türkçe notunu girin :");
        tur = input.nextInt();

        System.out.print("Kimya notunu girin :");
        kim = input.nextInt();

        System.out.print("Müzik notunu girin :");
        muzik = input.nextInt();

        double average = (mat + fiz + tur + kim + muzik) / 5D;

        if (mat < 0 || mat > 100 || fiz < 0 || fiz > 100 || tur < 0 || tur > 100 || kim < 0 || kim > 100 || muzik < 0 || muzik > 100) {
            System.out.println("Ortalamaya katılamadınız lütfen geçerli not girin : :D ");
        }
        else { //<< -- *** bu else içerisinde System.out.println(average >= 55 ? "Sınıfı geçtiniz." : "Sınıfta kaldınız."); VEYA else içerisinde if //<< -- ***

            if (average >= 55) { //--< else içerisinde if
                System.out.println("Sınıfı geçtiniz.");
            }
            else {//<<
                System.out.println("Sınıfta kaldınız.");
            }//<<
        } //<< -- ***

        System.out.println("Ortalamanız : " + average);
    }
}

