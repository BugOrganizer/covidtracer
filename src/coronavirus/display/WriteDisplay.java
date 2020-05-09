package coronavirus.display;

import coronavirus.Coronavirus;
import coronavirus.internationaldata.Countries;
import coronavirus.internationaldata.Country;
import coronavirus.internationaldata.Global;

public class WriteDisplay extends Display {
    private static final WriteDisplay display = new WriteDisplay();
    private static final Coronavirus coronavirus = new Coronavirus();

    public void getWorldTable() throws Exception {
        Countries[] countries = coronavirus.getCountryAll();
        display.getTitleBar("DATA SELURUH DUNIA","-",90);
        display.getList("NEGARA","POSITIF","DEATH","SEMBUH","UPDATE",120);
        System.out.print("\n");
        for (Countries x : countries) {
            if (x.getTotalConfirmed().equals("0")){
                System.out.print("");
            }else {
                display.getList(x.getCountry(),x.getTotalConfirmed(),
                        x.getTotalDeaths(),x.getTotalRecovered(),x.getUpdateDate(),120);
            }
        }
    }

    public void getWorldTable(String flag) throws Exception {
        Country c = coronavirus.getByCountry(flag);
        display.getTitleBar("DATA NEGARA "+flag.toUpperCase(),"-",90);
        display.getList("NEGARA","POSITIF","DEATH","SEMBUH","UPDATE",120);
        display.getList(c.getCountry(),c.getConfirmed(),c.getDeaths(),c.getRecovered(),c.getDate(),120);
    }

    public void getWorldLiveBox() throws Exception {
        Global global = coronavirus.getGlobalLatest();
        display.getDisplayBox("POSITIVE","MENINGGAL",global.getTotalConfirmed(),global.getTotalDeaths(),100);
    }


}
