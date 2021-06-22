import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private int birthDate;
    private String location;
    private ArrayList<Korting> users;

    public User(String name, int age, int birthDate, String location) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.location = location;
        this.users = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", location='" + location + '\'' +
                '}';
    }

    public void showUser(User user) {
        System.out.println(user.name + user.age + user.birthDate + user.location);
    }

    public void addUser(Korting klant) {
        users.add(klant);
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

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
