package Strategy;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy Strategy) {
        this.strategy = Strategy;
    }
    public Context(FightType fightType) {
        switch (fightType) {
            case BOW:
                this.strategy = new Bow();
                break;
            case GUN:
                this.strategy = new Gun();
                break;
            case KNIFE:
                this.strategy = new Knife();
                break;
        }
    }
    public void fighting() {
        this.strategy.fighting();
    }
}
