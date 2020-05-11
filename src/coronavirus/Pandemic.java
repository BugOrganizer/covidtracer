package coronavirus;

import coronavirus.internationaldata.Countries;
import coronavirus.internationaldata.Country;
import coronavirus.internationaldata.Global;
import coronavirus.internationaldata.Summary;

abstract class Pandemic {
    abstract Summary getSummary() throws Exception;
    abstract Global getGlobalLatest() throws Exception;
    abstract Countries[] getCountryAll() throws Exception;
    abstract Country getByCountry(String flag) throws Exception;
    abstract Country getIndonesiaLatest() throws Exception;

}
