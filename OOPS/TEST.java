
interface Animal{
    void canWalk();
    void canEat();
}
interface Mamal extends Animal{
    void canhavechild();
}
class Dog implements Animal,Mamal {
    public void canWalk(){
        System.out.println("Can Walk");
    }
    public void canEat() {
        System.out.println("Can eat");
    }
    public void  canhavechild(){
        System.out.println("Can have Kid");
    }
}
public class TEST {
    public static void main(String[] args) {
        Animal a=new Dog();
        Mamal m=new Dog();
        Dog d=new Dog();
        a.canEat();
        a.canWalk();
//        a.canhavechile();
        m.canEat();
        m.canWalk();
        m.canhavechild();
        d.canEat();
        d.canWalk();
        d.canhavechild();
    }
}
