package part2_project;

public class Exp extends OperationUnaire{
	
	public Exp(double operand1) {
        super(operand1);
    }
	
	public Exp() {
        super(); // Default constructor
    }

    public double Calcul() {
        return Math.exp(operand1);
    }
}
