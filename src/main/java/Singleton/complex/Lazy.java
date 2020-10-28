package Singleton.complex;

public class Lazy {

    private volatile static Lazy lazy;

    private static boolean flag = false;

    public String string;
    private Lazy() {
        synchronized (Lazy.class) {
            if (!flag) {
                throw new RuntimeException("不要用反射");
            }
        }
        string = "字段";
    }

    public static Lazy getInstance() {
        if (lazy == null) {
            synchronized (Lazy.class) {
                if (lazy == null) {
                    flag = true;
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }
}
