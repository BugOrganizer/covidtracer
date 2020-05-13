package coronavirus;

import coronavirus.display.WriteDisplay;

import java.util.Scanner;

public class Covid19 extends WriteDisplay {
    private static final Scanner input = new Scanner(System.in);
    private static final Covid19 display = new Covid19();

    public static void main(String[] args) throws Exception {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        boolean Continue = true;
        while (Continue) {
            display.getMainPage();
            display.getMenu();

            char pick = input.next().charAt(0);

            try {
                switch (pick){
                    case '1' :
                        display.getLoading();
                        display.getIndonesiaTable();
                        System.out.print("\n");
                        break;

                    case '2' :
                        display.getLoading();
                        display.getWorldTable();
                        System.out.print("\n");
                        break;

                    case '3' :
                        input.nextLine();
                        System.out.print("Masukan nama negara : ");
                        String country = input.nextLine().toLowerCase();
                        display.getLoading();
                        display.getWorldTable(country);
                        System.out.print("\n");
                        break;

                    case '4' :
                        display.getLoading();
                        display.getProvinsiTable();
                        System.out.print("\n");
                        break;

                    case '5' :
                        display.getGoodby();
                        System.exit(0);
                        break;

                    default :
                        display.getWarning();
                        System.out.println("Maaf pilihan anda ngawur !");
                }
            } catch (Exception MasalahInternet){
                display.getWarning();
                System.out.println("Internet anda mati atau server sedang sibuk !");
            }

            boolean yay = true;
            while (yay){

                System.out.print("\nKembali memilih di menu utama ? [Y/N] ");
                char YES = input.next().toLowerCase().charAt(0);
                if (YES=='y'){
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    Continue = true;
                    yay = false;
                }else if (YES=='n'){
                    display.getGoodby();
                    Continue = false;
                    yay = false;
                } else {
                    display.getWarning();
                    System.out.println("Masukan Y atau T");
                    yay = true;
                }
            }

        }
    }
}
