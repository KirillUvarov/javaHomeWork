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
        FileInputStream inFile = new FileInputStream("Json.txt"); //Открываем файл
        byte[] string = new byte[inFile.available()]; //Резервируем в памяти массив
        inFile.read(string); //Считываем файл, как строку
        String newText = new String(string); //Задаём переменную с типом строки
        inFile.close(); //Закрываем файл
        String str = newText.replace( //Заменяем символы Есть replaceAll("[\'{}\\[\\]]", "")equals("фамилия"))...
                "{", "").replace(
                        "}", "").replace(
                                "\"", "").replace(
                                        "[", "").replace(
                                                "]", "" );
        String[] str2 = str.split(", "); // Парсим текст через запятую
        //System.out.println(Arrays.toString(str2)); // Выводим массив из ключ:значение

        Map<String, String> dictionary = new HashMap<String, String>(); //Создаём хэш-таблицу

        for (String item : str2) {
            String[] strNew = item.split(", ");
            for (String item2 : strNew) { // Разбиваем массив по каждому студенту
                String[] strNew2 = item2.split(",");
                //System.out.println(String.format(Arrays.toString(strNew)));// Выводим массив по каждому студенту
                for (String item3 : strNew2) {
                    String[] strNew3 = item3.split(":");
                    //System.out.println(String.format(Arrays.toString(strNew3)));
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
