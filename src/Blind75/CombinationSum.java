package Blind75;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        if (candidates == null || candidates.length == 0) return results;

        combinationSum(candidates, 0, target, new ArrayList<>(), results);

        return results;
    }

    public void combinationSum(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> results) {
        if (target == 0) {
            results.add(new ArrayList<>(current));
            return;
        }
        if(target < 0){
            return ;
        }
        for(int i = index; i < candidates.length;i++){
            current.add(candidates[i]);
            combinationSum(candidates,1+1,target- candidates[i], current,results);
            current.remove(current.size()-1);
        }
    }
}
