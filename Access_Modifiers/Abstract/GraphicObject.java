package Java_Course.Access_Modifiers.Abstract;

public abstract class GraphicObject {
    int x, y;

    GraphicObject() {
        System.out.println("Base absract class");
    }

    void moveTo(int newX, int newY) {
        System.out.println("move To x: " + x + "and y: " + y);
    }

    abstract void draw();
    abstract void resize();
}
