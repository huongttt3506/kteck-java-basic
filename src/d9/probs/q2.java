package d9.probs;

import java.util.Scanner;

/*
Java의 String은 각 문자를 int로 취급한 Stream을 반환하는 chars() 메서드가 있다.

이 메서드를 활용하여, 인자로 전달된 문자열의 각 문자가 전부 숫자인지 판단하는 메서드를, Stream API를 활용해 작성하시오.
 */
public class q2 {
    public static boolean areAllChracturesDigits(String input) {
//        return input.chars()
//                //각 문자에서 '0'에 해당하는 ASCII 코드를 뺀다
//                .map(c -> c - '0')
//                // 그렇다면 남은 데이터가 0 <= data <= 9이면 숫자 문자였다
//                .allMatch(data ->data >= 0&& data <= 9);
        return input.chars().allMatch(c -> c -'0' >= 0 && c - '0' <=9);

//        return input.chars() //convert string to integer (Unicode)
//                .allMatch(Character::isDigit); //true -> all is digit
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        boolean result = areAllChracturesDigits(input); // test all char in String is digit?
        if (result) {
            System.out.println("All characters are digits.");
        }
        else {
            System.out.println("Not all characters are digits.");

        }
    }
}
