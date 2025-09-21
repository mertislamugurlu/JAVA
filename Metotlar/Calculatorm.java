


import java.util.Scanner;

public class Calculatorm {
    static int sum(int a, int b) {

        int result = a + b;
        System.out.println("Toplam :" + result);
        return result;
    }

    static int subtract(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma :" + result);
        return result;

    }

    static int multiply(int a, int b) {
        int result = a * b;
        System.out.println("Çarpım :" + result);
        return result;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Hata: Sıfıra bölme yapılamaz");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme :" + result);
        return result;
    }

    static int power(int a, int b) {
        if (b == 0) {
            System.out.println("Sonuç: 1");
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;

        }
        System.out.println("Sonuç: " + result);
        return result;
    }

    static int factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Factorial ?");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("Factorial : " + result);
        return result;
    }

    static int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Hata: Sıfıra bölme yapılamaz");
            return 0;
        }
        int result = a % b;
        System.out.println("Mod : " + result);
        return result;

    }
    static void rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Uzun kenar: ");
        int uzun = sc.nextInt();
        System.out.print("Kısa kenar: ");
        int kisa = sc.nextInt();

        int alan = uzun * kisa;
        int cevre = 2 * (uzun + kisa);

        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış yap";

        while (true) {
            System.out.println("Bir işlem seçiniz");
            System.out.println(menu);
            select = sc.nextInt();
            if (select == 0) {
                System.out.println("Çıkış yapıldı.");
                break;
            }
            if (select == 6) {
                factorial();
            }
            else if (select == 8) {
                rectangle();
            }

            else {

                System.out.print("İlk Sayı :");
                int a = sc.nextInt();
                System.out.print("İkinci Sayı :");
                int b = sc.nextInt();

                switch (select) {
                    case 1:
                        sum(a, b);
                        break;
                    case 2:
                        subtract(a, b);
                        break;
                    case 3:
                        multiply(a, b);
                        break;
                    case 4:
                        divide(a, b);
                        break;
                    case 5:
                        power(a, b);
                        break;
                    case 7:
                        mod(a, b);
                        break;


                    default:
                        System.out.println("Geçersiz seçim!");
                        break;

                }
            }
        }


    }
}
