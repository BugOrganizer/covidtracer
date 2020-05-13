package coronavirus.internationaldata;

import com.google.gson.annotations.SerializedName;

public class Indonesia {

    @SerializedName("attributes")
    Provinsi provinsi;

    public Provinsi getProvinsi(){
        return provinsi;
    }
}
