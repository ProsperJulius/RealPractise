package DynamicProgramming;

public class KnapsackProblem {


    public int bottomUpDp(int val[], int wt[], int w){
        int [][] dpTable =  new int[val.length+1][w+1];
        for(int i =0;i<= val.length;i++){

            for(int j=0;j<=w;j++){

                if(i == 0 || j == 0){
                    dpTable[i][j] = 0;
                    continue;
                }
                if(wt[i-1]<= j){
                    dpTable[i][j]= Math.max(dpTable[i-1][j],dpTable[i-1][j-wt[i-1]]+val[i-1]);
                }else{
                    dpTable[i][j] = dpTable[i-1][j];
                }
            }
        }
        return dpTable[val.length][w];
    }
}
