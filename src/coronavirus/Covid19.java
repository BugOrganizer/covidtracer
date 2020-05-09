package coronavirus;

import coronavirus.internationaldata.Countries;
import coronavirus.internationaldata.Country;
import coronavirus.internationaldata.Global;

public class Covid19 {

    public static void main(String[] args) throws Exception {

        Crazypandemic crazypandemic = new Crazypandemic();
        Global global = crazypandemic.getGlobalLatest();
        System.out.println("=== Data Global ===");
        System.out.println("Positif : "+global.getTotalConfirmed());
        System.out.println("Meninggal : "+global.getTotalDeaths());
        System.out.println("Sembuh : "+global.getTotalRecovered());

        Country usa = crazypandemic.getByCountry("united-states");
        System.out.println("== Data Negera USA ==");
        System.out.println("Positif : "+usa.getConfirmed());
        System.out.println("Sembuh : "+usa.getRecovered());
        System.out.println("Meninggal : "+usa.getDeaths());

        Countries[] dunia = crazypandemic.getCountryAll();
        System.out.println("== Data Seluruh Dunia ==");
        for (Countries x : dunia ) {
            System.out.println(x.getCountry() +" Positif : "+ x.getTotalConfirmed());
        }

    }
}