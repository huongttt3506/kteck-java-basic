package d8.probs;

import java.util.*;

/*
여러 사람의 전공이 전공 이름 형태로 입력된다.
"q"가 입력되었을 때,
각 전공별로 누가 있는지를 출력하시오.
단, 순서는 상관 없다.

예시 입출력

 */
public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> majormap = new HashMap<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {break;}
            String[] info = input.split(" ");

            majormap.put(info[0], Collections.singletonList(info[1]));




//        // <전공, 전공생 모음>형태이기 때문에,
//        // Value는 List나 Set이 적당하다.
//        Map<String, List<String>> majormap = new HashMap<>();
//        while (true) {
//            String input = scanner.nextLine();
//            // `q`가 입력시 반복(입력) 종료
//            if (input.equalsIgnoreCase("q")) {break;}
//            // 전공과 이름으로 나눈다.
//            String[] info= input.split(" ");
//            // 전공을 Key로 List를 요청한다.
//            List<String> majorList = majormap.get(info[0]);
//            // // 만약 null이라면 아직 이 전공을 가진 학생이 없었단 뜻.
//            if (majorList == null) {
//                //새 ArrayList를 만들고,
//                majorList = new ArrayList<>();
//                // List를 Map에 추가한다.
//            }



            }
        scanner.close();
        }

    }