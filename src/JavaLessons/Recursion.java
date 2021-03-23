package JavaLessons;

public class Recursion {
    public static int factorial(int fact){
        if (fact == 1 || fact ==0){
            return 1;
        }else {
            return fact *factorial(fact - 1);
        }
    }
    public static int factorialNonRecursion(int inputNumber){
        int result =1;
        for(int i=1;i<=inputNumber;i++){
            result *=i;
        }
        return result;
    }
    public static void main(String[] arg){
        System.out.println(factorial(5));

    }


}
