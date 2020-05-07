package coronavirus.data;
import com.google.gson.annotations.SerializedName;

public class Indonesia {

    @SerializedName("positif")
    private String mPositif;

    @SerializedName("sembuh")
    private String mSembuh;

    @SerializedName("meninggal")
    private String mMeninggal;

    public String getPositif() {
        return mPositif;
    }

    public String getSembuh() {
        return mSembuh;
    }

    public String getMeninggal() {
        return mMeninggal;
    }

}
