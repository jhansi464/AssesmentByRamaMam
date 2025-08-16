class shape{
    void draw(){
        System.out.println("It draws the structure");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("Draws circle");
    }
}
class square extends shape{
    void draw(){
        System.out.println("Draws square");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        shape s1 = new circle();
        shape s2 = new square();
        s1.draw();
        s2.draw();
    }
}
