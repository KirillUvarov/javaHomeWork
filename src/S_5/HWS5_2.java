package S_5;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Пусть дан список сотрудников: Иван (и остальные, полный текст дз будет на платформе)
 * Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 */

public class HWS5_2 {
    public static void main(String[] args) {
        System.out.println(replay(names()));
    }

    public static List<String> names() {
        String names = new String("Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Иван Иванов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Иван Иванов, Мария Рыкова, Анна Крутова, Марина Лугова, Анна Владимирова, Петр Лыков, Иван Мечников, Петр Петин, Петр Лыков, Иван Ежов");
        List<String> namesList = List.of(names.split(", "));
        return namesList;
    }

    public static Map<String, Integer> replay(List<String> staff) {
        Map<String, Integer> replayNameCount = new LinkedHashMap<>();

        for (int i = 0; i < staff.size(); i++) {
            if (replayNameCount.containsKey(staff.get(i))) {
                replayNameCount.put(staff.get(i), replayNameCount.get(staff.get(i)) + 1);
            } else {
                replayNameCount.put(staff.get(i), 1);
            }
        }

        Object LinkedHashMap;
        Map<String, Integer> sortNames = replayNameCount.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));
        return sortNames;
    }


}
