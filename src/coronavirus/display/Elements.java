package coronavirus.display;

public interface Elements {

    void mainPage();
    void titleBar(String text, String sym, int len);
    void listBox(String t1, String t2, String t3, String t4, String t5, int len) throws Exception;
    void menu();
    void sideLine(String text);
    void warning();
    void loading() throws Exception;
    int dotRecursive(int n) throws Exception;
    void goodbye() throws Exception ;
    void clearConsole() throws Exception;
    void fetchData();

}
