package coronavirus;

import coronavirus.display.Display;
import coronavirus.display.WriteDisplay;

import java.util.Scanner;

public class Covid19 extends Display {
    private static final Scanner input = new Scanner(System.in);
    private static final WriteDisplay covid19 = new WriteDisplay();
    private static final Covid19 display = new Covid19();


    public static void main(String[] args) throws Exception {

        display.clearConsole();

        boolean Continue = true;
        while (Continue) {
            display.MainPage();
            display.Menu();

            char pick = input.next().charAt(0);

            try {
                switch (pick){
                    case '1' :
                        display.Loading();
                        covid19.IndonesiaTable();
                        System.out.print("\n");
                        break;

                    case '2' :
                        display.Loading();
                        covid19.WorldTable();
                        System.out.print("\n");
                        break;

                    case '3' :
                        input.nextLine();
                        System.out.println("\nGunakan nama negara dalam bahasa inggris, apabila nama negara terdapat" +
                                "\ndua kalimat , gunakan tanda [ - ] untuk memisahkan misal, south-africa\n");
                        System.out.print("Masukan nama negara : ");
                        String country = input.nextLine().toLowerCase();
                        display.Loading();
                        covid19.WorldTable(country);
                        System.out.print("\n");
                        break;

                    case '4' :
                        display.Loading();
                        covid19.ProvinsiTable();
                        System.out.print("\n");
                        break;

                    case '5' :
                        display.Loading();
                        covid19.WorldLiveBox();
                        System.out.print("\n");
                        break;

                    case '6' :
                        display.Goodbye();
                        System.exit(0);
                        break;

                    default :
                        display.Warning();
                        System.out.println("Maaf pilihan anda salah !");
                }

            } catch (Exception MasalahInternet){
                display.Warning();
                System.out.println("Internet anda mati atau server sedang sibuk !");
            }

            boolean yay = true;
            while (yay){

                System.out.print("\nKembali memilih di menu utama ? [Y/N] : ");
                char YES = input.next().toLowerCase().charAt(0);
                if (YES=='y'){
                    display.clearConsole();
                    Continue = true;
                    yay = false;
                }else if (YES=='n'){
                    display.Goodbye();
                    Continue = false;
                    yay = false;
                } else {
                    display.Warning();
                    System.out.println("Masukan Y atau N");
                    yay = true;
                }

            }

        }

    }

}
