package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class demo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?<char>[A-Za-z]*)\\b || (?<int>[1-9]+)");
        String text = "Lorem ipsum, or lipsum " +
                "as it is sometimes known, " +
                "is dummy text used regex in laying " +
                "out print, graphic or web designs. " +
                "The passage is attributed to an unknown " +
                "typesetter in the 15th century who is thought " +
                "to have scrambled parts of Cicero's De Finibus Bonorum et Malorum " +
                "for use in a type specimen book. It usually begins with:";

        Matcher matcher = pattern.matcher(text);
        boolean foundSomething = matcher.find();
        if (foundSomething) {
            while (foundSomething) {
                System.out.println(matcher.group("char"));
                System.out.println(matcher.group("int"));
                foundSomething = matcher.find();
            }
        } else {
            System.out.println("No match");
        }


    }
}
