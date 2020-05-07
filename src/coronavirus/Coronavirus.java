package coronavirus;

import coronavirus.data.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import com.google.gson.Gson;

public class Coronavirus {

    private static final String BASE_URL = "https://api.kawalcorona.com/";
    private static final Gson gson = new Gson();

    /*
		@getGlobalCases mengembalikan Array object yang berisi
		object GlobalData.
    */

    public GlobalCases[] getGlobalCases() throws Exception {
        return gson.fromJson(getPage(BASE_URL), GlobalCases[].class);
    }

    /*
		@getIndonesia mengembalikan object Indonesia yang berisi
		data positif, sembuh dan meninggal di NKRI
    */

    public Indonesia getIndonesia() throws Exception {
        return gson.fromJson(getPage(getJson("indonesia")), Indonesia.class);
    }

    /*
		@getWorldCured mengembalikan object WorldCured yang berisi data
		orang sembud covid19 sedunia
    */

    public WorldCured getWorldCured() throws Exception {
        return gson.fromJson(getJson("sembuh"), WorldCured.class);
    }

    /*
		@getWorldDeaths mengembalikan object WorldDeaths yang berisi data
		orang meninggal dari covid19 sedunia
    */

    public WorldDeaths getWorldDeaths() throws Exception {
        return gson.fromJson(getJson("meninggal"), WorldDeaths.class);
    }

    /*
		@getWorldPositif mengembalikan object WorldPositif yang berisi data
		orang yang positif terkena Covid19 di Dunia
    */

    public WorldPositif getWorldPositif() throws Exception {
        return gson.fromJson(getJson("positif"), WorldPositif.class);
    }


    private static String getJson(String endpoint) throws Exception {
        String URL = BASE_URL + endpoint;
        return getPage(URL);
    }

    private static String getPage(String url) throws Exception{
        URL url1 = new URL(url);
        URLConnection connection = url1.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 5.1; rv:19.0) Gecko/20100101 Firefox/19.0");
        connection.connect();
        BufferedReader serverResponse = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String response = serverResponse.readLine();
        serverResponse.close();
        return response;
    }

}
