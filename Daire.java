
package Giris;
import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        float alan,tplm_alan,cevre,yaricap,merkezaci,pi=3.14f;
        Scanner sc = new Scanner(System.in);

        System.out.print("Yarıçapı Girin: ");
        yaricap = sc.nextFloat();
        System.out.print("Merkez Açıyı Girin: ");
        merkezaci = sc.nextFloat();

        alan=(pi*yaricap*yaricap*merkezaci)/360;
        tplm_alan=pi*yaricap*yaricap;
        cevre=2*pi*yaricap;
        System.out.printf("Bir Dilimin Alanı: %.2f \n", alan);
        System.out.printf("Dairenin Alanı: %.2f \n", tplm_alan);
        System.out.printf("Dairenin Çevresi: %.2f \n", cevre);


    }
}


