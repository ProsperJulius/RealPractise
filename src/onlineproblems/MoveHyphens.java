package onlineproblems;

public class MoveHyphens {
    public static String moveHyphen(String inputString) {
        char[] charArray = inputString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder secondStringBuilder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '-') {
                secondStringBuilder.append("-");
            } else {
                stringBuilder.append(charArray[i]);

            }
        }

        return secondStringBuilder.append(stringBuilder).toString();
    }

    public static void main(String[] args) {
        System.out.println(moveHyphen("prosper-julius-mavunga"));
    }
}
