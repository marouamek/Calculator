package part2_project;

public class Cos extends OperationUnaire{
	
	
	public Cos(double operand1) {
        super(operand1);
    }
	public Cos() {
        super(); // Default constructor
    }
    public double Calcul() {
        return Math.cos(operand1);
    }
}
