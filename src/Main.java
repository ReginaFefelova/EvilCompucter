import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Greeting.robCO();
        if (Logic.first(false) == false) SmoothText.print("Смотрю,ты расстроился, это меня радует\n" +
                "Но к моему сожалению, у тебя есть еще шанс реабилитироваться\n" +
                "Так что даю тебе время сбросить эмоциональное напряжение путем слезопускания в ближайшую жилетку и приступить к следующему заданию\n");
        else SmoothText.print("\nВремя для второго задания\n");
        Logic.second();
        Logic.third();
    }

}
