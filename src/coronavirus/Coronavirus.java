package coronavirus;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import coronavirus.internationaldata.*;
import org.apache.commons.io.IOUtils;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class Coronavirus extends Pandemic {

    private static final String BASE_URL = "https://api.covid19api.com/";
    private static final String IDPROV_URL = "https://api.kawalcorona.com/indonesia/provinsi";
    private static final Gson gson = new Gson();

    /*
     * @getSummary mengembalikan data berupa object Summary yang berisi
     * object Global dan array object Countries
     * */
    public Summary getSummary() throws Exception {
        return gson.fromJson(getJson("summary"), Summary.class);
    }

    /*
     * @getGlobalCases mengembalikan data berupa object global yang berisi data cases
     * positif, death dan recovered
     * */

    public Global getGlobalLatest() throws Exception {
        Summary x = getSummary();
        return x.getGlobal();
    }

    /*
     * @getCountryAll mengembalikan data berupa array of object dari Countries
     * yang berisi data dari seluruh negara di dunia.
     * */
    public Countries[] getCountryAll() throws Exception {
        return getSummary().getCountries();
    }

    /*
     * getByCountry(flag) mengembalikan data berupa object country yang memuat informasi terkini
     * terkait kasus covid 19 disuatu negara.
     * */
    public Country getByCountry(String flag) throws Exception {
        Country[] country = gson.fromJson(getJson("country/" + flag), Country[].class);
        return country[country.length - 1];
    }

    /*
     * getIndonesiaLatest() mengembalikan data berupa object country yang memuat data terkini covid 19
     * di Indonesia.
     * */
    public Country getIndonesiaLatest() throws Exception {
        Country[] country = gson.fromJson(getJson("country/indonesia"), Country[].class);
        return country[country.length - 1];
    }

    public ArrayList<?> getProvinsi() throws Exception {
        Type IndonesiaList = new TypeToken<ArrayList<Indonesia>>() {}.getType();
        return gson.fromJson(getPage(IDPROV_URL),IndonesiaList);
    }

    private static String getJson(String endpoint) throws Exception {
        String URL = BASE_URL + endpoint;
        return getPage(URL);
    }

    public static String  getPage(String url) throws Exception {
        URL urls = new URL(url);
        HttpURLConnection con = (HttpURLConnection) urls.openConnection();
        InputStream in = con.getInputStream();
        String encoding = con.getContentEncoding();
        encoding = encoding == null ? "UTF-8" : encoding;


        return IOUtils.toString(in, encoding) ;
    }

}