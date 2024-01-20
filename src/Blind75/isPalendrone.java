package Blind75;

public class isPalendrone {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) return false;
        int left = 0;
        int right = s.length()-1;
        while(left <= right ){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(Character.isLetterOrDigit(leftChar)){
                left++;
            }else if(Character.isLetterOrDigit(rightChar)){
                right++;
            }else{
                if(Character.toLowerCase(left) != Character.toLowerCase(rightChar)){
                    return false;
                }
                left++;
                right++;
            }
        }
        return true;

    }
}
