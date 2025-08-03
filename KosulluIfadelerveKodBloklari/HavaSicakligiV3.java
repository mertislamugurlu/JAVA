
import java.util.Scanner;

public class HavaSicakligiV3 {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz : ");
        sicaklik = input.nextInt();

        System.out.println
                (//<--
        sicaklik < 5 ? "Kayak yap" :
                sicaklik < 10 ? "Sinema yap" :
                        sicaklik < 15 ? "Sinema ve piknik yap" :
                                sicaklik < 25 ? "Piknik yap" : "Yüzme yap"
        );//<--

    }
}
