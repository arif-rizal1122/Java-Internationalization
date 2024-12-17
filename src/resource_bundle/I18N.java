package resource_bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18N {
    public static void main(String[] args) {

        Locale indonesia = Locale.of("id", "ID");
        ResourceBundle bundle = ResourceBundle.getBundle("resources.message_id_ID", indonesia);

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("goodbye"));

    }
}
