package commons;

public class Validate {
    public static final String ID_VILLA_REGEX="SVVL-\\d{4}";
    public static final String ID_HOUSE_REGEX="SVHO-\\d{4}";
    public static final String ID_ROOM_REGEX="SVRO-\\d{4}";
    public static final String NAMESERVICE_REGEX="(Spa|Pool|Bar|Casino|Golf)";
    public static final String ACCOMPANIEDSERVICE_REGEX="(massage|karaoke|food|drink|car)";
    public static final String RENTALTYPE_REGEX="(Day|Month|Year|Hours)";
    public static final String STANDARD_REGEX="(Vip|Medium|Normal)";

    public static final String NAME_REGEX="([\\p{Lu}][\\p{Ll}]{0,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){1,10}";
    public static final String EMAIL_REGEX="([\\w]+@[a-z]+.(com|vn))";
    public static final String GENDER_REGEX="(Male|Female|Unknow)";
    public static final String IDCARD_REGEX="([0-9]{3}-[0-9]{3}-[0-9]{3})";
    public static final String BIRTHDAY_REGEX="\\d{2}/\\d{2}/\\d{4}";
    public static final String PHONENUMBER_REGEX="(\\+84|0)[0-9]{9}";
    public static final String CUSTOMERTYPE_REGEX="(Diamond|Platinium|Gold|Silver|Member)";

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
        return idCard.matches(IDCARD_REGEX);
    }

    public static boolean checkPhoneNumber(String numphone) {
        return numphone.matches(PHONENUMBER_REGEX);
    }

    public static boolean checkEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }

    public static boolean checkCustomerType (String typecustomer) {
       return typecustomer.matches(CUSTOMERTYPE_REGEX);

    }


    public static boolean checkIdVilla(String idVilla) {
        return idVilla.matches(ID_VILLA_REGEX);
    }

    public static boolean checkIdHouse(String idHouse) {
        return idHouse.matches(ID_HOUSE_REGEX);
    }

    public static boolean checkIdRoom(String idRoom) {
        return idRoom.matches(ID_ROOM_REGEX);
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
