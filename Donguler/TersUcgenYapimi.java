/* Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

Örnek
Basamak Sayısı : 10
*******************
*****************
***************
*************
***********
*********
*******
*****
***
*
*/
import java.util.Scanner;
public class TersUcgenYapimi {
    public static void main(String[] args) {
        int BasamakSayisi;
        Scanner sc = new Scanner(System.in);
        BasamakSayisi = sc.nextInt();

        for (int i = 1; i <= BasamakSayisi; i++) {

            int yildizSayisi = 2 * (BasamakSayisi - i) - 1;

            for  (int j = 0; j <= yildizSayisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
