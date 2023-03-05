package OnlineProblemsAndLeetcode;

public class GenerateSubstrings {
    public static void main(String[] args) {
       subStrings("mom");
    }
    public static void subStrings(String s){
        for(int i=0;i< s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
