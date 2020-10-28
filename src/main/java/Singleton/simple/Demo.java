package Singleton.simple;

public class Demo {
    public static void main(String[] args){
        //SingleObject singleObject = new SingleObject();
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.show();
    }
}
