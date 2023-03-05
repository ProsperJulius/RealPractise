package OnlineProblemsAndLeetcode;

public class ExceptionProblems {
    public static void main(String[] args) {
        try{
            throw new MyDerivedClass();
        }
        catch (MyBaseClass b){
            System.out.println("Caught my base excepiton");
        }
    }
}
class MyBaseClass extends Exception{}
class  MyDerivedClass extends MyBaseClass{}
