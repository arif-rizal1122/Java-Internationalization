package CHOICE_FORMAT;

import java.text.ChoiceFormat;

public class App {
    public static void main(String[] args) {

        String pattern = "-1#negatif | 0#kosong | 1#satu | 1<banyak";
        ChoiceFormat choiceFormat = new ChoiceFormat(pattern);

        String format = choiceFormat.format(1);
        System.out.println(format);

    }
}
