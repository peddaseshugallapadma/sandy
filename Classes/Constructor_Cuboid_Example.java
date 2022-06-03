package Java_Course.Classes;

public class Constructor_Cuboid_Example {
    // Default Constructor
    int width;
    int height;
    int depth;

    // Constructor 1
    public Constructor_Cuboid_Example(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Constructor 2
    Constructor_Cuboid_Example(int width, int heigt) {
        this.width = width;
        this.height = heigt;
        this.depth = 10;
    }

    // Constructor 3
    Constructor_Cuboid_Example(int dimension) {
        this.width = dimension;
        this.height = dimension;
        this.depth = dimension;
    }

    // Constructor 4
    Constructor_Cuboid_Example() {
        this.width = 2;
        this.height = 2;
        this.depth = 2;
    }

    int volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        int volume;

        // Constructor 1
        Constructor_Cuboid_Example stdConstructor_Cuboid_Example = new Constructor_Cuboid_Example(10, 20, 15);
        volume = stdConstructor_Cuboid_Example.volume();
        System.out.println("Volume of a simple Cuboid is: " + volume); // Volume of a simple Cuboid is: 3000

        // Constructor 2
        Constructor_Cuboid_Example Constructor_Cuboid_ExampleWithDefault = new Constructor_Cuboid_Example(10, 20);
        volume = Constructor_Cuboid_ExampleWithDefault.volume();
        System.out.println("Volume of Cuboid with default depth is: " + volume); // Volume of Cuboid with default depth is: 2000
                                                                                 
        // Constructor 3
        Constructor_Cuboid_Example cube = new Constructor_Cuboid_Example(10);
        volume = cube.volume();
        System.out.println("Volume of Cube is: " + volume); // Volume of Cube is: 1000

        // Default Constructor OR Constructor 4
        Constructor_Cuboid_Example defaultCuboid = new Constructor_Cuboid_Example();
        volume = defaultCuboid.volume();
        System.out.println("Volume of default Cuboid is: " + volume);
        // Volume of default Cuboid is: 0 (constructor 4 is commment -> line Number 30)
        // Volume of default Cuboid is: 8
    }
}