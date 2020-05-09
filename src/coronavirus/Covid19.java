package coronavirus;

import coronavirus.display.WriteDisplay;
import java.util.Scanner;

public class Covid19 extends WriteDisplay {
    private static final Scanner scan = new Scanner(System.in);
    private static final Covid19 display = new Covid19();

    public static void main(String[] args) throws Exception {

        System.out.print("Masukan negara : ");
        String input = scan.next().toLowerCase();
        display.getWorldTable(input);

    }
}