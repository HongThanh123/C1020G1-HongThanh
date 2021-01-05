package commons;

public class ConvertUtils {
    public static String normalize (String str){
        StringBuffer stringBuffer = new StringBuffer(str.substring(0,1).toUpperCase());
        stringBuffer.append(str.substring(1).toLowerCase());
         return stringBuffer.toString();

    }
}
