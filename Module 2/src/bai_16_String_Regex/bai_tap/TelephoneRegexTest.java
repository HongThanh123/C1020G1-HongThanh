package bai_16_String_Regex.bai_tap;

public class TelephoneRegexTest {
    private static TelephoneRegex telephoneRegex;
    private static final String[] validPhone = new String[] {"(84)-(0978489648)"};
    private static final String[] invalidPhone = new String[] {"(a8)-(22222222)"};

    public static void main(String[] args) {
        telephoneRegex = new TelephoneRegex();
        for (String phone : validPhone){
            boolean isvalid = telephoneRegex.validate(phone);
            System.out.println("Phone is : " + phone + " is valid " + isvalid);
        }
        System.out.println("----------------------------------------------");
        for (String phone : invalidPhone){
            boolean isvalid = telephoneRegex.validate(phone);
            System.out.println("Phone is : " + phone + " is valid " + isvalid);
        }
    }
}
