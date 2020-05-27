package coronavirus.display;

public class Display implements Elements{

    /*
    * Menampilkan MainPage
    * */
    @Override
    public void MainPage() {
        System.out.print("\n" +
                "   ______              _      __ ______                    __              \n" +
                "  / ____/____  _   __ (_)____/ //_  __/_____ ____ _ _____ / /__ ___   _____\n" +
                " / /    / __ \\| | / // // __  /  / /  / ___// __ `// ___// //_// _ \\ / ___/\n" +
                "/ /___ / /_/ /| |/ // // /_/ /  / /  / /   / /_/ // /__ / ,<  /  __// /    \n" +
                "\\____/ \\____/ |___//_/ \\__,_/  /_/  /_/    \\__,_/ \\___//_/|_| \\___//_/     \n" +
                "                                                                           \n");

        String text = "Aplikasi sederhana untuk memantau perkembangan kasus Pandemic covid-19\n" +
                "yang disebabkan oleh virus Severe Acute Respiratory Syndrome-related Coronavirus 2\n" +
                "\n";
        System.out.print(text);
    }

    /*
    * Menampilkan Tampilan Peringatkan Error
    * */
    @Override
    public void Warning(){
        System.out.print("\n");
        System.out.println("\n" +
                "  _____                       _ \n" +
                " | ____|_ __ _ __ ___  _ __  | |\n" +
                " |  _| | '__| '__/ _ \\| '__| | |\n" +
                " | |___| |  | | | (_) | |    |_|\n" +
                " |_____|_|  |_|  \\___/|_|    (_)\n" +
                "                                \n");
    }

    /*
    * Menampilkan pesan GoodBye
    * */
    @Override
    public void Goodbye() throws Exception{
        clearConsole();
        System.out.println("\n" +
                "   ______                   __ ____                  __\n" +
                "  / ____/____   ____   ____/ // __ ) __  __ ___     / /\n" +
                " / / __ / __ \\ / __ \\ / __  // __  |/ / / // _ \\   / / \n" +
                "/ /_/ // /_/ // /_/ // /_/ // /_/ // /_/ //  __/  /_/  \n" +
                "\\____/ \\____/ \\____/ \\__,_//_____/ \\__, / \\___/  (_)   \n" +
                "                                  /____/               \n");
        Thread.sleep(500);
        clearConsole();
    }

    /*
    * Menampilkan bar untuk title
    * getTitleBar("judul","~",9)
    * ~~~~~~~~~
    *   judul
    * ~~~~~~~~~
    * */
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


    /*
    * Menampilkan table tanpa border
    * getList("t1","t2","t3","t4""t5",10)
    *
    *  t1  t2  t3  t4   t5
    *
    * */
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

    /*
    * Menampilkan text dengan awal dan akhir #
    *
    * getSideLine("Menu 1")
    * # Menu 1                                  #
    *
    * */
    public void getSideLine(String text){
        for (int i=0;i<90-(text.length());i++) {
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

    /*
    * Menampilkan menu utama
    *
    * */
    @Override
    public void Menu() {
        getTitleBar("MENU","~",90);
        getSideLine("1. Data Indonesia");
        System.out.println();
        getSideLine("2. Data Semua Negara");
        System.out.println();
        getSideLine("3. Data Berdasarkan Negara");
        System.out.println();
        getSideLine("4. Data Provinsi Indonesia");
        System.out.println();
        getSideLine("5. Total Kasus Seluruh Dunia");
        System.out.println();
        getSideLine("6. Keluar Dari Program");
        System.out.print("\nSilahkan pilih menu : ");


    }

    /*
    * Menampilkan titik tanda loading
    * . . . .  setiap titik wait 300 ms
    * */
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

    /*
    * Menampilkan pesan Loading
    * Loading . . . .
    * */
    @Override
    public void Loading() throws Exception {
        clearConsole();
        System.out.print("Loading");
        getDotRecursive(10);
        System.out.print("\n");
    }

    /*
    * Clear Console, Windows atau Linux.
    * */
    @Override
    public void clearConsole() throws Exception {
        String OS = System.getProperty("os.name");
        if (OS.contains("Windows")){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else if (OS.contains("Linux")){
            System.out.print("\033[H\033[2J");
        }
    }

}
