/* Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.*/

import java.util.Scanner;
public class GirilenUcSayi {
    public static void main(String[] args) {
        int s1,s2,s3;

        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayiyi gir : ");
        s1 = input.nextInt();

        System.out.print("2.Sayiyi gir : ");
        s2 = input.nextInt();

        System.out.print("3.Sayiyi gir : ");
        s3 = input.nextInt();

    if (s1<s2 && s1<s3) {
        if (s2<s3) {
            System.out.println("küçükten büyüğe : " + s1 + " " + s2 + " " + s3);
            }
        else {
            System.out.println("küçükten büyüğe : " + s1 + " " + s3 + " " + s2);
        }
        }


    if (s2<= s1 && s2<=s3) {
        if (s3 <= s1) {
            System.out.println("küçükten büyüğe : " + s2 + " " + s3 + " " + s1);
        }
        else {
            System.out.println("küçükten büyüğe : " + s2 + " " + s1 + " " + s3);
        }
    }



    if (s3<=s1 && s3<=s2) {
        if (s1<=s2) {
            System.out.println("küçükten büyüğe : " + s3 + " " + s1 + " " + s2);
        }
        else {
            System.out.println("küçükten büyüğe : " + s3 + " " + s2 + " " + s1);
        }
    }

    }

    }



    


