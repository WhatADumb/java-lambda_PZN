package study.java.self.lamda.util;

public class StringUtil {
    public static boolean isLowerCase(String word) {
        for(char c : word.toCharArray()){
            if(!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
}
