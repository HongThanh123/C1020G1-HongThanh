package bai_16_String_Regex.bai_tap;

public class RegularExpressionTest {
    private static RegularExpression regularExpression;
    public static final String[] validClass = new String[]{"C0318G"};
    public static final String[] invalidClass = new String[]{"M0318G", " P0323A"};

    public static void main(String[] args) {
        regularExpression = new RegularExpression();
        for (String nameclass : validClass) {
            boolean isvalid = regularExpression.validate(nameclass);
            System.out.println("Name class is : " + nameclass + "is valid " + isvalid);
        }
        System.out.println("----------------------------------------------");
        for (String nameclass : invalidClass) {
            boolean isvalid = regularExpression.validate(nameclass);
            System.out.println("Name class is : " + nameclass + "is valid " + isvalid);
        }
    }
}
