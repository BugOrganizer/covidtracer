import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;


public class CovidNaintin{
	public static String BASE_URL = "https://api.kawalcorona.com/";

	public static String getPage(String url) throws Exception{
		URL url1 = new URL(url);
		URLConnection connection = url1.openConnection();
		connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 5.1; rv:19.0) Gecko/20100101 Firefox/19.0");
		connection.connect();
		BufferedReader serverResponse = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String response = serverResponse.readLine();
		serverResponse.close();
		return response;
	} 



	public static void main(String[] args) throws Exception{

		Gson gson = new Gson(); 
		
		//Sembuh sem = gson.fromJson(response, Sembuh.class);
		//System.out.println(sem.getValue());

		//Dunia[] dun = gson.fromJson(getPage(BASE_URL), Dunia[].class);

		//Attribute t = dun[0].getAttribute();
		//System.out.println(t.getCountryRegion()+" : "+t.getConfirmed());

		Indonesia[] idn = gson.fromJson(getPage(BASE_URL+"indonesia"), Indonesia[].class);

		Indonesia x = idn[0];
		System.out.println("Indonesia Positif : "+x.getPositif());

		WorldPositif wpsf = gson.fromJson(getPage(BASE_URL+"positif"), WorldPositif.class);

		System.out.println("World "+wpsf.getName() +" : "+wpsf.getValue());
		

		/*
		for (Dunia d : dun ) {

			Attribute t = d.getAtt();

			System.out.println(t.getCountryRegion()+" : "+t.getConfirmed());
		}
		
		*/




	}	
}
