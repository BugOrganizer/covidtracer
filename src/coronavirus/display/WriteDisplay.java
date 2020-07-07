package coronavirus.display;

import coronavirus.internationaldata.*;

import java.util.ArrayList;

public class WriteDisplay extends Display {
    private static final Display display = new Display();
    final private Countries[] countries;
    final private Country indonesiaLatest;
    final private Global global;
    final private ArrayList<Indonesia> provinsi;
    final private int maxDeath,minDeath,maxRecovered,minRecovered;

    public WriteDisplay(Countries[] countries, Country indonesiaLatest, Global global, ArrayList<Indonesia> indonesia,
                        int maxDeath, int minDeath, int maxRecovered, int minRecovered)
    {
        this.countries = countries;
        this.indonesiaLatest = indonesiaLatest;
        this.global = global;
        this.provinsi = indonesia;
        this.maxDeath = maxDeath;
        this.minDeath = minDeath;
        this.maxRecovered = maxRecovered;
        this.minRecovered = minRecovered;

    }


    /*
    * getWorldTable Menampilkan data di seluruh dunia, mencetak berdasarkan banyak
    * karakter yang akan ditampilkan
    * */
    public void worldTable() throws Exception {
        clearConsole();
        display.titleBar("DATA SELURUH DUNIA","-",90);
        display.listBox("NEGARA","POSITIF","DEATH","SEMBUH","UPDATE",120);
        System.out.print("\n");
        for (Countries x : this.countries) {
            if (x.getTotalConfirmed().equals("0")){
                System.out.print("");
            }else {
                display.listBox(x.getCountry(),x.getTotalConfirmed(),
                        x.getTotalDeaths(),x.getTotalRecovered(),x.getUpdateDate(),120);
                System.out.print("\n");
            }
        }
    }

//    /*
//    * getWorldTable() Mencetak data berdasarkan negara yang di inginkan
//    * */
//    public void WorldTable(String flag) throws Exception {
//        Country c = coronavirus.getByCountry(flag);
//        clearConsole();
//        display.TitleBar("DATA NEGARA "+flag.toUpperCase(),"-",90);
//        display.ListBox("NEGARA","POSITIF","DEATH","SEMBUH","UPDATE",120);
//        System.out.print("\n");
//        display.ListBox(c.getCountry(),c.getConfirmed(),c.getDeaths(),c.getRecovered(),c.getDate(),120);
//    }

    /*
    * getIndonesiaTable() Mencetak data terkini negara Indonesia
    * */
    public void indonesiaTable() throws Exception {
        Country c = indonesiaLatest;
        clearConsole();
        display.titleBar("DATA NEGARA INDONESIA","-",90);
        display.listBox("NEGARA","POSITIF","DEATH","SEMBUH","UPDATE",120);
        System.out.print("\n");
        display.listBox(c.getCountry(),c.getConfirmed(),c.getDeaths(),c.getRecovered(),c.getDate(),120);
    }

    /*
    * getWorldLiveBox() Mencetak data total kasus di seluruh dunia
    * */
    public void worldLiveBox() throws Exception {
        Global global = this.global;
        clearConsole();
        display.titleBar("DATA TOTAL SELURUH DUNIA","-",90);
        display.listBox(" TOTAL CONFIRMED ","TOTAL RECOVERED"," "," TOTAL DEATHS","",120);
        System.out.print("\n");
        display.listBox(" "+global.getTotalConfirmed(),global.getTotalRecovered()," ",global.getTotalDeaths()," ",120);
    }

    /*
    * getProvinsiTable() Mencetak data kasus provinsi di Indonesia
    * */
    public void provinsiTable() throws Exception {
        clearConsole();
        display.titleBar("DATA PROVINSI INDONESIA","-",90);
        display.listBox("PROVINSI","KODE PROV","POSITIF","DEATHS","SEMBUH",120);
        System.out.print("\n");
        for (Indonesia i : this.provinsi ) {
            Provinsi p = i.getProvinsi();
            display.listBox(p.getProvinsi(),p.getKodeProv(),p.getPositif(),
                    String.valueOf(p.getMeninggal()),String.valueOf(p.getSembuh()),120);
            System.out.print("\n");
        }

    }
    public void kasusMeninggal() {
        for (Indonesia i : this.provinsi ) {
            Provinsi p = i.getProvinsi();
            if (p.getMeninggal() == this.maxDeath) {
                System.out.println("Meninggal Terbanyak");
                display.listBox("PROVINSI","DEATHS",
                        "","","",120);
                display.listBox(p.getProvinsi(),String.valueOf(this.maxDeath),
                        "","","",120);
                System.out.println("\n");
            }

            else if (p.getMeninggal() == this.minDeath){
                System.out.println("Meninggal Paling Sedikit");
                display.listBox("PROVINSI","DEATHS",
                        "","","",120);
                display.listBox(p.getProvinsi(),String.valueOf(this.minDeath),
                        "","","",120);
                System.out.println("\n");
            }
        }
    }

    public void kasusSembuh() {
        for (Indonesia i : this.provinsi ) {
            Provinsi p = i.getProvinsi();

            if (p.getSembuh() == this.maxRecovered) {
                System.out.println("Sembuh Terbanyak");
                display.listBox("PROVINSI","RECOVERED",
                        "","","",120);
                display.listBox(p.getProvinsi(),Integer.toString(this.maxRecovered),
                        "","","",120);
                System.out.println("\n");
            }

            else if (p.getSembuh() == this.minRecovered){
                System.out.println("Sembuh Paling Sedikit");
                display.listBox("PROVINSI","RECOVERED",
                        "","","",120);
                display.listBox(p.getProvinsi(),String.valueOf(this.minRecovered),
                        "","","",120);
                System.out.println("\n");
            }
        }
    }

}
