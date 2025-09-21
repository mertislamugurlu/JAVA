
import java.util.Scanner;

public class UsHesabi {

    static int us() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Taban değeri giriniz :");
        int a = sc.nextInt();
        System.out.print("Üs değerini giriniz :");
        int b = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        System.out.println("Sonuç :" + result);
        return result;
    }



    public static void main(String[] args) {

        us();
    }
}
