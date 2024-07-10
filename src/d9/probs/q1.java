package d9.probs;


import javax.script.ScriptContext;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
정수 배열을 인자로 받아, 각 숫자를 제곱한 수들의 합을 구하는 메서드를, Stream API를 활용해 작성하시오.

 */
public class q1 {
    public static int sumOfSquare(int[] numbers) {
        //정수의 stream을 만들자
//        IntStream numStream = Arrays.stream(numbers);
//        //각 정수를 제곱한다
//        IntStream numstream2 = numStream.map(i -> i*i);
//        return numstream2.sum();
// cách 2: hiệu quả hơn do ko tạo biến trung gian
        return Arrays.stream(numbers)
                .map(i -> i * i)
                .sum();
    }
    
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] numbers = new int[n];
//        for (int i = 0; i < n; i++) {
//            numbers[i] = scanner.nextInt();
//        }
//        int result = sumOfSquare(numbers);
//        System.out.println("The sum of squares is: " + result);

        System.out.println(sumOfSquare(new int[] {1,2,3,4,5}));
        
        
    }
}
