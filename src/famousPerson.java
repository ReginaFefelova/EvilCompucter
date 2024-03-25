import java.io.Serializable;
import java.util.*;

public class famousPerson implements Serializable {

    public static void ask() {
        SmoothText.print("\nВремя проверить ваш кругозор и осведомленность, приступайте к ответу на три вопроса про известных личностей");
        Scanner scanner = new Scanner(System.in);
        String answer;
        Map<String, List> famous = new HashMap<>();

        famous.put("\nРоссийский программист, создатель ведущего ПО для информационной безопасности\n", List.of("Касперский", "Евгений Касперский", "Жэка Каспер"));
        famous.put("\nПредприниматель, инженер, основатель копании по производству аэрокосмической техники и оказанию услуг космического транспорта\n", List.of("Илон Маск", "Elon Musk", "Маск", "Musk"));
        famous.put("\nЯпонский геймдизайнер, геймдиректор, сценарист и продюсер\n", List.of("Хидэо Кодзима", "Кодзима", "Хидео Кодзима", "Гений"));
        Integer i = 0;
        List<String> hints = Arrays.asList("A", "A", "A");
        List<String> correct = Arrays.asList("Одни игры на уме, но это и помогло вам, держите подсказку - ", "Согласен, это было слишком просто. Пересмотрю свои вопросы. Вот подсказка - ", "Да-да, его программа предохраняет при посещении сайтов. Подсказка - ");
        List<String> jokes = Arrays.asList("Как жаль, как жаль, что ошиблись. Нет!", "Ха, не знаете! Как тебе такое, Илон Маск!", """
                Вас не учили использовать защиту? Присмотритесь к его разработке - вещь полезная. 
                Я сам без неё даже к перегоревшей микроволновке не полезу""");
        for (Map.Entry<String, List> entry : famous.entrySet()) {
            SmoothText.print(entry.getKey());
            answer = scanner.nextLine();
            if (entry.getValue().contains(answer)) {
                SmoothText.print(correct.get(i) + hints.get(i));

            } else {
                SmoothText.print(jokes.get(i));

            }
            i++;
        }
    }
}