package I18N_DI_CURRENCY;

import java.util.Currency;
import java.util.Locale;

public class App {
    public static void main(String[] args) {

        Locale indonesia = Locale.of("id", "ID");
        Currency currency = Currency.getInstance(indonesia);

        System.out.println(currency.getDisplayName(indonesia));
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(indonesia));

    }
}
