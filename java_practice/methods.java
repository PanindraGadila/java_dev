

public class methods {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,54,56};
    // static method can be called by just calling name of function or classname.funcstionaname();
    func1(12, arr1, "apnindra");

    //calling non static function, create a object using new keyword and call in the non static method
    methods m1 = new methods();
    m1.func2(22);
    System.out.println(m1.factorial(9999));
    System.out.println(m1.func2(12, "null"));

        
    }

// methods are functions which executed a block code when called
// methid defination
// ** accesss modifier and access specifier, return type, name, (params)
public static int func1(int a, int[] b, String c){
    return 12; // returned some value

}

//non static methods
public int func2(int a){
    return 11; // returned some value

}

// method overloading. same applies to static methods too jus tha ve to change the parameters
public int func2(int a, String b){
    return 111; // returned some value

}
public int fact = 0;
// *** recursion calling and uses
// find n!;
public int factorial(int n){
    if (n>0) { 
         return n*factorial(n-1);
    }
    else{
            return 0;
    }

}
}

