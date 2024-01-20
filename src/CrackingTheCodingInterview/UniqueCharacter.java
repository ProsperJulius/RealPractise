package CrackingTheCodingInterview;

public class UniqueCharacter {
    public static boolean hasAllUniqueCharacters(String word){
        if(word==null || word.length()>128)return false;

        char[] wordChar=word.toCharArray();
        boolean[] lookupTable= new boolean[128];
        for(int i =0;i<wordChar.length;i++){
            if(lookupTable[wordChar[i]]==true){
                return false;
            }else{
                lookupTable[wordChar[i]]=true;
            }
        }
return true;
    }

    public static void main(String[] args) {
        System.out.println(hasAllUniqueCharacters("helysdssso"));
    }
}
