import java.util.Scanner;
public class Vucutindeksi {
    public static void main(String[] args) {
        float boy, kilo, indeks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = sc.nextFloat();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = sc.nextFloat();
        indeks = (kilo / (boy * boy));
        System.out.printf("Vücut Kitle Endeksi: %.2f\n", indeks);

        if (indeks < 18.5)
            System.out.printf("Zayıf");
        else if (indeks < 25)
                System.out.println("Normal");
            else if (indeks < 30)
                System.out.println("Fazla kilolu");
            else
                System.out.println("Çok fazla kilolu");
        }
    }
