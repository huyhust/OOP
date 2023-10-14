// Calculate sum, difference, product, and quotient of 2 double 
import javax.swing.JOptionPane;


public class calculate{


	public static void main(String args[]){

		String strNum1, strNum2;

		strNum1 = JOptionPane.showInputDialog(null, "Enter the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);

		double num1 = Double.parseDouble(strNum1);

		strNum2 = JOptionPane.showInputDialog(null, "Enter the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		
		double num2 = Double.parseDouble(strNum2);

		double sum = num1 + num2;

		double difference = num1 - num2;

		double product = num1 * num2;



		if(num2 != 0){


			double quotient = num1 / num2;
			double roundOff = Math.round(quotient * 100.0) / 100.0;
			strNum2 = String.valueOf(roundOff);

		}else{


			strNum2 = "Infinity";
		}
		



		JOptionPane.showMessageDialog(null, "The sum of two number: " + sum + "\n" + 
											"The difference of two numbers: " + difference + "\n" + 
											"The product of two numbers: " + product + "\n" + 
											"The quotient of two number: " + strNum2 + "\n");

	}
}