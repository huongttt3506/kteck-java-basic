package d8.probs;

import java.util.*;


/*
엔터로 구분된 누군가의 이름 입력이 임의의 횟수만큼 이뤄진다.
q가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
여태까지 입력된 이름을 중복없이 알파벳 순서데로 출력하시오.

힌트: Collections.sort를 이용하면 리스트를 정렬할 수 있다.

예시 입출력
 */
public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> nameSetList = new HashSet<>();
        while (true) {
            String name = scanner.next();
            nameSetList.add(name);
            if (name.equalsIgnoreCase("q")) {
                break;
            }
        }
       nameSetList.stream().sorted().forEach(System.out:: println);

        List<String> sortedNames = new ArrayList<>(nameSetList);
        Collections.sort(sortedNames);

        System.out.println("Sorted names without duplicates:");
        for (String name: sortedNames) {
            System.out.println(name);
        }
        scanner.close();

    }
}
