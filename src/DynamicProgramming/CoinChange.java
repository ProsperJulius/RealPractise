package DynamicProgramming;

public class CoinChange {
    public static  int coinChange(int[] coins, int amount) {
        int [][] dpTable = new int[coins.length+1][amount+1];
        for(int row = 0; row<=coins.length;row++){
            dpTable[row][0] =1;
        }
        for(int row = 1;row<=coins.length;row++){
            for(int col= 1;col<= amount;col++){

                if(coins[row-1]> col){
                  dpTable[row][col] = dpTable[row-1][col];
                }else {
                    dpTable[row][col] = dpTable[row - 1][col] + dpTable[row][col - coins[row - 1]];
                }
            }
        }
        return dpTable[coins.length][amount];
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 3},25));
    }
}
