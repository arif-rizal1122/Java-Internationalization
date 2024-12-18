package I18N_DI_NUMBER;

import java.text.NumberFormat;

public class App {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        String format = numberFormat.format(10000.234);
        System.out.println(format);

    }
}
