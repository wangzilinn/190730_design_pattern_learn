package Decorator;

public class Demo {
    public static void main(String[] args){
        Shape circle = new Circle();
        RedShapeDecorate redCircle  = new RedShapeDecorate(new Circle());
        RedShapeDecorate redRectangle = new RedShapeDecorate(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}
