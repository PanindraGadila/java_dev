public class condition_loops {

    public static void main(String[] args) {

// this file explains all statements used in java like 

//if else and else if
        if (1==2) {
            System.out.println(true);
        }
        else if (1!=2) {
            System.out.println(false);
        }
        else
        {
            System.out.println(true);
        }
//short hand ifelse 
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


//swith block
        int day = 4;
        switch (day) {
        case 6:
            System.out.println("Today is Saturday");
            break;
        case 7:
            System.out.println("Today is Sunday");
            break;
        default:
            System.out.println("Looking forward to the Weekend");
        }

    
//while loop   
        int wh = 0;
        while (wh < 5) {
        System.out.println(wh);
        wh++;
        }



//do while
// do {
//     // code block to be executed
//   }
//   while (condition);


//for and nested for
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
            
            // Inner loop
            for (int j = 1; j <= 3; j++) {
            System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        } 

//for each loop
        int[] myNumbers = {1, 2, 3, 4, 5};
        for (int i : myNumbers) {
        System.out.println(i);
        }


}
}



//**brerak is used to break the looop using another condiiton statement mentions
//also the same as continue to break and jump to next iteration in loop without exuectingth rest code after the contine key word,
// this continue can also be used by mentioning any condition statement

