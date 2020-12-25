package bai_16_String_Regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_REGEX = "[CAP]\\d{4}[GHIKLM]";

    public RegularExpression() {
    }
    public boolean validate (String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
