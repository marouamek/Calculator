package part2_project;

public class Addition extends OperationBinaire {

	 
	 public Addition() {
	        super(); // Default constructor
	    }

	 public Addition(double operand1, double operand2) {
	        super(operand1, operand2); // Call the constructor of OperationBinaire with the operands
	    }
	 
	public double Calcul() {
		
		return operand1 + operand2;
	}
}
