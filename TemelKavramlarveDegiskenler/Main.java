// Benim ilk java dosyam 15.07.2025
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("mert islam");
        System.out.print("ugurlu\n");
        char c1 = 'M';
        char c2 = 'E';
        char c3 = 'R';
        char c4 = 'T';
        System.out.println(c1+c2+c3+c4);
        System.out.println(""+c1+c2+c3+c4);
        int FirstNumber = 1;
        int SecondNumber;
        SecondNumber = 2;
        int ThirdNumber , FourthNumber , FifthNumber = 5;
        float SixthNumber = 1881.1f, SeventhNumber = 1938.1f;
        System.out.print(FirstNumber+"\n"+SecondNumber+"\n"+FifthNumber+"\n"+SixthNumber+"\n"+SeventhNumber+'\n');
        boolean dogru = true;
        boolean yanlis = false;
        System.out.println(dogru+"-"+yanlis);
        String miu = "mertislamugurlu";
        System.out.println(miu);


        // Atama Operatörleri
        int x = 1;
        int y = 2;
        float z = 3f;
        int result = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 1;

        result = x+y;
        result2 += x;
        result3 -= y;
        result4 *= z;

        System.out.println(result+" "+result2+" "+result3+" "+result4);


        Scanner input = new Scanner(System.in);
        System.out.print("Ad Giriniz: ");
        String input2 = input.nextLine();
        int q,w,e;
        System.out.println("q sayısını giriniz");
        q = input.nextInt();
        System.out.println("w sayısını giriniz");
        w = input.nextInt();
        System.out.println("e sayısını giriniz");
        e = input.nextInt();
        int sonc = q+w+e;
        System.out.println("(q+w+e) Sayılarının Toplamı = "+" "+ sonc+" \nStringe girilen input ise = "+input2);


    }
}

