//Example 5: ShowTwoNumbers.java

import javax.swing.JOptionPane;
//Nhap vao 2 so va Hien thi ra hai so vua nhap


public class ShowTwoNumbers{

	public static void main(String args[]){


		String strNum1, strNum2;
		String strNotification = "Duong Duc Huy-20215059-You've just entered: ";
		strNum1 = JOptionPane.showInputDialog(null, "Duong Duc Huy-20215059-Please input the first number: ", 
"Duong Duc Huy-20215059-Input the first number", JOptionPane.INFORMATION_MESSAGE);

		strNotification += strNum1 + " and ";
		strNum2 = JOptionPane.showInputDialog(null, "Duong Duc Huy-20215059-Please input the second number: ", 
"Duong Duc Huy-20215059-Input the second number", JOptionPane.INFORMATION_MESSAGE);


		strNotification += strNum2;
		JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
}

}