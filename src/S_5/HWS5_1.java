package S_5;

import java.util.*;

/**Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
* и у человека уникальное имя. Поработать с методами Map.
 */

 public class HWS5_1 {
    public static void main(String[] args) {
        printAllContacts(addContacts());

    }
    public static HashMap<String, List<String>> addContacts () {
        HashMap<String, List<String>> contact;
        contact = new HashMap<>();
        contact.put("Иванов Иван", Arrays.asList("+7(894)5555611", "+7(894)2661122"));
        contact.put("Петров Пётр", Arrays.asList("+7(894)5535612", "+7(894)4661122"));
        contact.put("Тимофеев Геннадий", Arrays.asList("+7(894)5556612", "+7(894)6665122"));
        contact.put("Уваров Кирилл", Arrays.asList("+7(894)5575612", "+7(898)6661122"));

        return contact;
    }

    public static void printAllContacts (HashMap<String, List<String>> contacts) {
        for(Map.Entry<String, List<String>> entry : contacts.entrySet()) {
            System.out.printf("""
                    Контакт: %s
                    Телефоны: %s\s

                    """, entry.getKey(), entry.getValue());
        }
    }


}
