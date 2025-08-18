
import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        int km, yas, yolculuk_tipi;
        float normaltutar, indirimlitutar = 0f, mesafebasi = 0.10f, yaskucukse12 = 0.5f, yas1224arasi = 0.10f, yas65buyukse = 0.3f, gidisdonus = 0.2f;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz :");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz :");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculuk_tipi = input.nextInt();

        normaltutar = km * mesafebasi;
        if (yolculuk_tipi == 1 || yolculuk_tipi == 2) {                                        //1.if
            if (km > 0) {                                                                      //2.if
                if (yas > 0) {                                                                 //3.if
                    if (yas < 12) {                                                            //4.if
                        indirimlitutar = normaltutar - (normaltutar * yaskucukse12);
                    } else if (yas >= 12 && yas <= 24) {                                       //5. else if
                        indirimlitutar = normaltutar - (normaltutar * yas1224arasi);
                    } else if (yas > 65) {                                                     //6.else if
                        indirimlitutar = normaltutar - (normaltutar * yas65buyukse);
                    } else {                                                                   // 4.5.6. Kapanış else ' i
                        indirimlitutar = normaltutar; // Yaş 25 65 arası indirimden yararlanmıyor
                    }                                                                          // 4.5.6. Kapanış else ' i {}
                    if (yolculuk_tipi == 2) {                                                  //7.if
                        indirimlitutar = (indirimlitutar - (indirimlitutar * gidisdonus)) * 2;
                    }                                                                          //7.if Kapanış
                    System.out.println("Toplam Bilet Fiyatı : " + indirimlitutar + " TL");
                }                                                                              //3.if {}
                else                                                                           // 3.if Kapanış else ' i
                {
                    System.out.println("Hatalı yaş girdiniz!");
                }                                                                              // 3.if Kapanışı
            }                                                                                  //2.if{}
            else { //2.if elsei
                System.out.println("Hatalı mesafe girdiniz");
            }
        }                                                                                      //1.if{}
        else {                                                                                 //1.if Kapanış else ' i
            System.out.println("Hatalı yolculuk tipi girdiniz");
        }
    }
}





