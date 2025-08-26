
import java.util.Scanner;
public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
        int n,sayi,sabit=4,sabits=5,sonuc=1,sonuc2=1;

        Scanner tara = new Scanner(System.in);
        System.out.println("4 ve 5 ' in Kuvvetleri : ");
        n=tara.nextInt();

        for (sayi=1;sayi<=n;sayi++){
            sonuc=sabit*sonuc;
            sonuc2=sabits*sonuc2;

            System.out.println(sabit + "'Ün'"+sayi+".Kuvveti "+sonuc);

            System.out.println(sabits + "'İn'"+sayi+".Kuvveti "+sonuc2);
        }
    }
}
