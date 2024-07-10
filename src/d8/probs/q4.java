package d8.probs;
/*
엔터로 구분된 입력이 임의의 횟수만큼 이뤄진다.
q가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
여태까지 입력한 정수가 몇가지가 되는지와 그 총합을 출력하시오.

힌트: Integer.parseInt 메서드는 정수로 표현 불가능한 문자열에 대해 NumberFormatException을 발생시킨다.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> inputSetList = new HashSet<>();
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                inputSetList.add(number);

            }
            catch (NumberFormatException _) { }
        }

        // access elements of a set using for loop
        long sum = 0L;
        for (int i : inputSetList) {
            sum += i;
        }
//        int sum2 = 0;
//        Iterator<Integer> intIterList = inputSetList.iterator();
//        while (intIterList.hasNext()) {
//            sum2 += intIterList.next();
//        }

        // access elements of a set using for forEach function
        inputSetList.forEach(element -> System.out.printf("%d\n", element));
        System.out.println(inputSetList);
//        System.out.println(sum2);

        System.out.printf("Length = %d\n", inputSetList.size());
        System.out.printf("Sum = %d\n", sum);
        scanner.close();
        }
    }
