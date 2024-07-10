package d10.q2;

import d8.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
사용자에게 반복적으로 식당 메뉴 정보를 입력받자.
입력받는 정보는 다음과 같다.
메뉴 이름
가격
아래는 입력하는 과정의 예시이다.
name: Noodles
price: 5000
Saved!!!
Add more? [y/N]: y
 */
public class Main {
    public static void main(String[] args) {
        // Loop of  receiving Menu Information
        Scanner scanner = new Scanner(System.in);
        // Create a Menu List
        List<Menu> menu = new ArrayList<>();
        while (true) {
            // dish name
            System.out.print("name: ");
            String name = scanner.nextLine();
            // receive price information
            int price = scanner.nextInt();
            //Save dish information
            Menu dish = new Menu(name, price);
            //Save menu
            menu.add(dish);
            System.out.print("Saved!!!");
            // ask add more???
            System.out.print("add more? [y/n]");
            String hashNext = scanner.nextLine();
            // if answered: "n", quit
            if (hashNext.equals("n")) {break;}

        // file에 저장
        String filename = "menu.txt";
        Menu.menuWriter(menu, filename);

        List<Menu> myMenu = Menu.menuReader(filename);
        System.out.println(myMenu);


        scanner.close();
        }


    }
}
