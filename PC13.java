import java.util.Scanner;
/**
 * The Scanner class will read input from the keyboard we can use 
 * 1)i will set interger variables to find different values
 * 2)it will ask for the meal price 
 * 3)it will calculate the tax, tip and total 
 *
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.1
 * @since 2/25/2025
 */

public class PC13
{
    public static void main (String[] args){
        //variables
        double meal, total, taxAmount, tipAmount;
        final double TAX = 0.0675;
        final double TIP = 0.20;
        // Get input 
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter meal amount: $");// print out question 
        meal = keyboard.nextDouble();

        
        taxAmount = meal*TAX;
        System.out.printf("\nThe tax is: $%,.2f", taxAmount);

        tipAmount = (meal+taxAmount)*TIP;
        System.out.printf("\nThe tip amount is: $%,.2f", tipAmount);

        total = meal+taxAmount+tipAmount;
        System.out.printf("\nThe meal cost with tax and tip is: $%,.2f", total);


        
    }
}
