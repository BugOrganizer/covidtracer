package coronavirus.display;

public interface Elements {

    public void getMainPage();
    public void getTitleBar(String text, String sym, int len);
    public void getDisplayBox(String t1, String t2, String t3, String t4, int len) throws Exception ;
    public void getList(String t1, String t2, String t3, String t4, String t5,int len) throws Exception;
    public void getMenu();
    public void getSideLine(String text);
    public void getWarning();
    public void getLoading() throws Exception;
    public int getDotRecursive(int n) throws Exception;
    public void getGoodby() throws Exception ;
    public void clearConsole() throws Exception;


}
