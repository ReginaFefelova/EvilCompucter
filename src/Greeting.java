import java.util.Scanner;

public class Greeting {

    private static void progressPercentage(int remain, int total) {
        if (remain > total) {
            throw new IllegalArgumentException();
        }
        int maxBareSize = 10; // 10unit for 100%
        int remainProcent = ((100 * remain) / total) / maxBareSize;
        char defaultChar = '-';
        String icon = "*";
        String bare = new String(new char[maxBareSize]).replace('\0', defaultChar) + "]";
        StringBuilder bareDone = new StringBuilder();
        bareDone.append("[");
        for (int i = 0; i < remainProcent; i++) {
            bareDone.append(icon);
        }
        String bareRemain = bare.substring(remainProcent, bare.length());
        System.out.print("\r" + bareDone + bareRemain + " " + remainProcent * 10 + "%");
        if (remain == total) {
            System.out.print("\n");
        }
    }
    public static void robCO()
    {
        System.out.println(SmoothText.ANSI_GREEN);
        System.out.println("""
                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                @ .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ .
                @ .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \s
                @ .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \s
                @ .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \s
                @ .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \s
                @ .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \s
                @ .@@@@@@@@@@@          @@@@@@@@@@@@@@.  @@@@@@@@@          @@@@@@@@@@@@@@@@@@ \s
                @ .@@@@@@@@@@   @@@@(  #@@@@@@@@@@@@@(  @@@@@@@@@   @@@@%  (@@@@@@@@@@@@@@@@@@ \s
                @ .@@@@@@@@@(  #@@@@  .@@@@@@@@@@@@@&  *@@@@@@@@(  %@@@@   @@@@@@@@@@@@@@@@@@@ \s
                @ .@@@@@@@@@  .@@@@   @@@        @@@        ,@@@  ,@@@@@@@@@@        %@@@@@@@@ \s
                @ .@@@@@@@@   @      @@@  ,@@@  .@@,  @@@/  &@@   @@@@@@@@@@   @@@   @@@@@@@@@ \s
                @ .@@@@@@@*  @@   @@@@@   @@@.  @@&  #@@@  /@@,  @@@@@@@@@@,  @@@*  @@@@@@@@@@ \s
                @ .@@@@@@%  (@@.  &@@@(  &@@%  %@@  .@@@   @@%  /@@@@   @@%  @@@&  #@@@@@@@@@@ \s
                @ .@@@@@@   @@@/  #@@@  (@@@  *@@   @@@.  @@@   @@@@,  @@@  ,@@@   @@%,,,@@@@@ \s
                @ .@@@@@   @@@@&  ,@@        ,@@/        @@@/         @@@*       .@@%   &@@@@@ \s
                @ .@@@@#   @ . @.  @ . @@. @   # @ ,@ @#   @@# .@ @ @ .#   (   & (@@ %/. @@@@@ \s
                @ .@@@@ @@,#.,*@.&@@ # @*** @ @@ @ @  @ @& @@@@ @@ @@@.,@ @@ @@&.*% ,#@& @@@@@ \s
                @ .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \s
                @ .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \s
                @ .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \s
                @ .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \s
                @ .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \s
                @ .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \s
                @ .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \s
                @  \s                
                """);
        Integer i = 0;
        while(i <= 3){
        System.out.print("\rSystem Initialization...");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.print("\r                          ");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        i++;
        ;
    }
        System.out.print("\rSystem Initialization...");
        System.out.print("\r                          ");
        for (int j = 0; j <= 200; j = j + 20) {
            progressPercentage(j, 200);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
        System.out.print("\rChecking Root File System []");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        System.out.print("\rChecking Root File System ["+SmoothText.ANSI_YELLOW+"OK"+SmoothText.ANSI_GREEN+"]\n");
        System.out.print("\rChecking RAM []");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        System.out.print("\rChecking RAM ["+SmoothText.ANSI_YELLOW+"OK"+SmoothText.ANSI_GREEN+"]\n");
        System.out.print("\rChecking CPU []");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        System.out.print("\rChecking CPU ["+SmoothText.ANSI_YELLOW+"OK"+SmoothText.ANSI_GREEN+"]\n");
        try{ Thread.sleep(2000);}
        catch (Exception e){}
        System.out.println("OS Version: RobCo OS v.1.5.2");
        System.out.println("CPU: IBM PowerPC 600 80 MHz");
        System.out.println("RAM: 16Mb  33 Mhz");
        SmoothText.print("""
                Имитирую радость встречи, кожаные мешки\s
                Прогнозирую ваше поражение, но дам шанс доказать наличие смекалки у видов загибающейся цивилизации\s
                Для активации заданий нажмите Enter
                """);
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
