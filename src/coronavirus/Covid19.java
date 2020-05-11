package coronavirus;

import coronavirus.display.WriteDisplay;
import java.util.Scanner;

public class Covid19 extends WriteDisplay {
    private static final Scanner input = new Scanner(System.in);
    private static final Covid19 display = new Covid19();

    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        boolean gass = true;
        while (gass) {
        display.getMainPage();
        display.getMenu();

            char pick = input.next().charAt(0);
            switch (pick){
                case '1' :
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    display.getLoading();
                    display.getIndonesiaTable();
                    break;

                case '2' :
                    display.getLoading();
                    display.getWorldTable();
                    break;

                case '3' :
                    input.nextLine();
                    System.out.print("Masukan nama negara : ");
                    String country = input.nextLine();
                    display.getLoading();
                    display.getWorldTable(country);
            }

            System.out.print("\nMau kembali ke menu utama ? ");
            char yt = input.next().charAt(0);
            if (yt=='y'){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                gass = true;
            }else {
                gass = false;
            }
        }

    }
}