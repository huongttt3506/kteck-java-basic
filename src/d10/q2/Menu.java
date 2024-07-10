package d10.q2;

import d10.q1.Music;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private int price;

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "name: " + name + "\n" +
                "price: " + price + "\n";
    }

    public static void menuWriter(List<Menu> menu, String filename) {
        try(FileWriter fileWriter = new FileWriter(filename);
            BufferedWriter writer = new BufferedWriter(fileWriter)) {
            for (Menu dish : menu) {
                writer.write(dish.name + "," + dish.price);
                writer.newLine();
            }
        }
        catch (IOException e) {
            System.out.println("데이터 작성을 위한 파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        }
    }
    public static List<Menu> menuReader(String filename) {
        List<Menu> menu = new ArrayList<>();
        try (FileReader fileReader = new FileReader(filename);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] elements = line.split(",");
                String name = elements[0];
                int price = Integer.parseInt(elements[1]);
                menu.add(new Menu(name, price));
            }
        }
        catch (IOException e) {
            System.out.println("파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        }
        return menu;
    }

}
