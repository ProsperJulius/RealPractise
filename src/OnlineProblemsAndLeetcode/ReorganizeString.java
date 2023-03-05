package OnlineProblemsAndLeetcode;

public class ReorganizeString {

    public String reorganizeString(String inputData){
        if(inputData==null) return null;
        if(inputData.length()==1) return inputData;
       char [] chars=inputData.toCharArray();
       StringBuilder resultingString= new StringBuilder();

       for(int i=1;i<chars.length;i++){
           int prev=i-1;
           int next=i+1;
           if(next<chars.length && chars[i]==chars[prev] && chars[i]!=chars[next] ){
               if(i==1){
                   resultingString.append(chars[0]).append(chars[1]);
               }else{
                   resultingString.append(chars[i]);
               }
           }else if(next<chars.length && chars[i]==chars[prev] && chars[i]!=chars[prev] ){
               return "";
           }else{
               resultingString.append(chars[i]);
           }
       }
       return resultingString.toString();
    }
}
