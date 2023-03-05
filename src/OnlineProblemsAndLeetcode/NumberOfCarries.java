package OnlineProblemsAndLeetcode;

public class NumberOfCarries {
    public static int numberOfCarries(int numOne,int numTwo){
        int numberOfCarries=0;
        int remainderOfNumOne=0;
        int remainderOfNumTwo=0;
        int curry =0;
        int sum=0;
        while(numOne!=0 && numTwo!=0){
            remainderOfNumOne=numOne%10;
            remainderOfNumTwo=numTwo%10;
            sum=curry+remainderOfNumOne+remainderOfNumTwo;
            if(sum>9){
                curry=1;
                numberOfCarries++;
            }else {
                curry=0;
            }
            numOne/=10;
            numTwo/=10;
        }
        return numberOfCarries;
    }

    public static void main(String[] args) {
        System.out.println(numberOfCarries(181,929));
    }
}
