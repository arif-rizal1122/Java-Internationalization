package resource_bundle;

import java.util.ResourceBundle;

public class App {
    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("resources.message");

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("goodbye"));

    }
}
