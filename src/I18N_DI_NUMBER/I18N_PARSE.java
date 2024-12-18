package I18N_DI_NUMBER;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class I18N_PARSE {
    public static void main(String[] args) {
        var jpn = Locale.of("id", "ID");
        var numberFormat = NumberFormat.getNumberInstance(jpn);

        try {
            var number = numberFormat.parse("10.000.000,266").doubleValue();
            System.out.println(number);

        } catch (ParseException e) {
            throw new RuntimeException("Error Passing : " + e);
        }

    }
}
