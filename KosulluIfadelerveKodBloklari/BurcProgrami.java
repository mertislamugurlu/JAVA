import java.util.Scanner;

public class BurcProgrami {
    public static void main(String[] args) {
        int month, day;
        boolean IsError = false;
        String burc = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Doğduğunuz ayı girin :");
        month = sc.nextInt();
        System.out.println("Doğduğunuz günü girin :");
        day = sc.nextInt();

        switch (month) {                  //switch ay ==
            case 1:                       // 1 olduğunda Ocak olduğunda
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oğlak";  // Oğlak Burcu : 22 Aralık - 21 Ocak
                    } else {
                        burc = "Kova";    //Kova Burcu : 22 Ocak - 19 Şubat
                    }
                } else {
                    IsError = true;
                }


                break;


            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }

                } else {
                    IsError = true;
                }
                break;


            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                } else {
                    IsError = true;
                }
                break;

            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                } else {
                    IsError = true;
                }
                break;


            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                } else {
                    IsError = true;
                }
                break;

            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                } else {
                    IsError = true;
                }
                break;

            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    IsError = true;
                }
                break;

            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak ";
                    }

                } else {
                    IsError = true;
                }
                break;

            case 9:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "Başak ";
                    } else {
                        burc = "Terazi ";
                    }
                } else {
                    IsError = true;
                }
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Terazi ";
                    }
                    else {
                        burc = "Akrep ";
                    }
                }
                else {
                    IsError = true;
                }
                break;
                case 11:
                    if (day >= 1 && day <= 30) {
                        if (day < 22) {
                            burc = "Akrep ";
                        }
                        else {
                            burc ="Yay";
                        }
                    }
                    else {
                        IsError = true;
                    }
                    break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Yay";
                    }
                    else {
                        burc ="Oğlak ";
                    }
                }
                else {
                    IsError = true;
                }
                break;

            default:

                IsError = true;
        }

        if (IsError) {
            System.out.println("Hatalı giriş yaptınız tekrar deneyin.");
        } else {
            System.out.println("Burcunuz : " + burc);
        }


    }
}
