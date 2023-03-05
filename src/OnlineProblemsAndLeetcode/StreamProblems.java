package OnlineProblemsAndLeetcode;

import java.util.List;
import java.util.stream.IntStream;
import static java.lang.Math.max;
public class StreamProblems {

    public static void main(String[] args) {
        List<Integer> integerList= List.of(1,2,3,4,5);
      Integer total=  integerList.stream().reduce(0,(subtotal,nextElement)->subtotal+nextElement).intValue();
      boolean result=integerList.stream()
              .anyMatch(element->element>4);
        IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        stream.allMatch(i -> {
            System.out.print(i);
            return i % 3 == 0;
        });

        IntStream streams = IntStream.of(1, 2, 3, 4, 5, 6, 7);

        streams.filter(i -> {
            return i > 3;
        }).anyMatch(i -> {
            System.out.print(i);
            return i % 2 == 1;
        });

        Integer maxInteger=streams.reduce((a,b)->
                a>=b?a:b
                ).getAsInt();

        System.out.println(maxInteger);


    }
}
