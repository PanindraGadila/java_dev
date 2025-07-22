package anonymous_lamda_expression;
import anonymous_lamda_expression.sample_funstional_interface; // Add this import


public class lamda_expression {
    public sample_funstional_interface obj1;
    public lamda_expression(sample_funstional_interface obj1) {
        // Using a lambda expression to implement the functional interface
        this.obj1 = obj1;
    }
    public sample_funstional_interface performAction(){
        // Calling the method of the functional interface
        obj1.performAction("Run");
        return obj1;
    }
    
}
