package OnlineProblems;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class ClosestToZero {
    public static int closestToZero(int[] ints) {
        if (ints == null) return 0;

        Arrays.sort(ints);
        int length = ints.length;
        int closestIndex = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            int absoluteValue = Math.abs(ints[0]);
            if (absoluteValue < diff) {
                diff = absoluteValue;
                closestIndex = i;
            } else if ((absoluteValue == diff && ints[i] > 0 && ints[closestIndex] < 0)) {
                diff = ints[i];
                closestIndex = i;
            }
        }
        return ints[closestIndex];


    }

    public static int closestToZeroStreamVersion(int[] ints) {
        if (ints == null) return 0;
        if (ints.length == 0) return 0;
        Arrays.sort(ints);
        return Arrays.stream(ints).reduce((a, b) ->
                abs(a) < abs(b) ? a :
                        (abs(a) == abs(b) ? max(a, b) : b)).getAsInt();


    }
    public static boolean isFake(String name) {

        if (name.length() < 5) return false;
        char[] chars = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        List<Character> characterList = new ArrayList<>();
        characterList.add('1');
        characterList.add('2');
        characterList.add('3');
        characterList.add('4');
        characterList.add('5');
        characterList.add('6');
        characterList.add('7');
        characterList.add('8');
        characterList.add('9');
        characterList.add('0');


        for (int i = name.length() - 1; i < name.length() - 6; i--) {
            if (characterList.contains(name.charAt(i))) {

            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isSuspicious(String string) throws ParseException {
        DateFormat TWENTY_FOUR_TF = new SimpleDateFormat("HH:mm");
        System.out.println(TWENTY_FOUR_TF.parse(string));

        return true;
    }


    public static void main(String[] args) throws ParseException{
        boolean jusa=isSuspicious("22:00");
    }
}
