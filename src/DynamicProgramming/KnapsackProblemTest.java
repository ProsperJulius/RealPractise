package DynamicProgramming;

public class KnapsackProblemTest {

    public static int maxValue(String[] items, int[] weight, int[] values) {
        int w = 4;
        int[][] dpTable = new int[items.length + 1][w + 1];

        for (int i = 0; i <= items.length; i++) {

            for (int j = 0; j <= w; j++) {

                if (i == 0 || j == 0) {
                    dpTable[i][j] = 0;
                } else if (weight[i-1] <= j) {

                    dpTable[i][j] = Math.max(dpTable[i - 1][j], values[i-1] + dpTable[i-1][j-weight[i-1]]);

                } else {
                    dpTable[i][j] = dpTable[i - 1][j];
                }
            }
        }
        return dpTable[values.length][w];
    }

    public static void main(String[] args) {
        String[] items = {"guitar", "stereo", "Laptop","iphone"};
        int[] values = {1500, 2000, 3000,2000};
        int[] weights = {1, 3, 4,1};
        System.out.println(maxValue(items, weights, values));
    }
}
