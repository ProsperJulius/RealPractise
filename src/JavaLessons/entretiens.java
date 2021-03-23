package JavaLessons;

public class entretiens {
    public static void sa(int[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length ; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.print("}\n");

    }

    public static void main(String[] args) {
        int i = 60;
        int j = i%30;
        System.out.println(j);
        System.out.println(j/30);



    }}
