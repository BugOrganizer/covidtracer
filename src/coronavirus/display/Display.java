package coronavirus.display;

public class Display implements Elements{

    @Override
    public void getMainPage() {
        System.out.print("\n" +
                " ██████  ██████  ██    ██ ██ ██████      ████████ ██████   █████   ██████ ███████ \n" +
                "██      ██    ██ ██    ██ ██ ██   ██        ██    ██   ██ ██   ██ ██      ██      \n" +
                "██      ██    ██ ██    ██ ██ ██   ██        ██    ██████  ███████ ██      █████   \n" +
                "██      ██    ██  ██  ██  ██ ██   ██        ██    ██   ██ ██   ██ ██      ██      \n" +
                " ██████  ██████    ████   ██ ██████         ██    ██   ██ ██   ██  ██████ ███████ \n" +
                "                                                                                  \n" +
                "                                                                                  \n");

        String text = "Aplikasi sederhana untuk memantau perkembangan kasus Pandemic covid-19\n" +
                "yang disebabkan oleh virus Severe Acute Respiratory Syndrome-related Coronavirus 2\n" +
                "silahkan cumut di github.com/annurdien/covidtracer\n";
        System.out.print(text);
    }

    @Override
    public void getWarning(){
        System.out.print("\n");
        System.out.println("\n" +
                "  _____                       _ \n" +
                " | ____|_ __ _ __ ___  _ __  | |\n" +
                " |  _| | '__| '__/ _ \\| '__| | |\n" +
                " | |___| |  | | | (_) | |    |_|\n" +
                " |_____|_|  |_|  \\___/|_|    (_)\n" +
                "                                \n");
    }

    @Override
    public void getGoodby() throws Exception{
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n" +
                " $$$$$$\\                            $$\\ $$\\                       $$\\ \n" +
                "$$  __$$\\                           $$ |$$ |                      $$ |\n" +
                "$$ /  \\__| $$$$$$\\   $$$$$$\\   $$$$$$$ |$$$$$$$\\  $$\\   $$\\       $$ |\n" +
                "$$ |$$$$\\ $$  __$$\\ $$  __$$\\ $$  __$$ |$$  __$$\\ $$ |  $$ |      $$ |\n" +
                "$$ |\\_$$ |$$ /  $$ |$$ /  $$ |$$ /  $$ |$$ |  $$ |$$ |  $$ |      \\__|\n" +
                "$$ |  $$ |$$ |  $$ |$$ |  $$ |$$ |  $$ |$$ |  $$ |$$ |  $$ |          \n" +
                "\\$$$$$$  |\\$$$$$$  |\\$$$$$$  |\\$$$$$$$ |$$$$$$$  |\\$$$$$$$ |      $$\\ \n" +
                " \\______/  \\______/  \\______/  \\_______|\\_______/  \\____$$ |      \\__|\n" +
                "                                                  $$\\   $$ |          \n" +
                "                                                  \\$$$$$$  |          \n" +
                "                                                   \\______/           \n");
        Thread.sleep(500);
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    @Override
    public void getTitleBar(String text, String sym, int len) {

        for (int i=0;i<len;i++) System.out.print(sym);
        System.out.print("\n");
        for (int i = 0; i < len; i++) {
            if (i == ((len/2)-(text.length()/2))) {
                System.out.print(text);
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for (int i=0;i<len;i++) System.out.print(sym);
        System.out.print("\n");
    }

    @Override
    public void getDisplayBox(String text1, String text2, String text3,
                              String text4, int len) {

        int tlen1 = len-(text1+text2).length();
        int tlen2 = len-(text3+text4).length();

        for (int i=0;i<len;i++) System.out.print("-");
        System.out.print("\n");
        for (int i = 0; i < tlen1; i++) {
            if (i == ((tlen1/4))) {
                System.out.print(text1);
            } else if (i == ((tlen1-(tlen1/4)))){
                System.out.print(text2);
            } else{
                System.out.print(" ");
            }
        }

        System.out.print("\n");
        for (int i=0;i<len;i++) System.out.print("-");
        System.out.print("\n");
        for (int i = 0; i < tlen2; i++) {
            if (i == ((tlen2/4))) {
                System.out.print(text3);
            } else if (i == ((tlen2-(tlen2/4))-2)){
                System.out.print(text4);
            }else{
                System.out.print(" ");
            }
        }

        System.out.print("\n");

        for (int i=0;i<len;i++) System.out.print("-");
    }

    @Override
    public void getList(String text1, String text2,
                         String text3, String text4, String text5,int len) {

        int len1 = text1.length(),len2 = text2.length(),
                len3 = text3.length(),len4 = text4.length(),len5 = text5.length();

        int lf = len-(len1+len2+len3+len4+len5);
        System.out.print("\n");
        for (int i = 0; i < lf; i++) {
            if (i == (0) ){
                System.out.print(text1);
            } else if (i == (len-(85+len1))){
                System.out.print(text2);
            } else if(i == (len-(70+len1+len2))){
                System.out.print(text3);
            }else if(i == (len-(55+len1+len2+len3))){
                System.out.print(text4);
            }else if(i == (len-(45+len1+len2+len3+len4))){
                System.out.print(text5);
            }else{
                System.out.print(" ");
            }
        }

    }


    public void getSideLine(String text){
        for (int i=0;i<90;i++) {
            if (i == 0 || i == (89-text.length())){
                System.out.print("#");
            } else if (i == 3){
                System.out.print(text);
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }

    @Override
    public void getMenu() {
        getTitleBar("MENU","~",90);
        getSideLine("1. Lihat Data Indonesia");
        getSideLine("2. Lihat Data Seluruh Dunia");
        getSideLine("3. Lihat Data Berdasarkan Negara");
        getSideLine("4. Lihat Data Provinsi Indonesia");
        getSideLine("5. Keluar Dari Program");
        System.out.print("\nSilahkan pilih menu : ");


    }

    @Override
    public int getDotRecursive(int n) throws Exception{
        if (n==0) {
            return 1;

        }else{
            System.out.print(".");
            Thread.sleep(300);
            return getDotRecursive(n-1);
        }
    }


    @Override
    public void getLoading() throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Loading");
        getDotRecursive(10);
        System.out.print("\n");
    }
}
