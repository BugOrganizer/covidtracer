package coronavirus;

import coronavirus.data.GlobalCases;
import coronavirus.data.GlobalData;

public class covid19 {

    public static void main(String[] args) throws Exception {

        GlobalCases[] globalcases = new Coronavirus().getGlobalCases();

        for (GlobalCases x : globalcases) {

            GlobalData m = x.getmGlobalData();
            System.out.println("["+m.getCountryRegion() +"]"+ " Positif : " + m.getConfirmed());
        }
    }
}