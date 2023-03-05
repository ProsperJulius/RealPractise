package OnlineProblemsAndLeetcode;

import java.util.Arrays;

public class Twin {
    public boolean isTwin(String firstString, String secondString) {
        char[] firstChar = firstString.toCharArray();
        char[] secondChar = secondString.toCharArray();
        Arrays.sort(firstChar);
        Arrays.sort(secondChar);
        return Arrays.equals(firstChar,secondChar);
    }
}
