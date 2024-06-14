package part2_project;

public class Sin extends OperationUnaire {
	
	public Sin(double operand1) {
        super(operand1);
    }
   
	  public Sin() {
	        super();
	  }

	public double Calcul() {
        return Math.sin(operand1);
    }
}
