package Singleton.complex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class MainClass {
    //反射
    public static void main(String[] args){
        try {
            Lazy lazy2 = Lazy.getInstance();

            Constructor<Lazy> declaredConstructor = Lazy.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);

            Field flag = Lazy.class.getDeclaredField("flag");
            flag.setAccessible(true);
            flag.setBoolean(lazy2, true);

            Lazy lazy1 = declaredConstructor.newInstance();

            System.out.println(lazy1 == lazy2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
