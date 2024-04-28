package enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum PreGameMenuCommands {

    PreGameMenuCommands("");
    private final String pattern;

    PreGameMenuCommands(String pattern) {
        this.pattern = pattern;
    }

    public Matcher getMatcher(String input) {
        Matcher matcher = Pattern.compile(this.pattern).matcher(input);

        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }
}
