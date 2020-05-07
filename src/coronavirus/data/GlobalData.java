package coronavirus.data;
import com.google.gson.annotations.SerializedName;

public class GlobalData {
    @SerializedName("Country_Region")
    private String mCountryRegion;

    @SerializedName("Confirmed")
    private String mConfirmed;

    @SerializedName("Deaths")
    private String mDeaths;

    @SerializedName("Recovered")
    private String mRecovered;

    @SerializedName("Active")
    private String mActive;

    public String getCountryRegion() {
        return mCountryRegion;
    }

    public String getConfirmed() {
        return mConfirmed;
    }

    public String getDeaths() {
        return mDeaths;
    }

    public String getRecovered() {
        return mRecovered;
    }

    public String getActive() { return mActive; }

}
