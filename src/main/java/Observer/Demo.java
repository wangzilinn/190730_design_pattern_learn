package Observer;

public class Demo {
    public static void main(String[] args){
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("state = 15");
        subject.setState(15);

        System.out.println("state = 100");
        subject.setState(100);
    }
}
