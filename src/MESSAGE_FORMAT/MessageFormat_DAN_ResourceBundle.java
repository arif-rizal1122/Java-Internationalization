package MESSAGE_FORMAT;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormat_DAN_ResourceBundle {
    public static void main(String[] args) {

        Locale indonesia = Locale.of("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("resources.message", indonesia);
        String pattern = resourceBundle.getString("welcome.message");

        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{"arif", "ya kan?"});
        System.out.println(format);

    }
}
