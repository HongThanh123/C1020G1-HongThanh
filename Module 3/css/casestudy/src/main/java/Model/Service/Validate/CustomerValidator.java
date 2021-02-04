package Model.Service.Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerValidator {
    public static boolean validateName (String name){
        String regex = "[A-Z][a-z]";

        Pattern pattern =  Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name );

        return matcher.find();
    }
    public static boolean validatePhone (String phone){
        String regex = "(^(090)\\d{7}$)|(^(091)\\d{7}$)|(^(\\+\\(84\\) 90)\\d{7}$)|(^(\\+\\(84\\) 91)\\d{7}$)";

        Pattern pattern =  Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        return matcher.find();
    }

    public static boolean validateIdCard(String idCard){
        String regex = "(^\\d{9}$)|(^\\d{12}$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(idCard);
        return matcher.find();
    }
    public static boolean validateEmail (String email){
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
}
