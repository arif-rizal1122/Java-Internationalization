package I18N_DI_NUMBER;

import java.text.NumberFormat;
import java.util.Locale;

public class I18N_LOCALE {
    public static void main(String[] args) {
        Locale jpn = Locale.of("ja", "JP");
        NumberFormat numberFormat = NumberFormat.getNumberInstance(jpn);
        String format = numberFormat.format(10000.234);
        System.out.println(format);
    }
}
