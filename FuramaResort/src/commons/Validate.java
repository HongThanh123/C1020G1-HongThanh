package commons;


import java.time.Year;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final String ID_REGEX="SV(VL|HO|RO)-[\\d]{4}";
    public static final String NAMESERVICE_REGEX="[A-Z][a-z]";
    public static final String ID_CARD_REGEX="([\\d]{3} [\\d]{3} [\\d]{3})";
    public static final String BIRTHDAY_REGEX="[\\d]{2}/[\\d]{2}/[\\d]{4}";
    public static final String ACCOMPANIEDSERVICE_REGEX="(massage|karaoke|food|drink|car)";
    public static final String RENTALTYPE_REGEX="(Day|Month|Year|Hours)";
    public static final String STANDARD_REGEX="(Vip|Medium|Normal)";

    private static Pattern pattern;
    private static Matcher matcher;

    public static boolean isValidRegex(String str, String regex){
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);

        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("Input not matching" + regex);
        }
        return flag;
    }
    public static boolean isMoreThan(double number, double destNumber){
        boolean flag = number > destNumber;
        if (!flag){
            System.out.println("Input is not more than");
        }
        return flag;
    }
    public static boolean isMoreThan(double number, double startNumber, double endNumber){
        boolean flag = number > startNumber && number < endNumber;
        if (!flag){
            System.out.println("Input is not in (" + startNumber + "," + endNumber + ")");
        }
        return flag;
    }
    public  static boolean isValidAccompanied(String accompaniedName){
        String[] list = {"massage,karaoke,food,drink,car"};
        boolean flag = Arrays.asList(list).contains(accompaniedName);

        if (!flag){
            System.out.println("Accompanied service name is not in list service");
        }
        return flag;
    }

    public static void isValidName(String name) throws NameException {
        String[] str = name.split(" ");
        for (String element : str){
            if (Character.isLowerCase(element.charAt(0))){
                throw new NameException();
            }
        }

        for (int i = 0; i<name.length() -1 ; i++){
            if (name.charAt(i) == ' ' && name.charAt(i+1) == ' '){
                throw new NameException();
            }
        }
    }

    public static void isValidEmail(String email) throws EmailException {
        int posA = email.indexOf("@");
        if (posA < 0){
            throw new EmailException();
        }
        int countA = 0;
        int countPoint = 0;
        for (int i = 0; i<email.length() -1 ; i++){
            if (email.charAt(i) == '@'){
                countA++;
            }else if (email.charAt(i) == '.'){
                countPoint++;
            }
            if (countA >=2){
                throw new EmailException();
            }
        }
        if (countPoint == 0){
            throw new EmailException();
        }
    }

    public static void isValidGender(String gender) throws GenderException {
        String[] list = {"male","female","unknown"};

        if (!Arrays.asList(list).contains(gender.toLowerCase())){
            throw new GenderException();

        }
    }

    public static void isValidIdCard(String idCard) throws IdCardException {
        if (!isValidRegex(idCard, Validate.ID_CARD_REGEX)){
            throw new IdCardException();
        }
    }
    public static void isValidBirthDay(String birthDay) throws BirthDayException {
        if (isValidRegex(birthDay, Validate.BIRTHDAY_REGEX)){
            int birthYear =  Integer.parseInt(birthDay.split("/")[2]);
            int curYear = Year.now().getValue();
            if (birthYear <= 1900 || curYear - birthYear < 18){
                throw new BirthDayException();

            }

        }else {
            throw new BirthDayException();
        }

    }

    public static final String NAME_REGEX="([\\p{Lu}][\\p{Ll}]{0,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){1,10}";
    public static final String EMAIL_REGEX="([\\w]+@[a-z]+.(com|vn))";
    public static final String GENDER_REGEX="(Male|Female|Unknow)";


    public static final String PHONE_NUMBER_REGEX="(\\+84|0)[0-9]{9}";
    public static final String CUSTOMER_TYPE_REGEX="(Diamond|Platinium|Gold|Silver|Member)";

    public static boolean checkName(String name) {
        return name.matches(NAME_REGEX);
    }

    public static boolean checkBirthDay(String birthDay) {
        return birthDay.matches(BIRTHDAY_REGEX);
    }

    public static boolean checkGenDer(String gender) {
        return gender.matches(GENDER_REGEX);
    }

    public static boolean checkIdCard(String idCard) {
        return idCard.matches(ID_CARD_REGEX);
    }

    public static boolean checkPhoneNumber(String numPhone) {
        return numPhone.matches(PHONE_NUMBER_REGEX);
    }

    public static boolean checkEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }

    public static boolean checkCustomerType (String typeCustomer) {
       return typeCustomer.matches(CUSTOMER_TYPE_REGEX);

    }


    public static boolean checkIdVilla(String idVilla) {
        return idVilla.matches(ID_REGEX);
    }

    public static boolean checkIdHouse(String idHouse) {
        return idHouse.matches(ID_REGEX);
    }

    public static boolean checkIdRoom(String idRoom) {
        return idRoom.matches(ID_REGEX);
    }

    public static boolean checkNameService(String nameserrvice) {
        return nameserrvice.matches(NAMESERVICE_REGEX);
    }

    public static boolean checkTypeRent(String typerent) {
        return typerent.matches(RENTALTYPE_REGEX);
    }

    public static boolean checkStandardRoom(String standardroom) {
        return standardroom.matches(STANDARD_REGEX);
    }

    public static boolean checkAccompaniedService(String accompanied) {
        return accompanied.matches(ACCOMPANIEDSERVICE_REGEX);
    }
}
