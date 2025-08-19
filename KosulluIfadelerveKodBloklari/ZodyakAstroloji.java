
import java.util.Scanner;

public class ZodyakAstroloji {
    public static void main(String[] args) {

        int dogum_tarihi;
        String burc = "Çin Zodyağı Burcunuz :";
        Scanner input = new Scanner(System.in);

        System.out.print("Dogum Tarihi :");
        dogum_tarihi = input.nextInt();
        if (dogum_tarihi > 0) {
            System.out.print(burc);
        if (dogum_tarihi % 12 == 0) {System.out.print("Maymun");}
        else if (dogum_tarihi %12 == 1)  {System.out.print("Horoz");}
        else if (dogum_tarihi %12 == 2) {System.out.print("Köpek");}
        else if (dogum_tarihi %12 == 3) {System.out.print("Domuz");}
        else if (dogum_tarihi %12 == 4) {System.out.print("Fare");}
        else if (dogum_tarihi %12 == 5) {System.out.print("Öküz");}
        else if (dogum_tarihi %12 == 6) {System.out.print("Kaplan");}
        else if (dogum_tarihi %12 == 7) {System.out.print("Tavşan");}
        else if (dogum_tarihi %12 == 8) {System.out.print("Ejderha");}
        else if (dogum_tarihi %12 == 9) {System.out.print("Yılan");}
        else if (dogum_tarihi %12 == 10) {System.out.print("At");}
        else if (dogum_tarihi %12 == 11) {System.out.print("Koyun");}

        }
        else {System.out.print("Hatalı yıl girdiniz.");}


    }
}
