package Observer;
public abstract class Observer {
    protected Subject subject;//仅仅是一个引用
    public abstract void update();
}
