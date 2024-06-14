package part2_project;

import java.util.Scanner;

public class Calculatrice {
	  public static void main(String[] args) {
		  
		    String reset ="\u001B[30m";
			String purple = "\u001B[35m";
			String red= "\u001B[31m";
			String blue ="\u001B[34m";
			String yellow="\u001B[33m";
			String green="\u001B[32m";
			
			
		  displayWelcomeMessage();

	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            displayMenu();

	            System.out.print(yellow+ "               === "+purple+"Select an operation: "+yellow+"==="+red+"(1-9): \n"+blue);
	            int choice = scanner.nextInt();

	            if (choice == 9) {
	                System.out.println(yellow+"=== "+green+"Goodbye! "+yellow+"===");
	                break;
	            }

	            double result = 0;
                 
	            switch(choice) {
	            
	            case 1:
	            	 result = Operation(new Addition()); 
	            	 System.out.println(blue+"                                                           "+result);
	            	
	            	break;
	            	
	            case 2:
	            	result = Operation(new Soustraction());
	            	 System.out.println(blue+"                                                            "+result);
	            	break;
	            	
	            case 3:
	            	result = Operation(new Multiplication());
	            	 System.out.println(blue+"                                                            "+result);
	            	break;
	            	
	            case 4:
	            	result = Operation(new Division());
	            	 System.out.println(blue+"                                                            "+result);
	            	break;
	            	
	            case 5:
	            	result = Operation(new Sin());
	            	
	            	break;
	            	
	            case 6:
	            	result = Operation(new Cos());
	            	
	            	break;
	            	
	            case 7:
	            	result =Operation(new Log());
	            	
	            	break;
	            	
	            case 8:
	            	result = Operation(new Exp());
	            	
	            	break;
	            	
	            default:
                    System.out.println(red+" ===      Invalid choice. Please enter a number between 1 and 9.    ===");
            }

            System.out.println(green+" Result: " + result + "\n"+reset);

}
}
	  
	  
	    String reset ="\u001B[30m";
		String purple = "\u001B[35m";
		String red= "\u001B[31m";
		String blue ="\u001B[34m";
		String yellow="\u001B[33m";
		String green="\u001B[32m";
	  
	  
	        private static void displayWelcomeMessage() {
	    	    String reset ="\u001B[30m";
	    		String purple = "\u001B[35m";
	    		String red= "\u001B[31m";
	    		String blue ="\u001B[34m";
	    		String yellow="\u001B[33m";
	    		String green="\u001B[32m";
	    		
	            System.out.println(purple+"==================================================================================================================================");
	            System.out.println(green+"                                               Welcome to Simple Calculator "+red+":)  ");
	            System.out.println(purple+"================================================================================================================================\n");
	        }  
	        private static void displayMenu() {
	    	    String reset ="\u001B[30m";
	    		String purple = "\u001B[35m";
	    		String red= "\u001B[31m";
	    		String blue ="\u001B[34m";
	    		String yellow="\u001B[33m";
	    		String green="\u001B[32m";
	    		
	            System.out.println(yellow+"================================================================================================================================");
	            System.out.println(blue+"                                                             MENU               ");
	            System.out.println(yellow+"===============================================================================================================================\n");
	            System.out.println(red+"                   1. "+green+"Addition");
	            System.out.println(red+"                   2. "+green+"Subtraction");
	            System.out.println(red+"                   3. "+green+"Multiplication");
	            System.out.println(red+"                   4. "+green+"Division");
	            System.out.println(red+"                   5. "+green+"Sinus");
	            System.out.println(red+"                   6. "+green+"Cosinus");
	            System.out.println(red+"                   7. "+green+"Logarithm");
	            System.out.println(red+"                   8. "+green+"Exponential");
	            System.out.println(red+"                   9. "+green+"Quit");
	            System.out.println(yellow+"\n==============================================================================================================================\n");
	  
	}
	       private static double Operation(OperationBinaire operation) {
	    	    String reset ="\u001B[30m";
	    		String purple = "\u001B[35m";
	    		String red= "\u001B[31m";
	    		String blue ="\u001B[34m";
	    		String yellow="\u001B[33m";
	    		String green="\u001B[32m";
	    	   
	            Scanner scanner = new Scanner(System.in);

	            System.out.print(yellow+ "               === "+purple+"Enter the first operand: "+yellow+"===\n"+blue
	            		);
	            double operand1 = scanner.nextDouble();

	            System.out.print(yellow+ "               === "+purple+"Enter the second operand: "+yellow+"===\n"+blue);
	            double operand2 = scanner.nextDouble();
	            
	            operation.setOpearnd1(operand1);
	            operation.setOpearnd2(operand2);
	            
	            
	            System.out.println(blue+"\n                                                            "+operand1 );	   
	            System.out.println(red+   "                                                       "+Signe(operation)); 
	            System.out.println(blue+"                                                            "+operand2 );
	            System.out.println(red+"                                                       --------------");
	            System.out.println(red+"                                                       =");
	           

	            return operation.Calcul();
	        }     
	       private static String Signe(OperationBinaire operation) {
	    	   
	    	   if (operation instanceof Addition) {
	    	        return "+";
	    	    } else if (operation instanceof Soustraction) {
	    	        return "-";
	    	    } else if (operation instanceof Multiplication) {
	    	        return "x";
	    	    } else if (operation instanceof Division) {
	    	        return "   _______";
	    	    } else {
	    	        return ""; 
	    	    }
	       }
	       
	       private static double Operation(OperationUnaire operation) {
	    	    String reset ="\u001B[30m";
	    		String purple = "\u001B[35m";
	    		String red= "\u001B[31m";
	    		String blue ="\u001B[34m";
	    		String yellow="\u001B[33m";
	    		String green="\u001B[32m";
	    	   
	            Scanner scanner = new Scanner(System.in);

	            System.out.print(yellow+ "              === "+purple+"Enter the first operand: "+yellow+"===\n"+blue
	            		);
	            double operand1 = scanner.nextDouble();

	            operation.setOpearnd1(operand1);
	            
	            System.out.println(blue + "                                                       " +red+ Signe2(operation)+"("+blue+operand1+red+")"+red+"="+blue+operation.Calcul());


	            return operation.Calcul();
                }
	       private static String Signe2(OperationUnaire operation) {
	    	    if (operation instanceof Sin) {
	    	        return "Sin";
	    	    } else if (operation instanceof Cos) {
	    	        return "Cos";
	    	    } else if (operation instanceof Log) {
	    	        return "Log";
	    	    } else if (operation instanceof Exp) {
	    	        return "Exp";
	    	    } else {
	    	        return "Unknown";
	    	    }
}
}