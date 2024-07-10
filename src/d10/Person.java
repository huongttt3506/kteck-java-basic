package d10;

public class Person {
    private String name;
    private int age;
    private String email;
    private String gender;

    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String email, int age, String gender) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
