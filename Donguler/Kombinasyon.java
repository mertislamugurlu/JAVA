
import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        int n,r,nf=1,rf=1,n_rf=1,n_r,kombinasyon;
        Scanner sc=new Scanner(System.in);
        System.out.println("C(n,r): ");
        System.out.print("(n): ");
        n=sc.nextInt();
        System.out.print("(r): ");
        r=sc.nextInt();
        n_r = n-r;
        for (int i=1;i<=n;i++){
            nf=nf*i;
        }
        for (int j=1;j<=r;j++){
            rf=rf*j;
        }
        for (int k=1;k<=n_r;k++){
            n_rf=n_rf*k;
        }
        kombinasyon = nf/(rf*n_rf);
        System.out.println("Kombinasyon = : "+kombinasyon);
    }
}
