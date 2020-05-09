package coronavirus.internationaldata;

import com.google.gson.annotations.SerializedName;

public class Countries {

    @SerializedName("Country")
    private String Country;

    @SerializedName("TotalConfirmed")
    private String TotalConfirmed;

    @SerializedName("TotalDeaths")
    private String TotalDeaths;

    @SerializedName("TotalRecovered")
    private String TotalRecovered;

    @SerializedName("Date")
    private String Date;

    public String getCountry() {
        return Country;
    }

    public String getTotalConfirmed() {
        return TotalConfirmed;
    }

    public String getTotalDeaths() {
        return TotalDeaths;
    }

    public String getTotalRecovered() {
        return TotalRecovered;
    }

    public String getUpdateDate() {
        return Date;
    }
}
