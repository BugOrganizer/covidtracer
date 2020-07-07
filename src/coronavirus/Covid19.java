package coronavirus;

import coronavirus.display.Display;
import coronavirus.display.WriteDisplay;

import java.util.Scanner;

public class Covid19 extends Display {
    private static final Scanner input = new Scanner(System.in);
    private static final Covid19 display = new Covid19();


    public static void main(String[] args) throws Exception {
        display.fetchData();
        final Coronavirus corona = new Coronavirus();
        final WriteDisplay covid19 = new WriteDisplay(corona.countryAll, corona.indonesiaLatest, corona.globalLatest, corona.provinsi,
                                    corona.maxDeath, corona.minDeath, corona.maxRecovered, corona.minRecovered);

        display.clearConsole();

        boolean continueRunning = true;
        while (continueRunning) {
            display.mainPage();
            display.menu();

            char pick = input.next().charAt(0);

            try {
                switch (pick){
                    case '1' :
                        display.loading();
                        covid19.indonesiaTable();
                        System.out.print("\n");
                        break;

                    case '2' :
                        display.loading();
                        covid19.worldTable();
                        System.out.print("\n");
                        break;

                    case '3' :
                        display.loading();
                        covid19.provinsiTable();
                        System.out.print("\n");
                        break;

                    case '4' :
                        display.loading();
                        covid19.worldLiveBox();
                        System.out.print("\n");
                        break;

                    case '5' :
                        display.loading();
                        covid19.kasusSembuh();
                        covid19.kasusMeninggal();
                        System.out.print("\n");
                        break;

                    case '6' :
                        display.goodbye();
                        System.exit(0);
                        break;

                    default :
                        display.warning();
                        System.out.println("Maaf pilihan anda salah !");
                }

            } catch (Exception MasalahInternet){
                display.warning();
                System.out.println("Internet anda mati atau server sedang sibuk !");
            }

            boolean yay = true;
            while (yay){

                System.out.print("\nKembali memilih di menu utama ? [Y/N] : ");
                char YES = input.next().toLowerCase().charAt(0);
                if (YES=='y'){
                    display.clearConsole();
                    continueRunning = true;
                    yay = false;
                }else if (YES=='n'){
                    display.goodbye();
                    continueRunning = false;
                    yay = false;
                } else {
                    display.warning();
                    System.out.println("Masukan Y atau N");
                    yay = true;
                }

            }

        }

    }

}
