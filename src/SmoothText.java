public class SmoothText {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_GREEN = "\u001B[32m";
    public static void print(String text)
    {
        System.out.print(ANSI_GREEN);
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
