package Miscellenous;

public class Palandrone {
    public boolean checkPalandrone(String input){
        int i=0; //index used for iterating the string
        int stringLength=input.length()-1;
        while(i!=stringLength && i<stringLength){
            if(input.charAt(i)==input.charAt(stringLength)){
                i+=1;
                stringLength-=1;
                continue;
            }else return false;
        }
        return true;
    }
    public boolean checkPalandrone(String input,int leftIndex,int rightIndex){
        if(leftIndex>=rightIndex){
            return true;
        }else if(input.charAt(leftIndex)==input.charAt(rightIndex)){
            return checkPalandrone(input,leftIndex+1,rightIndex-1);
        }else{
            return false;
        }
    }
    public boolean checkPalandrome(String inputString){
        return checkPalandrone(inputString,0,inputString.length()-1);
    }

    public String longestPalandrome(String inputString){
        /*
        * Method for finding the longest Palandrome frome a given string*/
        int i=0;
        String result="";
        int stringLength=inputString.length();
        int k=stringLength-1;
        if(checkPalandrome(inputString)) return inputString;
        while(i<stringLength){
            while (i<k){
                if(checkPalandrome(inputString.substring(i,k))){
                    if(result.length()<inputString.substring(i,k).length()){
                      result=inputString.substring(i,k);
                    }
                }
                k--;
            }
            i++;
            k=stringLength;
        }
        return result;
    }
}
