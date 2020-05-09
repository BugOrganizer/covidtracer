package coronavirus.display;

public class Display implements Elements{

    @Override
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

    @Override
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
        System.out.print("\n");
        for (int i = 0; i < len; i++) {
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
}
