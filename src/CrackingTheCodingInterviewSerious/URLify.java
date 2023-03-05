package CrackingTheCodingInterviewSerious;

public class URLify {

    public static String urlify(char[] currentWord,int actualSize){
        if(currentWord==null) return null;
        int index,numberOfSpaces=0;
        for(int i=0;i<currentWord.length;i++){
            if(currentWord[i]==' '){
                numberOfSpaces++;
            }
        }
        index=actualSize+numberOfSpaces*2;

        if(actualSize<currentWord.length)currentWord[actualSize]='\0';
        for(int i=actualSize-1;i>=0;i--){
            if(currentWord[i]==' '){
                currentWord[index-1]='0';
                currentWord[index-2]='2';
                currentWord[index-3]='%';
                index=index-3;
            }else{
                currentWord[index-1]=currentWord[i];
                index--;
            }

        }

        return null;

    }
}
