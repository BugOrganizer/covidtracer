package coronavirus.display;

public interface Elements {

    public void getMainPage() throws Exception;
    public void getTitleBar(String text, String sym, int len) throws Exception;
    public void getDisplayBox(String text1, String text2, String text3,
                              String text4, int len) throws Exception ;

    public void getTable(String text1, String text2, String text3, String text4,
                         String text5,int len);


}
