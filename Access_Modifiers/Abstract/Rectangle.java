package Java_Course.Access_Modifiers.Abstract;

public class Rectangle extends GraphicObject{

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");        
    }

    @Override
    void resize() {
        System.out.println("Resizing a Rectangle");
    } 
}
