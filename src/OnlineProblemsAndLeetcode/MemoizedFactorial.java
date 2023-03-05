package OnlineProblemsAndLeetcode;

public class MemoizedFactorial {

    public static int memoizedFactorial(int x, int [] cacheMemory){

        if (x == 0 || x ==1) {
            return 1;
        }else if(cacheMemory[x]>=1){
            return cacheMemory[x];
        }
        else{
            cacheMemory[x]=memoizedFactorial(x-1)*x;
            return cacheMemory[x];
        }
    }
    public static int memoizedFactorial(int n){
        int [] cacheMemory = new int[n+1];
        return  memoizedFactorial(n,cacheMemory);
    }

    public static void main(String[] args) {
        System.out.println(memoizedFactorial(10));
    }
}
