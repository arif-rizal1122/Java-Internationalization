package I18N_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy");
        String format = dateFormat.format(new Date());

        System.out.println(format);

    }
}
