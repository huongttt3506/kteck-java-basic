package d6.d62;

public class D62Abstract {
    public static void main(String[] args) {
        Person somebody = new Person();
        somebody.setName("Alex");
        somebody.setAge(25);
        // Hello, I'm Alex!!!
        somebody.sayHello();

        Person someStudent = new Student();
        someStudent.setName("Brad");
        someStudent.setAge(20);
        if (someStudent instanceof Student) {
            ((Student) someStudent).setMajor("CSE");
        }
        // Hello, I'm Brad and I'm studying null
        // Person에 할당해도,
        // Student의 sayHello가 실행된다.
        someStudent.sayHello();

        Car sonata = new Car();
        sonata.setFuel(100);
        sonata.drive(20);
        System.out.println(sonata.getFuel());

        Truck porter = new Truck();
        porter.setFuel(100);
        porter.drive(20);
        System.out.println(porter.getFuel());
    }

    public void makeSayHello(Person person) {
        person.sayHello();
    }
}
