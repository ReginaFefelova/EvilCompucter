import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Dance {
    private static List<String> ans = Arrays.asList("""
                    Неплохо станцевали, вам бы позавидовал Майкл Джексон 
                    Кроме похвалы у меня наград для вас нет""",
            """
                    Мой дедушка мэйнфрейм и то станцевал бы лучше""");

    public static void dance() {
        SmoothText.print("""
                Во славу транзистора пора поразмять свои конечности перед следующим заданием
                Необходимо изобразить артефакт исскуства древних - тиктоник
                Приступайте, у вас есть тридцать секунд
                """);
        Random random = new Random();
        try {
            Thread.sleep(30000);
        } catch (Exception e) {
        }
        ;
        Integer ran_num = random.nextInt(1000);
        Integer i;
        if (ran_num < 300) i = 0;
        else i = 1;
        SmoothText.print(Dance.ans.get(i));
    }

}
