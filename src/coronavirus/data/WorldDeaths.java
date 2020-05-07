package coronavirus.data;
import com.google.gson.annotations.SerializedName;

public class WorldDeaths {

    @SerializedName("name")
    private String mNama;

    @SerializedName("value")
    private String mValue;

    public String getNama(){
        return mNama;
    }

    public String getValue(){
        return mValue;
    }
}
