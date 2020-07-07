package coronavirus.internationaldata;

import com.google.gson.annotations.SerializedName;

public class Provinsi {

    @SerializedName("Kode_Provi")
    private String KodeProv;

    @SerializedName("Provinsi")
    private String Provinsi;

    @SerializedName("Kasus_Posi")
    private String Positif;

    @SerializedName("Kasus_Semb")
    private int Sembuh;

    @SerializedName("Kasus_Meni")
    private int Meninggal;


    public String getKodeProv() {
        return KodeProv;
    }

    public String getProvinsi() {
        return Provinsi;
    }

    public String getPositif() {
        return Positif;
    }

    public int getSembuh() {
        return Sembuh;
    }

    public int getMeninggal() {
        return Meninggal;
    }
}
