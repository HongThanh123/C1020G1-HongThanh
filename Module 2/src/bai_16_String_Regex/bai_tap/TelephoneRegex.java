package bai_16_String_Regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneRegex {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NAME_PHONE = "(0-9\\d{2})-(0-9\\d{10})";
    public TelephoneRegex() {
    }

    public boolean validate (String regex){
        Pattern pattern = Pattern.compile(NAME_PHONE);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
