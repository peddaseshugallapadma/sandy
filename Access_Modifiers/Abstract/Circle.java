package Java_Course.Access_Modifiers.Abstract;

public class Circle extends GraphicObject {

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    void resize() {
        System.out.println("Resizing a circle");
    }   
}