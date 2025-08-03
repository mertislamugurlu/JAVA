/* Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.

 */

import java.util.Scanner;
public class HavaSicakligiV2 {
    public static void main(String[] args) {
        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz : ");
        sicaklik = input.nextInt();

        boolean kayak = sicaklik < 5;
        boolean sinema = 5 <= sicaklik && sicaklik <15;
        boolean piknik = 10 <= sicaklik && sicaklik <25;
        boolean yuzme = sicaklik>25;

        if (kayak){
            System.out.println("Kayak yap");
        }
        if (sinema){
            System.out.println("sinema yap");
        }
        if (piknik){
            System.out.println("piknik yap");
        }
        if (yuzme){
            System.out.println("yuzme yap");
        }






    }
}
