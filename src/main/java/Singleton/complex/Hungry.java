package Singleton.complex;

public class Hungry {
    private byte[] bytes = new byte[1024];

    private Hungry(){}//防止new对象

    private  final  static Hungry HUNGRY = new Hungry();

    public static Hungry getInstance(){
        return HUNGRY;
    }

}
