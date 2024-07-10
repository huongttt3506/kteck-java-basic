package d8.probs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
엔터로 구분된 입력이 임의의 횟수만큼 이뤄진다.
q가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
여태까지 입력했던 데이터를 순서데로 출력하시오

예시 입출력
1
lorem ipsum
3
markdown
q
출력1:
1
lorem ipsum
3
markdown

 */
public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //데이터 저장 준비
        List<String> inputList = new ArrayList<>();
        //무한반복
        while (true) {
            String input = scanner.nextLine();
            //input 이 q 인지를 비교한다
            if (input.equals("q")) {
                break;
            }
            // 입력 종료, 반복 중료
            inputList.add(input);
        }
        // 입력이 끝났으니 춯력을 진행한다.
        for (String input: inputList) {
            System.out.println(input);
        }
        System.out.println(inputList);

    }
}
