import java.util.concurrent.TimeUnit;

public class SmoothText {
    public static void print(String text)
    {
        for(Character chr : text.toCharArray())
        {
            System.out.print(chr);
            try {
                Thread.sleep(100);
            }
            catch (Exception e)
            {}
        }

    }
}
