package Java_Course.Access_Modifiers.Abstract;

public class Abstraction_Demo {
    public static void main(String[] args) {
        GraphicObject circle = new Circle();
        circle.draw();
        circle.resize();
        
        System.out.println("------------------------------");

        GraphicObject rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
    }
}
