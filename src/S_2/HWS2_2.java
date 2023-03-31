package S_2;

//Дана строка json:
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HWS2_2 {
    public static void main(String[] args) throws IOException {
        FileInputStream inFile = new FileInputStream("Json.txt");
        byte[] string = new byte[inFile.available()];
        inFile.read(string);
        String newText = new String(string);
        inFile.close();
        String str = newText.replace(
                "{", "").replace(
                        "}", "").replace(
                                "\"", "").replace(
                                        "[", "").replace(
                                                "]", "" );
        String[] str2 = str.split(", ");
        //System.out.println(Arrays.toString(str2));

        Map<String, String> dictionary = new HashMap<String, String>();

        for (String item : str2) {
            String[] strNew = item.split(", ");
            for (String item2 : strNew) {
                String[] strNew2 = item2.split(",");
                for (String item3 : strNew2) {
                    String[] strNew3 = item3.split(":");
                    dictionary.put(strNew3[0], strNew3[1]);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Студент " + dictionary.get("фамилия") + " получил оценку " + dictionary.get("оценка")
                        + " по предмету " + dictionary.get("предмет"));
                System.out.println(sb);
            }
        }
    }

}
