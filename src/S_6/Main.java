package S_6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringBuilder msi_s = new StringBuilder(msi);
        System.out.println(msi);
        System.out.println(String.mcBook);

    }

    public OS wOs = new OS("Windows", "10");
    public OS macOs = new OS("MacOS", "12");
    public Notebook msi = new Notebook("7REX", 16, 500, wOs, "black", 700);

    public Notebook mcBook = new Notebook("Pro", 16, 1000, macOs, "white", 1100);
    public Notebook toshiba = new Notebook("Satellite", 8, 500, wOs, "black", 700);

    public static HashMap<String, List<String>> marketMenue () {
        HashMap<String, List<String>> contact;
        contact = new HashMap<>();
        Object toString = new Object();
        contact.put(toString.msi, Arrays.asList("+7(894)5555611", "+7(894)2661122"));
        contact.put("Петров Пётр", Arrays.asList("+7(894)5535612", "+7(894)4661122"));
        contact.put("Тимофеев Геннадий", Arrays.asList("+7(894)5556612", "+7(894)6665122"));
        contact.put("Уваров Кирилл", Arrays.asList("+7(894)5575612", "+7(898)6661122"));

        return contact;
    }


}
