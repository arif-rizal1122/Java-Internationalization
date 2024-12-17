package I18N_date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class I8N_DI_DATE_FORMAT_PARSING {
    public static void main(String[] args) {
        String pattern = "EEEE dd MMMM yyyy";
        Locale locale = Locale.of("id", "ID");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, locale);

        try {
            Date date = dateFormat.parse("Minggu 23 Februari 2023");
            System.out.println(date);
        } catch (ParseException e) {
            throw new RuntimeException("Error Parsing: " + e);
        }
    }
}
