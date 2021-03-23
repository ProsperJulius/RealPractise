package OnlineProblems;

import java.util.HashSet;

public class ReorganizeString {

    public String reorganizeString(String inputData){
        HashSet<String> lookUpSet=new HashSet<>();
        StringBuilder stringbuilder =new StringBuilder();
        for(int i=0;i<inputData.length();i++){
            if(i+1<inputData.length()){
                stringbuilder.append(inputData.charAt(i)).append(inputData.charAt(i+1));
            }
        }

        return null;
    }
}
