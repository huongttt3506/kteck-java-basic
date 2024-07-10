package d10.q2;

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
public class Menu {
    private String name;
    private int price;

    public Menu() {
    }

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
        return "Menu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}