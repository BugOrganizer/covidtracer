package coronavirus;

import coronavirus.internationaldata.*;

import java.util.ArrayList;

abstract class Pandemic {
    abstract Summary getSummary() throws Exception;
    abstract Global getGlobalLatest() throws Exception;
    abstract Countries[] getCountryAll() throws Exception;
    abstract Country getByCountry(String flag) throws Exception;
    abstract Country getIndonesiaLatest() throws Exception;
    abstract ArrayList<?> getProvinsi() throws Exception;

}
