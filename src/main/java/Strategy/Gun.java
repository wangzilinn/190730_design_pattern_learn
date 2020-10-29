package Strategy;

public class Gun implements IStrategy {
    @Override
    public void fighting() {
        System.out.println("射击");
    }
}
