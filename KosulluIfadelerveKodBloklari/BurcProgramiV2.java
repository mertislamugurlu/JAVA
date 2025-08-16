

import java.util.Scanner;

public class BurcProgramiV2 {
    public static void main(String[] args) {
        int ay, gun;
        boolean isError = false;
        String burc = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Doğduğunuz ayı girin :");
        ay = sc.nextInt();
        System.out.println("Doğduğunuz günü girin :");
        gun = sc.nextInt();

        if (ay == 1) {
            if (gun >= 1 && gun <= 31) {
                System.out.println(gun < 22 ? "Oğlak" : "Kova");
            }
        } else if (ay == 2) {
            if (gun >= 1 && gun <= 28) {
                System.out.println(gun < 20 ? "Kova" : "Balık");
            }
        } else if (ay == 3) {
            if (gun >= 1 && gun <= 31) {
                System.out.println(gun < 21 ? "Balık" : "Koç");
            }
        } else if (ay == 4) {
            if (gun >= 1 && gun <= 30) {
                System.out.println(gun < 21 ? "Koç" : "Boğa");
            }
        } else if (ay == 5) {
            if (gun >= 1 && gun <= 31) {
                System.out.println(gun < 22 ? "Boğa" : "İkizler");
            }
        } else if (ay == 6) {
            if (gun >= 1 && gun <= 30) {
                System.out.println(gun < 23 ? "İkizler" : "Yengeç");
            }
        } else if (ay == 7) {
            if (gun >= 1 && gun <= 31) {
                System.out.println(gun < 23 ? "Yengeç" : "Aslan");
            }
        } else if (ay == 8) {
            if (gun >= 1 && gun <= 31) {
                System.out.println(gun < 23 ? "Aslan" : "Başak");
            }
        } else if (ay == 9) {
            if (gun >= 1 && gun <= 30) {
                System.out.println(gun < 23 ? "Başak" : "Terazi");
            }
        } else if (ay == 10) {
            if (gun >= 1 && gun <= 31) {
            System.out.println(gun < 23 ? "Terazi" : "Akrep");
        }
    }

    else if (ay == 11) {
            if (gun >= 1 && gun <= 30) {
                System.out.println(gun < 22 ? "Akrep" : "Yay");
            }
        }
    else if (ay == 12) {
            if (gun >= 1 && gun <= 31) {
                System.out.println(gun < 22 ? "Yay" : "Oğlak");
            }
        }

    else {
            System.out.println("Hatalı giriş yaptınız tekrar deneyin.");
        }


    }
}
