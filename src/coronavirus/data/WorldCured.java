package coronavirus.data;
import com.google.gson.annotations.SerializedName;

public class WorldCured {
    @SerializedName("name")
    private String mWCuredNam;

    @SerializedName("value")
    private String mWCuredVal;

    public String getWCuredNam(){
        return mWCuredNam;
    }

    public String getWCuredVal(){
        return mWCuredVal;
    }
}
