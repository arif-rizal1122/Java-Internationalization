package I18N_DI_CURRENCY;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class I18N_CURRENCY_DI_NUMBER {
    public static void main(String[] args) {
        Locale indonesia = Locale.of("id", "ID");
        NumberFormat format = NumberFormat.getCurrencyInstance(indonesia);
        String number = format.format(100000.25);
        System.out.println(number);
    }
}
