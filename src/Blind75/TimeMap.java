package Blind75;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {

    final Map<String, List<Pair<String, Integer>>> lookUp;

    public TimeMap() {
        lookUp = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {

        lookUp.get(key).add(new Pair<>(value, timestamp));
    }

    public String get(String key, int timestamp) {
        List<Pair<String, Integer>> timestampAndValue = lookUp.get(key);
        if (timestampAndValue == null) return "";
        int left = 0;
        String result = "";
        int right = timestampAndValue.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            Pair<String, Integer> keyAndValue = timestampAndValue.get(mid);
            if (keyAndValue.secondElement == timestamp) {
                 return keyAndValue.firstElement;
            }else if(keyAndValue.secondElement < timestamp){
                result = timestampAndValue.get(left).firstElement;
                left =  mid +1;
            }else{
                right = mid -1;
            }
        }
        return result;

    }

    public class Pair<F, S> {
        final F firstElement;
        final S secondElement;

        public Pair(F firstElement, S secondElement) {
            this.firstElement = firstElement;
            this.secondElement = secondElement;

        }

        public F getFirstElement() {
            return firstElement;
        }

        public S getSecondElement() {
            return secondElement;
        }
    }
}
