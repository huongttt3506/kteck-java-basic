package d8.probs;
/*
엔터로 구분된 입력이 임의의 횟수만큼 이뤄진다.
q가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
여태까지 입력한 내용중 정수만을 선별하여,
<첫번째 정수> + <두번째 정수> + ... + <마지막 정수>  = <총합>
의 형태로 출력하시오.
힌트: Integer.parseInt 메서드는 정수로 표현 불가능한 문자열에 대해 NumberFormatException을 발생시킨다.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q3 {
    public static <StringBuider> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("q"))  // quit loop when input 'q'
            {
                break;
            }
            try {
                int number = Integer.parseInt(input); //convert characters to integer
                inputList.add(number); // add number to input list
            }
            catch (NumberFormatException _) {
                // "_" nothing to do here, just want to catch exception
            }
        }
        int sum = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputList.size(); i++) {
            int number = inputList.get(i);
            sum += number;
            result.append(number);
            if (i < inputList.size() - 1) {
                result.append(" + ");
            }
        }
        System.out.println(result + " = " + sum);

        int sum2 = 0;
        String output = "";

        for (int i = 0; i < inputList.size(); i++) {
            int inputValue = inputList.get(i);
            sum2 += inputValue;
//            output += inputValue;
            System.out.print(inputValue);
            if (i != inputList.size() - 1) {
//                output += " + ";
                System.out.print(" + ");
            }
            else {
//                output += " = ";
                System.out.print(" = ");
            }
        }
//        output += sum2;
        System.out.println(sum2);



    }
}
