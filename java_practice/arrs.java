public class arrs {
    int a = 12;
    // ** Arrays
    // int[] lucky_nums = [4]; --- error(cannot initialize an array with an empty size**)
    // int[] lucky_nums1 = new int[]; -error cannot allocate meomry, need the size use datastructures istead
    int[] lucky_nums1 = new int[4]; //4block of size in momoenry
    static int[] lucky_nums ={}; //empy array but zero size
    

//**using new keyword for initialzing */    
    static int[] nums =  new int[]{1,2,3,4,5}; // correct way


    //**incorrect short usagge intitializing after declaration in bwlow type is not allowed in java */
    // static int[] newnums;
    // newnums = {1,2,3,4,5};

//**since you cannot declare and later initialize a global variable*/
    static int[] newnums;
    // newnums = new int[]{1,2,3,4,5}; -- error because you cannot assign a value to a static variable outside of a method or a static block in Java. 
    // staic block
    static {
        newnums = new int[]{1, 2, 3, 4, 5}; // Correct
    }//--if incase it is non static use a {} - non static block to instaiate





// **multi dimension array  in java
    public static int[][] multar= new int[16][3];
    
    public static void main(String[] args) {
        // multar = { {1, 2,3}, {5, 6, 7} };---error because java is not allowed to reassesing the {} in other locations aprt fom declaration place itself.
        multar = new int[][]{ {1, 2,3}, {5, 6, 7} };
        System.out.println(lucky_nums.length); 
        System.out.println(multar[1].length);      
    }
}
