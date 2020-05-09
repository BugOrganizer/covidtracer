package coronavirus.internationaldata;

import com.google.gson.annotations.SerializedName;

public class Summary {

    @SerializedName("Global")
    private Global global;

    @SerializedName("Countries")
    private Countries[] countries;

    public Global getGlobal() {
        return global;
    }

    public Countries[] getCountries() {
        return countries;
    }

}
