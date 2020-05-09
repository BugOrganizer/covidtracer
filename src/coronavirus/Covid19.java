package coronavirus;

import coronavirus.display.Display;
import coronavirus.internationaldata.Countries;
import coronavirus.internationaldata.Global;

public class Covid19 extends Display {

    private static Covid19 display = new Covid19();

    public static void main(String[] args) throws Exception {

        Display display = new Display();
        Crazypandemic coronavirus = new Crazypandemic();
        Countries[] countries = coronavirus.getCountryAll();
        display.getMainPage();
        System.out.print("\n");

        display.getTitleBar("DATA SELURUH DUNIA","-",90);

        display.getTable("NEGARA","POSITIF","DEATH","SEMBUH","UPDATE",120);
        System.out.print("\n");
        for (Countries x : countries) {
            if (x.getTotalConfirmed().equals("0")){
                //do nothing
            }else {
                display.getTable(x.getCountry(),x.getTotalConfirmed(),
                        x.getTotalDeaths(),x.getTotalRecovered(),x.getUpdateDate(),120);
            }

        }

    }
}