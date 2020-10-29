package Strategy;

public class Demo {
    public static void main(String[] args) {
        // 使用不同的策略
        Context context = new Context(new Bow());
        context.fighting();
        // 只使用策略的名字：
        Context context1 = new Context(FightType.BOW);
        context1.fighting();
    }
}
