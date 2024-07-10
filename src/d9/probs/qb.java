package d9.probs;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
공백 문자로 구분된 정수들이 담긴 문자열이 있다. 아래는 그 예시이다.

"1 2 3 4 5"
IntStream stream = str.codepoint();
stream.forEach( c -> {filter c >'0' & c< '1'}



이러한 문자열을 인자로 받아, 해당하는 정수들로 이뤄진 배열을 반환하는 메서드를, Stream API를 활용해 작성하시오.
 */
public class qb {
    public static void main(String[] args) {
        String input = "Hello123World456";
        int[] numbers = arrayOfNumbers(input);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(arrayOfNumbers("1 2 3 4 5")));
        System.out.println(Arrays.toString(parseToIntArr("1 2 3 4 5")));

    }

    public static int[] arrayOfNumbers(String input) {
//        IntStream streamNum = input.codePoints();
//        IntStream streamNum2 = Arrays.stream(Arrays.stream(streamNum.toArray())
//                .filter(c -> c >= '0' && c <= '9')
//                .map(c -> c - '0')
//                .toArray());
//        return streamNum2.toArray();
        return input.codePoints()
                .filter(c -> c >= '0' & c <= '9')
                .map(c -> c - '0')
                .toArray();
    }

    public static int[] parseToIntArr(String numString) {
        return Arrays.stream(numString.split(" "))
                .mapToInt(Integer::parseInt)
                //.mapToInt(str -> Integer.parseInt(str)
                .toArray();
    }
}
