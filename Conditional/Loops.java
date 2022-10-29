import java.util.Scanner;

public class Loops{
	
	public static void main(String[] args) {
		System.out.println("Lets see the loops");
		Scanner input = new Scanner(System.in);
		// int salary= 25000; 
		// Scanner salary = input;
		// System.out.print(input.nextInt());   Cannot perform arithmetic operations to be performed on Scanner
		 System.out.print("Enter the Salary amount.");
		float salary = (input.nextFloat());
		
		// If else block 
        if ( salary > 20000){
			salary = salary + 3000;
		}
		else{
			salary = salary + 1000;
		}

		System.out.println("Salary1 after bonus : "+ salary);

		Scanner input2 = new Scanner(System.in); 
		System.out.println("Enter 2nd Salary : ");
		float salary2 = (input2.nextFloat());

        
		// else-if
	    if(salary2 > 25000){
			salary2 += 3000;
		} 
		else if( salary2 > 10000){
			salary2 +=  2000;
		}
		else{
			salary2 += 1000;
		} 

		System.out.println("Salary after bonus : "+ salary2);


		input2.close();
		input.close();
	}
	
	
}