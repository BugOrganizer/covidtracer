package coronavirus.display;

public interface Elements {

    public void MainPage();
    public void TitleBar(String text, String sym, int len);
    public void ListBox(String t1, String t2, String t3, String t4, String t5, int len) throws Exception;
    public void Menu();
    public void SideLine(String text);
    public void Warning();
    public void Loading() throws Exception;
    public int DotRecursive(int n) throws Exception;
    public void Goodbye() throws Exception ;
    public void clearConsole() throws Exception;


}
