import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<Object > s1 = new HashSet<Object>();
        Object o1 = new Object();
        //hashset are one impplentation for set interaface which extends collection and collection whch extends  iterable
        //while other classes are also impl the Set interface, but 99% we only use HashSet class
        s1.add("walter");
        s1.add("water");
        s1.add("water");
        s1.add("water");
        s1.add("walter");
        s1.add(new Object());
        s1.add(new Object());
        s1.add(new Object());
        s1.add(o1);
        s1.add(Animal.class);
        s1.add(s1.remove("veni"));
        System.out.println(s1);


        Animal a = new Dog(); // upcasting
        a.sound();
        a.s();
        Dog b = (Dog) a;
        b.sound();
        b.s();


        Dog c = new Dog();
        c.s();

        var q = s1.iterator();
        System.out.println( q.hasNext());
    }


}



class Animal {
    void sound() {
        System.out.println("Some sound");
    }
    void s(){
        System.out.println("s");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}


