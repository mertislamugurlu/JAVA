import java.util.Scanner;
public class ucgenalan {
    public static void main(String[] args) {
        double alan,kenar1,kenar2,kenar3,yaricevre,alaninkaresi;

        Scanner input = new Scanner(System.in);
        System.out.print("1.Kenarı Girin");
        kenar1=input.nextDouble();
        System.out.print("2.Kenarı Girin");
        kenar2=input.nextDouble();
        System.out.print("3.Kenarı Girin");
        kenar3=input.nextDouble();

        yaricevre=(kenar1+kenar2+kenar3)/2;

        alaninkaresi=yaricevre*(yaricevre-kenar1)*(yaricevre-kenar2)*(yaricevre-kenar3);
        alan=Math.sqrt(alaninkaresi);
        System.out.println("Alan: "+alan);






    }
}
