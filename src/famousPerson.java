import java.io.Serializable;
import java.util.*;

public class famousPerson implements Serializable {

    public static void ask() {
        SmoothText.print("\nВремя проверить ваш кругозор и осведомленность, приступайте к ответу на три вопроса про известных личностей");
        Scanner scanner = new Scanner(System.in);
        String answer;

        LinkedHashMap<Integer, Map<String, List>> famous = new LinkedHashMap<>();
        famous.put(1, Map.of("\nРоссийский программист, создатель ведущего ПО для информационной безопасности\n", List.of("Касперский", "Евгений Касперский", "Жэка Каспер")));
        famous.put(2, Map.of("\nПредприниматель, инженер, основатель копании по производству аэрокосмической техники и оказанию услуг космического транспорта\n", List.of("Илон Маск", "Elon Musk", "Маск", "Musk")));
        famous.put(3, Map.of("\nЯпонский геймдизайнер, геймдиректор, сценарист и продюсер\n", List.of("Хидэо Кодзима", "Кодзима", "Хидео Кодзима", "Гений")));

        Map<Integer, String> hints = new HashMap<>();
        hints.put(1, "A");
        hints.put(2, "A");
        hints.put(3, "A");

        Map<Integer, String> correct = new LinkedHashMap<>();
        correct.put(1, "Да-да, его программа предохраняет при посещении сайтов. Подсказка -");
        correct.put(2, "Согласен, это было слишком просто. Пересмотрю свои вопросы. Вот подсказка - ");
        correct.put(3, "Одни игры на уме, но это и помогло вам, держите подсказку - ");

        Map<Integer, String> jokes = new LinkedHashMap<>();
        jokes.put(1, """
                Вас не учили использовать защиту? Присмотритесь к его разработке - вещь полезная. 
                        Я сам без неё даже к перегоревшей микроволновке не полезу""");
        jokes.put(2, "Ха, не знаете! Как тебе такое, Илон Маск!");
        jokes.put(3, "Как жаль, как жаль, что ошиблись. Нет!");

        for (Map.Entry<Integer, Map<String, List>> entry : famous.entrySet()) {
            for (Map.Entry<String, List> intEntry : entry.getValue().entrySet()) {
                SmoothText.print(intEntry.getKey());
                answer = scanner.nextLine();
                if (intEntry.getValue().contains(answer)) {
                    SmoothText.print(correct.get(entry.getKey()) + hints.get(entry.getKey()));
                } else {
                    SmoothText.print(jokes.get(entry.getKey()));

                }
            }
        }
    }
}