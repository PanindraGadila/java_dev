//***parent classs */

import java.util.logging.FileHandler;

public class oops {
    int x;
    int y;
    String xyz;
    public static void main(String[] args) {
        System.out.println(oops.func1());   
        oops o = new oops();
        o.rtrn(o.func2(22));
        System.out.println((new oops()).func1(12)); 

        new1 o1 = new new1(12,11,"panindra", 0);


        //code for encapsulation class
        Person p = new Person("pani");
        
        o.rtrn(p.getName());
        System.out.println(p.getName1());
        Person p1 = new Person();
        System.out.println(p1.getName1());
        o.rtrn(p.getName1());
        System.out.println(p1.getName());
        
        
    }
// class member loaded in stack by class loader and can acesses atanytime by just calling class name. can also be called by using objec name but cannot change values of any non static
    public static int func1(){
        return 100;
    }

//instacne memebr laoded in head obnly wen encountered in code execution not when class loader is ninittialized
    public int func1(int a ){
        return 100+a;
    }


// similaerly for the new non public functions too works similarly for private modifiers too research more
    static int func2(){
        return 100;
    }
    int func2(int a ){
        return 100+a;
    }

// simple non static function make stdout prints easy... pure example for using oops concept
    void rtrn(Object a){
        System.out.println(a.toString());
    }




// -------cosntructor--------------------------------------------------
// construtor main purpose is to instatiate any non static global varible, this is due to
oops(){ // Constructor with no modifier (default/package-private)
 System.out.println("u are in constructer1");
}

//constructoer overloading
oops(int x, int y){
    this(); //constructer chaining in same class using call to this()
    this.x = x;
    this.y = y;
    System.out.println("u are in constructer2");
}

oops(int x, int y, String a){
    this(x,y); //constructer chaining
    this.xyz = a;
    System.out.println("u are in constructer3");
}

}

//***** child class for aobve parent oops */
class new1 extends oops{
 int n1;
 new1(int x, int y, String a, int z){
    super(x, y, a); //coonstruter chaining using call to super()
    this.n1= z;
    System.out.println("u are in constructer4 call to super()");
 }
}




//*******final key word usage in constructure creation
class test {
    final int instanceFinalVar; // Instance final, not initialized at declaration
    static final int statfinalvar;
    static{
        statfinalvar = 23; // here we can use some run time value generator function also.
    }
    int test =100;
    public static int na; // if this is not initialized alter in ccode at global level this will addigned deafult valu eby jvm
    public int na2; //if thi is not initialized by constructer this will by assigned to default only at object creation. but not at class loader step as like in statis variables above example
        public test(int initialValue) {
            this.instanceFinalVar = initialValue;
            this.test = initialValue; // Initialized in the constructor
        }

        public static void main(String[] args) {
            test n1  = new test(12);
           int a = n1.instanceFinalVar;
           n1.test = a;
            
        }
    
}






// **** encapsulation(setters and getter to access the attributes)
class Person {
    private String name; // Private member cannot be access in anothe lcoation whether theya re static  or non staic so we use setters and getters
    private static String name1;
    // Constructor to set the value of the private member
    Person(String name) {
        this.name = name;
    }

    Person() {
        name1 = "STAIC PANINDRA";
    }
    // Getter
    public String getName() {
        return name;
    }
    public String getName1() {
        return name1;
    }
    // Setter
    public void setName(String name) {
    this.name = name;
  }


}

//================******example for encapsulation******===============================

class BankAccount {
    private double balance; // Encapsulated data (private access)

    // Public constructor to initialize the account
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + this.balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + this.balance);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Public method to get the current balance (read-only access)
    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(100.0); // Creating a BankAccount object

        myAccount.deposit(50.0);    // Using public methods to interact
        myAccount.withdraw(20.0);   // with the account
        System.out.println("Current balance: $" + myAccount.getBalance());

        // myAccount.balance = -500; // This line would cause a compile error if you tried to uncomment it
                                     // because 'balance' is private and cannot be directly accessed from outside.
    }
}


//==============**Inheritence**=========================

class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
      System.out.println("Tuut, tuut!");
    }
  }
// actul usage of extends
class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {
  
      // Create a myCar object
      Car myCar = new Car();
  
      // Call the honk() method (from the Vehicle class) on the myCar object
      myCar.honk();
  
      // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
      System.out.println(myCar.brand + " " + myCar.modelName);
    }
  }


//how to stop a class from being inherited by anothe class
final class Final_Vehicle {
    Final_Vehicle(){
        System.out.println("do nothing");
    }
  }
  
// class Car1 extends Final_Vehicle {}----error final class cannot be inherited



