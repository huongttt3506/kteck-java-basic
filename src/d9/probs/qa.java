package d9.probs;


import java.util.Arrays;

import java.util.stream.IntStream;

/*
정수 배열을 인자로 받아, 음수가 아닌 숫자 중 짝수인 숫자들의 평균을 구하는 메서드를, Stream API를 활용해 작성하시오.
sum of number: positive, %2 == 0
 */
public class qa {
    public static void main(String[] args) {
       System.out.println(sumOfPositiveEvenNum(new int[] {-1, -2, 0, 1, 2, 3, 4, 5}));


    }

    public static int sumOfPositiveEvenNum(int[] numbers) {
//        IntStream numstream = Arrays.stream(numbers);
//        IntStream numstream2 = numstream.filter(i -> (i >= 0) && (i%2 == 0));
//        return numstream2.sum();
        return Arrays.stream(numbers)
                .filter(i -> (i>=0) && (i%2 ==0))
                .sum();
    }
    public static double posEvenAvg(int[] num) {
        return Arrays.stream(num)
                .filter((i -> !(i<0) && i%2 == 0))
                // 정수 Stream 이니가 average 호출
                .average()
                //Optional 이기 때문에 orElse 까지
                .orElse(0.0);
    }
}
