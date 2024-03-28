import java.io.Serializable;
import java.util.*;

public class famousPerson implements Serializable {

    public static void ask() {
        SmoothText.print("\nВремя проверить ваш кругозор и осведомленность, приступайте к ответу на три вопроса про известных личностей");
        Scanner scanner = new Scanner(System.in);
        String answer;
        // Map<String, List> famous = new HashMap<>();
        Map<Integer, String> famous = new HashMap<>();


        famous.put(0, "\nРоссийский программист, создатель ведущего ПО для информационной безопасности\n" /*, List.of("Касперский", "Евгений Касперский", "Жэка Каспер")*/);
        famous.put(1, "\nПредприниматель, инженер, основатель копании по производству аэрокосмической техники и оказанию услуг космического транспорта\n" /*, List.of("Илон Маск", "Elon Musk", "Маск", "Musk")*/);
        famous.put(2, "\nЯпонский геймдизайнер, геймдиректор, сценарист и продюсер\n" /*, List.of("Хидэо Кодзима", "Кодзима", "Хидео Кодзима", "Гений")*/);
        //Integer i = 0;
        List<List<String>> answers = Arrays.asList(List.of("Касперский", "Евгений Касперский", "Косперский", "Евгений Косперский", "Жэка Каспер"), List.of("Илон Маск", "Elon Musk", "Маск", "Musk"), List.of("Хидэо Кодзима", "Хидэо Кадзима", "Хидео Кадзима", "Кодзима", "Кадзима", "Хидео Кодзима", "Гений"));
        List<String> hints = Arrays.asList("A", "A", "A");
        List<String> correct = Arrays.asList("Да-да, его программа предохраняет при посещении сайтов. Подсказка - ", "Согласен, это было слишком просто. Пересмотрю свои вопросы. Вот подсказка - ", "Одни игры на уме, но это и помогло вам, держите подсказку - ");
        List<String> jokes = Arrays.asList("""
                Вас не учили использовать защиту? Присмотритесь к его разработке - вещь полезная. 
                        Я сам без неё даже к перегоревшей микроволновке не полезу""",
                "Ха, не знаете! Как тебе такое, Илон Маск!", "Как жаль, как жаль, что ошиблись. Нет!");
        //for (Map.Entry<String, List> entry : famous.entrySet()) {
        for (Map.Entry<Integer, String> entry : famous.entrySet()) {
            SmoothText.print(entry.getValue());
            answer = scanner.nextLine();
            //  if (entry.getValue().contains(answer)) {
            if (answers.get(entry.getKey()).contains(answer)) {
                SmoothText.print(correct.get(entry.getKey()) + hints.get(entry.getKey()));

            } else {
                SmoothText.print(jokes.get(entry.getKey()));

            }
            // i++;
        }
    }
}