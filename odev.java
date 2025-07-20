/*Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan
alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak,
eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
Not: Ternary Operator kullanarak yapılacak.*/
//Ternary Operator
import java.util.Scanner;
public class odev {
    public static void main(String[] args) {
        //Değişkenkerim
        double math1,math2,phy1,phy2,che1,che2,tur1,tur2,mus1,mus2;
        double mathavg,phyavg,cheavg,turavg,musavg,resultavg;


        //Kullanıcıdan giriş
        Scanner sc=new Scanner(System.in);
        System.out.print("1.Matematik Notunuzu Girin:");
        math1=sc.nextDouble();
        System.out.print("2.Matematik Notunuzu Girin:");
        math2=sc.nextDouble();
        System.out.print("1.Fizik Notunuzu Girin:");
        phy1=sc.nextDouble();
        System.out.print("2.Fizik Notunuzu Girin:");
        phy2=sc.nextDouble();
        System.out.print("1.Kimya Notunuzu Girin:");
        che1=sc.nextDouble();
        System.out.print("2.Kimya Notunuzu Girin:");
        che2=sc.nextDouble();
        System.out.print("1.Türkçe Notunuzu Girin:");
        tur1=sc.nextDouble();
        System.out.print("2.Türkçe Notunuzu Girin");
        tur2=sc.nextDouble();
        System.out.print("1.Müzik Notunuzu Girin:");
        mus1=sc.nextDouble();
        System.out.print("2.Müzik Notunuzu Girin");
        mus2=sc.nextDouble();

        //Ortalamaların hesaplanması
        mathavg=(math1+math2)/2f;
        phyavg=(phy1+phy2)/2f;
        cheavg=(che1+che2)/2f;
        turavg=(tur1+tur2)/2f;
        musavg=(mus1+mus2)/2f;


        //İkili karşılaştırma yapılması --Ternary Operator
        System.out.println("Matematik Not Ortalamanız " + mathavg + (mathavg>=60 ? " Dersi geçtiniz" : " Dersten geçemediniz"));
        System.out.println("Fizik Not Ortalamanız " + phyavg + (phyavg>=60 ? " Dersten geçtiniz" : " Dersten geçemediniz"));
        System.out.println("Kimya Not Ortalamanız " + cheavg + (cheavg>=60 ? " Dersten geçtiniz" : " Dersten geçemediniz"));
        System.out.println("Türkçe Not Ortalamanız " + turavg + (turavg>=60 ? " Dersten geçtiniz" : " Dersten geçemediniz"));
        System.out.println("Müzik Not Ortalamanız " + musavg + (musavg>=60 ? " Dersten geçtiniz" : " Dersten geçemediniz"));

        //Genel ortalamanın bulunması
        resultavg = (mathavg+phyavg+cheavg+turavg+musavg)/5f;
        System.out.println("Genel Ortalamanız :" + resultavg + (resultavg>=60 ? " Sınıfı Geçtiniz" : " Sınıf Geçemediniz"));
    }
}
