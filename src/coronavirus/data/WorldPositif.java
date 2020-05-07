package coronavirus.data;
import com.google.gson.annotations.SerializedName;

public class WorldPositif {
    @SerializedName("name")
    private String mWorldNama;

    @SerializedName("value")
    private String mWorldPositifValue;

    public String getWPosNam(){
        return mWorldNama;
    }

    public String getWPosVal(){
        return mWorldPositifValue;
    }

}
