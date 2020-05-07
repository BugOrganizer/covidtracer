package coronavirus.data;
import com.google.gson.annotations.SerializedName;

public class GlobalCases {
    @SerializedName("attributes")
    private GlobalData mGlobalData;

    public GlobalData getmGlobalData(){
        return mGlobalData;
    }

}
