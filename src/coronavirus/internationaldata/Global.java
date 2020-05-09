package coronavirus.internationaldata;

import com.google.gson.annotations.SerializedName;

public class Global {

    @SerializedName("TotalConfirmed")
    private String mTotalConfirmed;

    @SerializedName("TotalDeaths")
    private String mTotalDeaths;

    @SerializedName("TotalRecovered")
    private String mTotalRecovered;

    public String getTotalConfirmed() {
        return mTotalConfirmed;
    }

    public String getTotalDeaths() {
        return mTotalDeaths;
    }

    public String getTotalRecovered() {
        return mTotalRecovered;
    }
}
