public class pani_string {
    // this java code file teached abuut string and all its string related in datastructures and algorithms
    String a= "panindra  reddy";

    // inbuit String OBject functions
    int b = a.length();

    String txt = "Hello World";
    // System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
    // System.out.println(txt.toLowerCase());   // Outputs "hello world"
    // finding a char 

    int c = a.indexOf("reddy"); 
    // it can also be a char so only returns the int value of the first occurance of given subsrting


    public static void main(String[] args) {
        // string concatination
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        // also using s.concat(b)

        // concating the string with number always returns a combined string with the numer 
        int a =100;
        String b = "pani";
        String c = a + b; //returns the string of 100pani

        



        System.out.println("a.l");
    }
}
