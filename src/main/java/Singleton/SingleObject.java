package Singleton;

public class SingleObject {
    //使用静态成员创建唯一的SingleObject对象
    private static SingleObject instance = new SingleObject();
    //让构造函数为private,这样该类就不会被实例化
    private SingleObject(){}
    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }
    public void show(){
        System.out.println("hello world");
    }
}
