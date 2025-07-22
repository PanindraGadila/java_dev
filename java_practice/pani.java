public class pani {

//variable
// type name = vale;
String name = "panindra";
int a = 12;
char c = 't';

boolean t1 = true;
boolean t2 = (a==b);

// since theess are out of method scope(not local varibles) os these can have access identfiers
// acc modfiers acc specfiers(static or non static) these modiofiers/specifiers are only applicable for class variables not for local i.e method varibles)
public static int b = 23432;
// final varibls
public static final int test = 1213132;

// momoery size allcation of the all datatypes in java
// For each type, the standard sizes are:
// - byte: 1 byte (8 bits)
// - short: 2 bytes (16 bits)
// - int: 4 bytes (32 bits)
// - long: 8 bytes (64 bits)
// - float: 4 bytes (32 bits)
// - double: 8 bytes (64 bits)
// - char: 2 bytes (16 bits) because it's UTF-16 Unicode
// - boolean: technically 1 bit, but often uses a byte for efficiency

// non premitive types like Objects, arrays, strings and all other referene type usese the 4byte or 8 byte max to determine the adrress in memeory of stack and heap
// so its fixed size as it only deals with adresses of the referances.


// type casting 
// premitive data types casting
public static void casting(){
    long bigValue = 1234567890123L;
    int smallValue = (int) bigValue; // Truncated bits → unexpected value
    System.out.println(smallValue);  // Output: -1912272757 (overflow)
}
// non premetive datatype casting happens at OOPs concepts below sine they only us eth adresses of the objects rather actal data.(run time and compile time type casting)


// operators 
// - Arithmetic: +, -, *, /, %, ++, --
// - Assignment: =, +=, -=, *=, /=, %=, etc.
// - Comparison: ==, !=, >, <, >=, <=
// - Logical: &&, ||, !
// - Bitwise: &, |, ^, ~, <<, >>, >>>  (bit wise AND, OR, NOT, left and right shifts)
//  int a = 5;  // Binary: 0101
// int b = 3;  // Binary: 0011 so System.out.println("AND (&): " + (a & b))
// - Ternary: ? :
// - Instanceof: instanceof
// Additionally, there are unary operators like +, -, !, ~, ++, --. Also, the conditional operators && and ||. The bitwise assignment operators like &=, |=, ^=, <<=, >>=, >>>=.



    // this is a method defination
    // acc modifiers, specifiers, return type, name(parameters
    public static void main(String[] args) {
        final int a = 22323; // this is allowed in java
        // private int a = 324324; is not allowed - error
        // staic int a = 13414; is no allowed- error
        // public static int a = 2343214; not allowed, only final is allowed for local variables

        System.out.println("Hello, World!" + a);

        // typecating method callings
        casting();
    }





    // math class funtions in java

    void mathfunctions(){
        Math.max(5, 10);
        // finds the max,mins and similarly other funstions as below
        // ** imp funcitons in Math class
        Math.pow(2, 5); //returns = 32.0
        System.out.println(Math.random());    //return a random value between 0.0 (inclusive), and 1.0 (exclusive):

        int b = (int) Math.random()*100; // vlaues btween 0 to 100

    }
}