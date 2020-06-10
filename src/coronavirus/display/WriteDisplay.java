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
    public void WorldTable() throws Exception {
        Countries[] countries = coronavirus.getCountryAll();
        clearConsole();
        display.TitleBar("DATA SELURUH DUNIA","-",90);
        display.ListBox("NEGARA","POSITIF","DEATH","SEMBUH","UPDATE",120);
        System.out.print("\n");
        for (Countries x : countries) {
            if (x.getTotalConfirmed().equals("0")){
                System.out.print("");
            }else {
                display.ListBox(x.getCountry(),x.getTotalConfirmed(),
                        x.getTotalDeaths(),x.getTotalRecovered(),x.getUpdateDate(),120);
                System.out.print("\n");
            }
        }
    }

    /*
    * getWorldTable() Mencetak data berdasarkan negara yang di inginkan
    * */
    public void WorldTable(String flag) throws Exception {
        Country c = coronavirus.getByCountry(flag);
        clearConsole();
        display.TitleBar("DATA NEGARA "+flag.toUpperCase(),"-",90);
        display.ListBox("NEGARA","POSITIF","DEATH","SEMBUH","UPDATE",120);
        System.out.print("\n");
        display.ListBox(c.getCountry(),c.getConfirmed(),c.getDeaths(),c.getRecovered(),c.getDate(),120);
    }

    /*
    * getIndonesiaTable() Mencetak data terkini negara Indonesia
    * */
    public void IndonesiaTable() throws Exception {
        Country c = coronavirus.getIndonesiaLatest();
        clearConsole();
        display.TitleBar("DATA NEGARA INDONESIA","-",90);
        display.ListBox("NEGARA","POSITIF","DEATH","SEMBUH","UPDATE",120);
        System.out.print("\n");
        display.ListBox(c.getCountry(),c.getConfirmed(),c.getDeaths(),c.getRecovered(),c.getDate(),120);
    }

    /*
    * getWorldLiveBox() Mencetak data total kasus di seluruh dunia
    * */
    public void WorldLiveBox() throws Exception {
        Global global = coronavirus.getGlobalLatest();
        clearConsole();
        display.TitleBar("DATA TOTAL SELURUH DUNIA","-",90);
        display.ListBox(" TOTAL CONFIRMED ","TOTAL RECOVERED"," "," TOTAL DEATHS","",120);
        System.out.print("\n");
        display.ListBox(" "+global.getTotalConfirmed(),global.getTotalRecovered()," ",global.getTotalDeaths()," ",120);
    }

    /*
    * getProvinsiTable() Mencetak data kasus provinsi di Indonesia
    * */
    public void ProvinsiTable() throws Exception {
        ArrayList<Indonesia> indonesia = (ArrayList<Indonesia>) coronavirus.getProvinsi();
        clearConsole();
        display.TitleBar("DATA PROVINSI INDONESIA","-",90);
        display.ListBox("PROVINSI","KODE PROV","POSITIF","DEATHS","SEMBUH",120);
        System.out.print("\n");
        for (Indonesia i : indonesia ) {
            Provinsi p = i.getProvinsi();
            display.ListBox(p.getProvinsi(),p.getKodeProv(),p.getPositif(),p.getMeninggal(),p.getSembuh(),120);
            System.out.print("\n");
        }

    }

}
