package d8.probs;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
어떤 가게의 메뉴 <메뉴명> <가격>형태로 계속 입력된다.
"order"가 입력되었을 때,
사용자의 단일 주문을 받고 금액을 출력하시오.
 */
public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> menu = new HashMap<>();
        System.out.println("input menu with format: 'name:price'. Enter 'order' to exit:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("order")) {
                break;
            }
            String[] parts = input.split(":");
            if (parts.length == 2) {
                try {
                    String name = parts[0];
                    int price = Integer.parseInt(parts[1]);
                    menu.put(name, price);

                } catch (NumberFormatException e) {
                    System.out.println("Price must be an integer, please input again!");
                }
            } else {
                System.out.println("Uncorrected format. Please input again! ");
            }
        }
        //Receive orders from users
        System.out.println("Enter dish name and quantity with format: 'name:quantity'");
        int totalAmount = 0;
//        Map<String, Integer> order = new HashMap<>();
        while (true) {
            String orderinput = scanner.nextLine();
            if (orderinput.equalsIgnoreCase("order")) {
                break;
            }
            String[] orderparts = orderinput.split(":");
            if (orderparts.length == 2) {
                String orderitem = orderparts[0];
                if (menu.containsKey(orderitem)) {
                    try {
                        int quantity = Integer.parseInt(orderparts[1]);
                        int amount = quantity * menu.get(orderitem);
                        totalAmount += amount;
                        System.out.println(String.format("dish name: %s, price %d, quantity: %d, amount: %d", orderitem, menu.get(orderparts[0]),quantity, amount));
                    } catch (NumberFormatException e) {
                        System.out.println("quantity must be an integer");
                    }
                } else {
                    System.out.println("The dish is not on the menu");
                }
            } else {
                System.out.println("Uncorrected format. Please input again! ");
            }
        }
        String filename = String.format("Total amount is %d", totalAmount );
        System.out.println("Content: " + filename);
        scanner.close();
    }
}
  


