package coronavirus.display;

public interface Elements {

    public void getMainPage() throws Exception;
    public void getTitleBar(String text, String sym, int len) throws Exception;
    public void getDisplayBox(String t1, String t2, String t3, String t4, int len) throws Exception ;
    public void getList(String t1, String t2, String t3, String t4, String t5,int len) throws Exception;
    public void getMenu() throws Exception;
    public void getSideLine(String text);
    public void getLoading() throws Exception;
    public int getDotRecursive(int n) throws Exception;


}
