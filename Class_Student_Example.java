package Java_Course.Classes;

public class Class_Student_Example {
    String name;
    int age;
    String address;

    // Generate Constructor
    public Class_Student_Example(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // OR

    // public Class_Students_Example(String n, int a, String add) {
    // name = n;
    // age = a;
    // address = add;
    // }

    // Generate Getters and Setters
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

    // Implement override
    @Override
    public String toString() {
        return ("Student name is: " + this.getName() + ", Age is: " + this.getAge() + "& Address is: "
                + this.getAddress());
    }

    public static void main(String[] args) {
        Class_Student_Example param = new Class_Student_Example("Paramesh", 24, "24 house, Dharmavaram - 515671");
        System.out.println(param.toString());
        // OR
        System.out.println(param.getName());
        System.out.println(param.getAge());
        System.out.println(param.getAddress());
    }
}