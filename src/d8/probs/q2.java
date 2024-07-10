package d8.probs;
/*
엔터로 구분된 정수 입력이 임의의 횟수만큼 이뤄진다. (잘못된 입력은 주어지지 않는다.)
q가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
입력된 정수중 3의 배수만 골라 총합을 구하여라.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            int number = Integer.parseInt(input);
            inputList.add(number);
        }
        System.out.println(inputList);
        int sum = 0;
        for (Integer number : inputList) {
            if (number % 3 == 0) {
                System.out.println(number);
                sum += number;
            }
        }
        System.out.println("sum all of number that multiple of 3 " + sum);

    }
}
