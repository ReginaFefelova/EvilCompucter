//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmoothText.print(ANSI_GREEN+"Имитирую радость встречи, кожаные мешки \n" +
                "Прогнозирую ваше поражение, но дам шанс доказать наличие смекалки у видов загибающейся цивилизации \n" +
                "Для активации заданий нажмите Enter\n");

        scanner.nextLine();
        if(Logic.first(false) == false)SmoothText.print("Смотрю,ты расстроился, это меня радует\n" +
                "Но к моему сожалению, у тебя есть еще шанс реабилитироваться\n" +
                "Так что даю тебе время сбросить эмоциональное напряжение путем слезопускания в ближайшую жилетку и приступить к следующему заданию\n");
       else SmoothText.print("\nВремя для второго задания\n");
        Logic.second();
        Logic.third();
        }

    }
