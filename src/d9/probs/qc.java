package d9.probs;

import java.util.Arrays;
import java.util.stream.Stream;

/*
Java의 String은 각 문자를 int로 취급한 Stream을 반환하는 chars() 메서드가 있다.

이 메서드를 활용하여, 인자로 전달된 문자열의 각 글자마다

글자가 숫자(0 ~ 9)면 해당 숫자,
글자가 문자(A ~ Z, a ~ z)면 1
그 외에는 -1

이라고 생각하고, 모든 문자의 값을 곱한 결과를 반환하는 메서드를, Stream API를 활용해 작성하시오.

예시:

jeeho@1234
-> 1, 1, 1, 1, 1, -1, 1, 2, 3, 4
-> -24

 */
public class qc {
    public static void main(String[] args) {
        String input = "jeeho@1234";
        int result = multiplyCharacterValues(input);
        System.out.println("Result: " + result);
        System.out.println(computeValue(input));

    }

    public static int multiplyCharacterValues(String input) {
        return input.chars() //convert String input to IntStream
                .mapToObj(c -> (char) c) // convert from unicode to char
                .mapToInt(ch -> {
                    if (Character.isDigit(ch)) {
                        return Character.getNumericValue(ch);
                    } else if (Character.isLetter(ch)) {
                        return 1;
                    } else {
                        return -1;
                    }
                })
                .reduce(1, (a, b) -> a * b);
    }
    public static int computeValue(String line) {
        return line.chars()
                .map(i -> {
                    if (Character.isDigit((char) i)) return i - '0';
                    if (Character.isLetter((char) i)) return 1;
                    return -1;
                })
                .reduce(1, (total, now) -> total * now);
    }
}





