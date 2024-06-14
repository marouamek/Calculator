package part2_project;

public class OperationUnaire implements CalculMath {

      protected double operand1;

      
      public OperationUnaire() {
   	   this.operand1 = 0;
             }
 
   public OperationUnaire(double operand1){
	
	   this.operand1=operand1;
}
   
public void setOpearnd1(double operand1) { 	
this.operand1=operand1;
}

  public double Calcul(){
	  
	  return 0;
  }
}


