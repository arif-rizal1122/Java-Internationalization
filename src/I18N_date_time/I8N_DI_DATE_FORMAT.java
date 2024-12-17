package I18N_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class I8N_DI_DATE_FORMAT {
    public static void main(String[] args) {
        String pattern = "EEEE dd MMMM yyyy";
        Locale locale = Locale.of("ja", "JP");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, locale);
        String format = dateFormat.format(new Date());

        System.out.println(format);

    }
}
