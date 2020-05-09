package coronavirus.internationaldata;

import com.google.gson.annotations.SerializedName;

public class Country {

    @SerializedName("Country")
    private String Country;

    @SerializedName("Confirmed")
    private String Confirmed;

    @SerializedName("Deaths")
    private String Deaths;

    @SerializedName("Recovered")
    private String Recovered;

    @SerializedName("Active")
    private String Active;

    @SerializedName("Date")
    private String Date;

    public String getCountry() {
        return Country;
    }

    public String getConfirmed() {
        return Confirmed;
    }

    public String getDeaths() {
        return Deaths;
    }

    public String getRecovered() {
        return Recovered;
    }

    public String getActive() {
        return Active;
    }

    public String getDate() {
        return Date;
    }
}
