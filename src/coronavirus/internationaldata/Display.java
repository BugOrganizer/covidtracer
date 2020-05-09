package coronavirus.internationaldata;

public class Display {

    public void getMainPage() throws Exception {
        System.out.print("\n" +
                "   ______           _     ________                   \n" +
                "  / ____/___ _   __(_)___/ /_  __/________ _________ \n" +
                " / /   / __ \\ | / / / __  / / / / ___/ __ `/ ___/ _ \\\n" +
                "/ /___/ /_/ / |/ / / /_/ / / / / /  / /_/ / /__/  __/\n" +
                "\\____/\\____/|___/_/\\__,_/ /_/ /_/   \\__,_/\\___/\\___/ \n" +
                "                                                     \n");

        System.out.print("\n" +
                "Aplikasi monitoring kasus covid 19, aplikasi ini dapat\n" +
                "menampilkan jumlah kasus yang covid19 yang sedang terjadi di \n" +
                "Indonesia maupun dunia, penggunaanya dapat memilih beberapa\n" +
                "pilihan menu dibawah ini  \n");

    }

    public void getTitleBar(String text, String sym, int len) throws Exception {

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

    public void getDisplayBox(String text1, String text2, String text3,
                              String text4, int len) {

        for (int i=0;i<len;i++) System.out.print("=");
        System.out.print("\n");
        for (int i = 0; i < len; i++) {
            if (i == ((len/4)-(text1.length()/2))) {
                System.out.print(text1);
            } else if (i == ((len/2)-(text2.length()/2))){
                System.out.print(text2);
            } else{
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for (int i=0;i<len;i++) System.out.print("-");
        System.out.print("\n");
        for (int i = 0; i < len; i++) {
            if (i == ((len/4)-(text3.length()/2))) {
                System.out.print(text3);
            } else if (i == ((len/2)-(text4.length()/2))){
                System.out.print(text4);
            } else{
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for (int i=0;i<len;i++) System.out.print("=");
    }


}
