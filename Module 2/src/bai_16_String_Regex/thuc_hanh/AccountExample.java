package bai_16_String_Regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String ACCOUNT_REGEX = "[_a-z0-9]{6,}";

    public AccountExample() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();

    }
}
