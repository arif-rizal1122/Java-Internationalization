package locale;

import java.util.Locale;

public class App {
    public static void main(String[] args) {

        String lang = "id";
        String country = "ID";

        Locale locale = Locale.of(lang, country);
        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());

    }
}
