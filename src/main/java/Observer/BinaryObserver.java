package Observer;
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);//观察者反过来让被观察者调用attach方法, 将观察者加入到其维护的列表中去
    }
    @Override
    public void update(){
        System.out.println("binary String" + Integer.toBinaryString(subject.getState()));
    }
}
