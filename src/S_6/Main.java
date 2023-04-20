package S_6;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static OS wOs = new OS("Windows", "10");
    public static OS macOs = new OS("MacOS", "12");

    public static Map<Integer, Notebook> marketMenue () {
        Map<Integer, Notebook> position = new HashMap<>();
        position.put(1, new Notebook("Satellite", 8, 500, wOs, "black", 700));
        position.put(2,  new Notebook("Pro", 16, 1000, macOs, "white", 1100));
        position.put(3, new Notebook("7REX", 16, 500, wOs, "black", 900));
        return position;
    }
    public static void main (String[] args) {
        Map<Integer, Notebook> menue = marketMenue();
        for (int i = 0; i < menue.size(); i++) {
            Notebook notebook = menue.get(i);
//            int hdd = notebook.getHdd();
            System.out.println(notebook.values());
//            System.out.println(hdd);
        }

    }








}
