package part2_project;

public class Log extends OperationUnaire {
	
	public Log(double operand1) {
        super(operand1);
    }
	public Log() {
        super(); // Default constructor
    }
	
	public double Calcul() {
        // Handle logarithm of non-positive values
        if (operand1 > 0) {
            return Math.log(operand1);
        } else {
            System.out.println("  === Error!!! Logarithm of a non-positive value! === ");
            return Double.NaN;
        }
    }
}
