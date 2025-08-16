

import java.util.Scanner;
public class WeirdNumberChecker {
    public static void main(String[] args) {

        int Number;

        System.out.print("Please enter an integer between 1 and 100: ");
        Number = new Scanner(System.in).nextInt();

        if (Number >= 1 && Number<=100) {
            if(Number % 2 == 1) {
                System.out.print("Weird");
            }
            else if(Number % 2 == 0 && Number >= 2 && Number <=5 ) {
                System.out.print("Not Weird");
            }
            else if(Number % 2 == 0 && Number >= 6 && Number <=20 ) {
                System.out.print("Weird");
            }
            else if(Number % 2 == 0 && Number > 20 ) {
                System.out.print("Not Weird");
            }

        }

        else {
            System.out.print("Error");
        }
    }
}
