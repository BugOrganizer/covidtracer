package coronavirus.display;

import coronavirus.Coronavirus;
import coronavirus.internationaldata.*;

import java.util.ArrayList;

public class WriteDisplay extends Display {
    private static final WriteDisplay display = new WriteDisplay();
    private static final Coronavirus coronavirus = new Coronavirus();

    /*
    * getWorldTable Menampilkan data di seluruh dunia, mencetak berdasarkan banyak
    * karakter yang akan ditampilkan
    * */
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

    /*
    * getWorldTable() Mencetak data berdasarkan negara yang di inginkan
    * */
    public void getWorldTable(String flag) throws Exception {
        Country c = coronavirus.getByCountry(flag);
        clearConsole();
        display.getTitleBar("DATA NEGARA "+flag.toUpperCase(),"-",90);
        display.getList("NEGARA","POSITIF","DEATH","SEMBUH","UPDATE",120);
        System.out.print("\n");
        display.getList(c.getCountry(),c.getConfirmed(),c.getDeaths(),c.getRecovered(),c.getDate(),120);
    }

    /*
    * getIndonesiaTable() Mencetak data terkini negara Indonesia
    * */
    public void getIndonesiaTable() throws Exception {
        Country c = coronavirus.getIndonesiaLatest();
        clearConsole();
        display.getTitleBar("DATA NEGARA INDONESIA","-",90);
        display.getList("NEGARA","POSITIF","DEATH","SEMBUH","UPDATE",120);
        System.out.print("\n");
        display.getList(c.getCountry(),c.getConfirmed(),c.getDeaths(),c.getRecovered(),c.getDate(),120);
    }

    /*
    * getWorldLiveBox() Mencetak data total kasus di seluruh dunia
    * */
    public void getWorldLiveBox() throws Exception {
        Global global = coronavirus.getGlobalLatest();
        clearConsole();
        display.getTitleBar("DATA TOTAL SELURUH DUNIA","-",90);
        display.getList(" TOTAL CONFIRMED ","TOTAL RECOVERED"," "," TOTAL DEATHS","",120);
        System.out.print("\n");
        display.getList(" "+global.getTotalConfirmed(),global.getTotalRecovered()," ",global.getTotalDeaths()," ",120);
    }

    /*
    * getProvinsiTable() Mencetak data kasus provinsi di Indonesia
    * */
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
