package OnlineProblemsAndLeetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
    Set<Character> characterSet = new HashSet<>();
    if(s == null || s.length() == 0) return 0;
    int firstPointer = 0;
    int secondPointer = 0;
    int max = 0;
    while(secondPointer < s.length()){

        if(!characterSet.contains(s.charAt(secondPointer))){
            characterSet.add(s.charAt(secondPointer));
            max = Math.max(max,characterSet.size());
            secondPointer++;
        }else{
            characterSet.remove(s.charAt(firstPointer));
            firstPointer++;
        }
    }
    return max;
    }
}
