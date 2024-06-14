package part2_project;

public class OperationBinaire implements CalculMath{

	protected double operand1;
	protected double operand2;
	
	public OperationBinaire() {
        this.operand1 = 0; // Default value for operand 1
        this.operand2 = 0; // Default value for operand 2
    }
	
	 public OperationBinaire(double operand1, double operand2) {
	        this.operand1 = operand1;
	        this.operand2 = operand2;
	    }
	 
	 public void setOpearnd1(double operand1) {
			this.operand1=operand1;
		}
	 
	public void setOpearnd2(double operand2) {
		this.operand2=operand2;
	}
	 
	public double Calcul() {
		return 0;
	}

	
}