//=====================**polymorphism**=================

// Base class: Animal
class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound"); // Default sound
    }
}

// Subclass: Dog
class Dog extends Animal {
    @Override // Indicates we are overriding the makeSound method from the superclass
    public void makeSound() {
        System.out.println("Woof!"); // Dog-specific sound
    }
}

// Subclass: Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!"); // Cat-specific sound
    }
}

// Subclass: Bird
class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Tweet!"); // Bird-specific sound
    }
}

class PolymorphismExample {
    
    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();   // An Animal array can hold a Dog object
        animals[1] = new Cat();   // An Animal array can hold a Cat object
        animals[2] = new Bird();  // An Animal array can hold a Bird object

        // Polymorphic behavior in action:
        System.out.println("Animal sounds:");
        for (Animal animal : animals) {
            animal.makeSound(); // Call makeSound() on each Animal object
            // Even though 'animal' is declared as 'Animal',
            // the *actual* object type at runtime determines which makeSound() is executed.
        }

        // Example of a method that uses polymorphism
        makeAnimalSound(new Dog());  // Pass a Dog object
        makeAnimalSound(new Cat());  // Pass a Cat object
        makeAnimalSound(new Animal()); // Pass a generic Animal object
    }

    // A method that takes an Animal object (or any of its subclasses)
    public static void makeAnimalSound(Animal animal) {
        System.out.print("The animal says: ");
        animal.makeSound(); // Polymorphic call to makeSound()
    }
}


//============**abstration in oops**============================
// Abstract class
abstract class Animal_abs {
    // Abstract method (does not have a body)
    public abstract void animalSound(); // needs to be overridden b y subclass
    // Regular method
    public void sleep() {
      System.out.println("Zzz");
    }
  }
  
  // Subclass (inherit from Animal)
  class Pig extends Animal_abs {
    @Override
    public void animalSound() {
      // The body of animalSound() is provided here
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Main_abstration {
    public static void main(String[] args) {
      Pig myPig = new Pig(); // Create a Pig object
      Animal_abs mypig2 = new Pig(); //can bind to referance type of animal
      myPig.animalSound();
      myPig.sleep();
      mypig2.animalSound();
      mypig2.sleep();
    }
  }

//**** anothe example-2 for abstraction */
abstract class Shape { // Abstract class
    String color;

    // Constructor (can be concrete)
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method (no implementation) - subclasses MUST implement this
    abstract double getArea();

    // Concrete method (has implementation) - subclasses can inherit or override
    public String getColor() {
        return color;
    }
}

class Circle extends Shape { // Concrete subclass of Shape
    double radius;

    public Circle(String color, double radius) {
        super(color); // Call to superclass constructor
        this.radius = radius;
    }

    @Override
    double getArea() { // Implementation of abstract method for Circle
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape { // Concrete subclass of Shape
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() { // Implementation of abstract method for Rectangle
        return length * width;
    }
}

class AbstractClassExample {
    public static void main(String[] args) {
        // Shape shape = new Shape("Red"); // Error! Cannot instantiate abstract class
        Circle circle = new Circle("Blue", 5.0); // OK - Instantiate concrete subclass
        Rectangle rectangle = new Rectangle("Green", 4.0, 6.0); // OK - Instantiate concrete subclass

        System.out.println("Circle Area: " + circle.getArea());    // Calls Circle's getArea()
        System.out.println("Rectangle Area: " + rectangle.getArea()); // Calls Rectangle's getArea()
        System.out.println("Circle Color: " + circle.getColor());    // Inherited from Shape
    }
}

//**** anothe example-3 for abstraction */
interface Drawable { // Interface
    void draw(); // Abstract method - no implementation
}

class Circle1 implements Drawable { // Circle class implements Drawable interface
    @Override
    public void draw() { // Implementation of draw() for Circle
        System.out.println("Drawing a Circle");
    }
}

class Rectangle1 implements Drawable { // Rectangle class implements Drawable interface
    @Override
    public void draw() { // Implementation of draw() for Rectangle
        System.out.println("Drawing a Rectangle");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Drawable circleDrawable = new Circle1(); // Interface reference can hold object of implementing class
        Drawable rectangleDrawable = new Rectangle1();

        circleDrawable.draw();    // Calls Circle's draw()
        rectangleDrawable.draw(); // Calls Rectangle's draw()

        // List of Drawable objects
        Drawable[] drawables = new Drawable[2];
        drawables[0] = circleDrawable;
        drawables[1] = rectangleDrawable;

        for (Drawable drawable : drawables) {
            drawable.draw(); // Polymorphic call to draw()
        }
    }
}










