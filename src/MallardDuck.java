public class MallardDuck extends Duck {
    /**
     *
     */
    public MallardDuck(){
        quackBehaviour = new quack();
    }
    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");

    }
}
