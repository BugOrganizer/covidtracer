package coronavirus.display;

import coronavirus.Coronavirus;
import coronavirus.internationaldata.*;

import java.util.ArrayList;

public class WriteDisplay extends Display {
    private static final WriteDisplay display = new WriteDisplay();
    private static final Coronavirus coronavirus = new Coronavirus();

    public void getWorldTable() throws Exception {
        Countries[] countries = coronavirus.getCountryAll();
        clearConsole();
        display.getTitleBar("DATA SELURUH DUNIA","-",90);
        display.getList("NEGARA","POSITIF","DEATH","SEMBUH","UPDATE",120);
        System.out.print("\n");
        for (Countries x : countries) {
            if (x.getTotalConfirmed().equals("0")){
                System.out.print("");
            }else {
                display.getList(x.getCountry(),x.getTotalConfirmed(),
                        x.getTotalDeaths(),x.getTotalRecovered(),x.getUpdateDate(),120);
                System.out.print("\n");
            }
        }
    }

    public void getWorldTable(String flag) throws Exception {
        Country c = coronavirus.getByCountry(flag);
        clearConsole();
        display.getTitleBar("DATA NEGARA "+flag.toUpperCase(),"-",90);
        display.getList("NEGARA","POSITIF","DEATH","SEMBUH","UPDATE",120);
        System.out.print("\n");
        display.getList(c.getCountry(),c.getConfirmed(),c.getDeaths(),c.getRecovered(),c.getDate(),120);
    }

    public void getIndonesiaTable() throws Exception {
        Country c = coronavirus.getIndonesiaLatest();
        clearConsole();
        display.getTitleBar("DATA NEGARA INDONESIA","-",90);
        display.getList("NEGARA","POSITIF","DEATH","SEMBUH","UPDATE",120);
        System.out.print("\n");
        display.getList(c.getCountry(),c.getConfirmed(),c.getDeaths(),c.getRecovered(),c.getDate(),120);
    }

    public void getWorldLiveBox() throws Exception {
        Global global = coronavirus.getGlobalLatest();
        clearConsole();
        display.getTitleBar("DATA TOTAL SELURUH DUNIA","-",90);
        display.getList(" TOTAL CONFIRMED ","TOTAL RECOVERED"," "," TOTAL DEATHS","",120);
        System.out.print("\n");
        display.getList(" "+global.getTotalConfirmed(),global.getTotalRecovered()," ",global.getTotalDeaths()," ",120);
    }

    public void getProvinsiTable() throws Exception {
        ArrayList<Indonesia> indonesia = (ArrayList<Indonesia>) coronavirus.getProvinsi();
        clearConsole();
        display.getTitleBar("DATA PROVINSI INDONESIA","-",90);
        display.getList("PROVINSI","KODE PROV","POSITIF","DEATHS","SEMBUH",120);
        System.out.print("\n");
        for (Indonesia i : indonesia ) {
            Provinsi p = i.getProvinsi();
            display.getList(p.getProvinsi(),p.getKodeProv(),p.getPositif(),p.getMeninggal(),p.getSembuh(),120);
            System.out.print("\n");
        }

    }

}
