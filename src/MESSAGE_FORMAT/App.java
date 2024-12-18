package MESSAGE_FORMAT;

import java.text.MessageFormat;

public class App {
    public static void main(String[] args) {

        String pattern = "Hy {0}, Anda bisa mencari data anda dengan mengetik \"{1}\"  di pencarian.";
        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{"aki", "asep"});
        System.out.println(format);

    }
}
