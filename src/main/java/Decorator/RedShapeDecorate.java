package Decorator;

public class RedShapeDecorate implements Shape {
    private Shape decoratedShape;
    public RedShapeDecorate(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder();
    }
    private void setRedBorder(){
        System.out.println("border:red");
    }
}
