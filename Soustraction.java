package part2_project;

public class Soustraction extends OperationBinaire {
	 public Soustraction() {
	        super(); // Default constructor
	    }
	 
	 public Soustraction(double operand1, double operand2) {
	        super(operand1, operand2); // Call the constructor of OperationBinaire with the operands
	    }

	public double Calcul() {
		
		return operand1 - operand2;
	}
}
