package part2_project;

public class Division extends OperationBinaire {

	public Division() {
	        super(); // Default constructor
	    }
	
	 public Division(double operand1, double operand2) {
	        super(operand1, operand2); // Call the constructor of OperationBinaire with the operands
	    }
	
	public double Calcul() {
        // Handle division by zero
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            System.out.println(" ===  Error!!!: Division by zero!  ===");   
            return Double.NaN;
        }
    }
}
