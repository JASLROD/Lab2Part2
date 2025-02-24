import java.util.Scanner;
/**
 * The Scanner class will read input from the keyboard we can use 
 * 1)i will set interger variables to find different values
 * 2)it will ask for the meal price 
 * 3)it will calculate the tax, tip and total 
 *
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 2/23/2025
 */

public class PC13
{
   public static void main (String[] args){
        double meal, total, taxAmount, tipAmount;
        final double TAX = 0.0675;
        double constant TIP = 20.00f%
        
         Scanner keyboard = new Scanner (System.in);
        
        ////Get input section
        System.out.print("Enter meal amount: $");
        System.out.print//assign meal var with a double from the Scanner object
        System.out.print//assign taxAmount var with a double from meal * ???
        System.out.print//assign tipAmount var with a double from meal * ???
        System.out.print//assign total var with the sum of ???
        
        System.out.printf("\nThe tax is: $%,.2f", taxAmount);  
        //// $%,.2f is a place holder for $ then puts a , 
        //// after 3 places (as needed) and rounds to 2 decimal places
        System.out.printf("\nThe tip amount is: $%,.2f", tipAmount);  
        System.out.printf("\nThe meal cost with tax and tip is: $%,.2f", total);
    }
}
