package anonymous_lamda_expression;
import anonymous_lamda_expression.sample_funstional_interface; // Add this import
import anonymous_lamda_expression.lamda_expression; // Add this import

public class anonymous_functions {
    //anonymous inner class creating an single object for ever for this class. 

    public static void main(String[] args) {
        // Using an anonymous inner class to implement the functional interface
        //by this we can create an object of the functional interface without creating a separate class implementing it.
        sample_funstional_interface action = new sample_funstional_interface() {
            @Override
            public void performAction(String action) {
                System.out.println("Performing action: " + action);
            }
        };

        // Calling the method of the functional interface
        action.performAction("Run");
        lamda_expression obj = new lamda_expression(s-> System.out.println("lambda expressed value"+s));//this is a lambda expression that implements the functional interface
        obj.performAction().performAction("mamulga undadhu");

    }
}
