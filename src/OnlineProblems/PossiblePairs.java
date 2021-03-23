package OnlineProblems;

public class PossiblePairs {
    public static int possiblePair(int n){
      int cacheMemory[] = new int[n+1];
      return possiblePair(n,cacheMemory);
    }
    public static int possiblePair(int n, int [] cacheMemory){

        if(n==1 || n==0){
            return 1;
        }else if(cacheMemory[n]>=1) {
            return cacheMemory[n];

        }else{
            cacheMemory[n] = possiblePair(n-1)*(n-1)*possiblePair(n-2);
            return cacheMemory[n];
        }
    }
    public static void main(String[] args) {
        System.out.println(possiblePair(20));
    }
}
