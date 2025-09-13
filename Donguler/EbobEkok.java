import java.util.Scanner;

//for ile ebob ekok
public class EbobEkok {
    public static void main(String[] args) {
        int n1, n2, ebob = 1, ekok = 0, k=1;
        Scanner input = new Scanner(System.in);
        System.out.println("N1'i giriniz :");
        n1 = input.nextInt();
        System.out.println("N2'i giriniz :");
        n2 = input.nextInt();

        for (int y = 1; y <= (n1*n2); y++) {
            if (y % n1 == 0 && y % n2 == 0) {
                ekok = y;
                break;
            }
        }
        System.out.println("ekok :"+ekok);

        if (n1 > n2) {
            for (int i = 1; i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;

                }
            }
            System.out.println("Ebob :"+ebob);
        }
        else {
            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("Ebob :" + ebob);
        }
    }
}