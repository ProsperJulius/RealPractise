package OnlineProblemsAndLeetcode;

public class ReverseInteger {
    public static int reverseInteger(int number) {
        int quotient = 0;
        int remainder = 0;
        int result = 0;

        while (number != 0) {


            number = number / 10;
        }

        return result;
    }

    public static int reverse(int x) {
        long res=0;
        while (x!=0){
            res=res*10 +x%10;
            x/=10;
        }
        if(res> Integer.MAX_VALUE || Integer.MIN_VALUE>res) return 0;
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-112));
    }
}
