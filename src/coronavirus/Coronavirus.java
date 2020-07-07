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
import java.util.Collections;
import coronavirus.display.Display;

public class Coronavirus {

    private static final String BASE_URL = "https://api.covid19api.com/";
    private static final String IDPROV_URL = "https://api.kawalcorona.com/indonesia/provinsi";
    private static final Gson gson = new Gson();
    private static final Display display = new Display();

    public Summary summary;
    public Global globalLatest;
    public Countries[] countryAll;
    public Country indonesiaLatest;
    public ArrayList<Indonesia> provinsi;
    public int maxDeath,minDeath,maxRecovered,minRecovered;

    Coronavirus() throws Exception {
        this.summary = getSummary();
        this.globalLatest = getGlobalLatest();
        this.countryAll = getCountryAll();
        this.indonesiaLatest = getIndonesiaLatest();
        this.provinsi = getProvinsi();
        this.maxDeath = getMaxDeath(this.provinsi);
        this.minDeath = getMinDeath(this.provinsi);
        this.maxRecovered = getMaxRecovered(this.provinsi);
        this.minRecovered = getMinRecovered(this.provinsi);

    }

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
     * getIndonesiaLatest() mengembalikan data berupa object country yang memuat data terkini covid 19
     * di Indonesia.
     * */
    public Country getIndonesiaLatest() throws Exception {
        Country[] country = gson.fromJson(getJson("country/indonesia"), Country[].class);
        return country[country.length - 1];
    }

    /*
    * getProvinsi() mengembalikan list bertipe Indonesia yang berisi data provinsi di Indoneisa.
    * */
    public ArrayList<Indonesia> getProvinsi() throws Exception {
        Type IndonesiaList = new TypeToken<ArrayList<Indonesia>>() {}.getType();
        return gson.fromJson(getPage(IDPROV_URL),IndonesiaList);
    }

    public int getMaxDeath(ArrayList<Indonesia> indonesia)  {
        ArrayList<Integer> Meninggal = new ArrayList<>();
        for (Indonesia i : indonesia ) {
            Provinsi p = i.getProvinsi();
            Meninggal.add(p.getMeninggal());
        }
        return Collections.max(Meninggal);
    }

    public int getMinDeath(ArrayList<Indonesia> indonesia){
        ArrayList<Integer> Meninggal = new ArrayList<>();
        for (Indonesia i : indonesia ) {
            Provinsi p = i.getProvinsi();
            Meninggal.add(p.getMeninggal());
        }
        return Collections.min(Meninggal);
    }

    public int getMaxRecovered(ArrayList<Indonesia> indonesia){
        ArrayList<Integer> Sembuh = new ArrayList<>();
        for (Indonesia i : indonesia ) {
            Provinsi p = i.getProvinsi();
            Sembuh.add(p.getSembuh());
        }
        return Collections.max(Sembuh);
    }

    public int getMinRecovered(ArrayList<Indonesia> indonesia){
        ArrayList<Integer> Sembuh = new ArrayList<>();
        for (Indonesia i : indonesia ) {
            Provinsi p = i.getProvinsi();
            Sembuh.add(p.getSembuh());
        }
        return Collections.min(Sembuh);
    }


    /*
    * getJson() mengembalikan String yang berisi text JSON
    * */
    private static String getJson(String endpoint) throws Exception {
        String URL = BASE_URL + endpoint;
        return getPage(URL);
    }

    /*
    * getPage() membuat koneksi ke url dan mengembalikan text JSON
    * */
    public static String  getPage(String url) throws Exception {
        URL urls = new URL(url);
        HttpURLConnection con = (HttpURLConnection) urls.openConnection();
        InputStream in = con.getInputStream();
        String encoding = con.getContentEncoding();
        encoding = encoding == null ? "UTF-8" : encoding;
        return IOUtils.toString(in, encoding) ;
    }

}