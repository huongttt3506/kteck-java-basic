package d9;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class D92Stream {
    public static void main(String[] args) {
        //Stream 이란 데이터의 흐름
        //그리고 그네이터에 적응할 메서드
        //전달할 수 있게 해주는 객체
        Stream<String> stream;

        //배열을 stream 으로 변환하기
        String[] nameArray = {"eric", "alex", "dave", "char", "brad"};
        //Array.stream()
        Stream<String> strStream = Arrays.stream(nameArray);
        strStream.forEach(System.out::println); //Print each element in nameArray

        //  원시타입은 <T>로 못쓰니까
        //  별도의 Stream 클래스가 존재
        int[] numbers = {1, 23, 14, 53, 22, 15, 10, 6};
        IntStream intStream = Arrays.stream(numbers);
        intStream.forEach(System.out::println);

        //LongStream, DoubleStream 존재
        // 아쉽게도 BooleanStream은 없다....
        Boolean[] bools = {true, false, true};
        Stream<Boolean> boolStream = Arrays.stream(bools);

        // CharStream도 없다...
        // 대신 문자열의 chars() 메서드가 char -> int로 바꿔서 Stream으로 만들어준다.
        // chuyển chars --> imteger, sử dụng IntStream
        IntStream charStream = "edujeeho@gamil.com".chars();
//        charStream.forEach(System.out::println);

        //Collection.stream() ㅇ,로 Stream 을 만든다
        List<String> nameList = new ArrayList<>();
        nameList.add("Alex");
        nameList.add("Dave");
        nameList.add("Chad");
        nameList.add("Brad");
        Stream<String> listStream = nameList.stream();

        Set<String> nameSet = new HashSet<>(nameList);
        Stream<String> setStream = nameSet.stream();











    }
}
