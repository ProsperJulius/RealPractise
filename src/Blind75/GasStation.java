package Blind75;

import java.util.Arrays;
import java.util.function.Function;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        Function<int[], Integer> sum = numbers -> Arrays.stream(numbers).sum();

        if (sum.apply(gas) < sum.apply(cost)) {
            return -1;
        }

        int start = 0;
        int total = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            if (total < 0) {
                total = 0;
                start = i + 1;
            }
        }

        return start;


    }
}
