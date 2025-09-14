import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int seri, seriilk = 0, tmp = 1, result = 0, result2 = 0, result3 =0;
        System.out.print("Fibonacci Serisi Kaç Elemanlı ?");
        Scanner sc = new Scanner(System.in);
        seri = sc.nextInt();

        if (seri > 2) {
            System.out.print("0 , 1  ,");
            for (int i = 2; i <= seri; i++) {
                result = seriilk + tmp;
                System.out.print(result + " , ");
                seriilk = tmp;
                tmp=result;
            }
        }

        else if (seri == 2)
            System.out.print("0 , 1 , 1");
        else if (seri == 1)
            System.out.print("0 , 1");
        else if (seri == 0)
            System.out.print("Error");
        else {
            System.out.println("Negatif x");
        }

    }

}




