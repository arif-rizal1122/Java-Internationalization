package MESSAGE_FORMAT_TYPE;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class App {
    public static void main(String[] args) {

        Locale indonesia = Locale.of("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("resources.message", indonesia);
        String pattern = resourceBundle.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern, indonesia);
        String format = messageFormat.format(new Object[]{"ADIL", new Date(), 1000000});
        System.out.println(format);

    }
}
