
import java.util.Scanner;
public class DeseneGoreMetot {

    static int eksiltenMetot(int n , int baslangicDegeri ) {

        System.out.print( "  " + n);  // System.out.print( " , " + n);
        if (n <= 0) {
            return artiranMetot(n+5 , baslangicDegeri);
        }
        return eksiltenMetot(n-5, baslangicDegeri);

    }

    static int artiranMetot(int n, int baslangic) {
         System.out.print( "  " + n); // System.out.print( " , " + n);
        if (n == baslangic)
            return n;
        return artiranMetot(n + 5, baslangic);
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int n = sc.nextInt();
        int baslangicDegeri = n;

        eksiltenMetot(n, baslangicDegeri);


    }
}
