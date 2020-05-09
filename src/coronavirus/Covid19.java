package coronavirus;

import coronavirus.internationaldata.Countries;
import coronavirus.internationaldata.Country;
import coronavirus.internationaldata.Display;
import coronavirus.internationaldata.Global;

public class Covid19 extends Display {

    private static Covid19 display = new Covid19();

    public static void main(String[] args) throws Exception {

        display.getMainPage();
        //display.getTitleBar("World Cases",70);
        display.getDisplayBox("text1","text2","text3","text4",60);

    }
}