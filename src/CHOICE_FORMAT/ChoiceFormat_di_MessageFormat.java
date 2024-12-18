package CHOICE_FORMAT;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ChoiceFormat_di_MessageFormat {
    public static void main(String[] args) {

        Locale indonesia = Locale.of("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("resources.message", indonesia);
        String pattern = resourceBundle.getString("ballance");

        MessageFormat messageFormat = new MessageFormat(pattern, indonesia);
        String format = messageFormat.format(new Object[]{1});
        System.out.println(format);

    }
}
