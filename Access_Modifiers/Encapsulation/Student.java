package Java_Course.Access_Modifiers.Encapsulation;

// En Capsul ation

public class Student {
    private String name;
    private int age;
    private String address;

    // Constructor
    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getters And Setters
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return ("Student name is: " + this.getName() + ", Age is: " + this.getAge() + ", & Address is: "
                + this.getAddress());
    }

    public static void main(String[] args) {
        Student param = new Student("Paramesh", 23, "Dharmavaram");

        System.out.println(param);

        System.out.println(param.getName());
        System.out.println(param.getAge());
        System.out.println(param.getAddress());
    }
}