import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Logic {
    private static Scanner scanner = new Scanner(System.in);

    public static  Boolean first (Boolean repeat)
    {
        Boolean isRight = false;
        String result = "";
       if(repeat != true )SmoothText.print("Для начала убедимся в остатках логики \n" +
               "Иначе какой дальнейший смысл тратить вычислительные ресурсы и заряд батареи на исследование примитивных организмов \n" +
               "\nПопробуйте сложить восемь восьмерок так, чтобы получилась тысяча\n");
 String answer = scanner.nextLine();
 answer = answer.replaceAll("\\s","");
 Integer sum = 0;
 try {
     for (String slogaemoe : answer.split("\\+")) {
         if (slogaemoe.contains("=")) slogaemoe = slogaemoe.split("=")[0];
         sum += Integer.parseInt(slogaemoe);
     }

     if (sum == 1000) {
         result = "\nТы ответил правильно, биологическая форма жизни \nПолучи подсказку - A\n";
         isRight = true;
     }
     else result = "\nТы ошибся, мешок с костями";
 }
 catch (Exception e)
 {
         SmoothText.print("\nЭй, кожаный, у нас тут не уравнения, используй только цифры!\n");
         Logic.first(true);
 }
        SmoothText.print(result);
        return isRight;
    }


    public static Boolean second()
    {
        List<String> rightAnswers = Arrays.asList("2","14","два","четырнадцать","2 часа","Четырнадцать часов");

       Boolean isRight = false;
       SmoothText.print("\nСлушай вторую задачу\nЕсли одинадцать плюс два равно один, то чему равно девять плюс пять\n");
       String answer = scanner.nextLine();
       answer = answer.toLowerCase();
       if(rightAnswers.contains(answer)) {
           SmoothText.print("К сожалению моему и вашей примитивной радости, " +
                   "радиация и химикаты не повлияли на ваши когнетивные способности, держите подсказку - А");
           isRight = true;
       }
       else SmoothText.print("Кажется, мой знакомый перегоревший тостер дал бы вам фору");
       return isRight;
    }

  public static Boolean third()
  {
      List<String> rightAnswers = Arrays.asList("40","сорок");
      Boolean isRight = false;
      SmoothText.print("\nРеши задачу\n1 + 4 = 5\n2 + 5 = 12\n3 + 6 = 21\n8 + 11 = ?\n");
      String answer = scanner.nextLine();
      answer = answer.toLowerCase();
      if(rightAnswers.contains(answer)) SmoothText.print("Вы огорчили меня наличием логики\nДержите подсказку - А\n");
      else SmoothText.print("\nМожно было бы порадоваться, но ваше поражение было предсказуемо\n");
      return isRight;
  }

}
