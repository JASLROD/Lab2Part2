import java.util.Scanner;
/**
 * The Scanner class will read input from the keyboard we can use 
 * 1)
 * 2)
 * 3)
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 2/23/2025
 */
public class PC2
{
    public static void main(String[] args)
    { 
        String firstName = (" Jasmin ");
        String middleName = ("Flor ");
        String lastName = ("Leonrodriguez");
        char firstInit = firstName.charAt(0);
        char middleInit = middleName.charAt(0);
        char lastInit = lastName.charAt(0);
        
       Scanner keyboard = new Scanner (System.in);
       
       System.out.print("Enter your first name:");
       firstName = keyboard.nextLine();
       
       System.out.print("Enter your middle name:");
       middleName = keyboard.nextLine();
       
       System.out.print("Enter your last name:");
       lastName = keyboard.nextLine();
       
       System.out.println("My name is:" + firstName +  middleName +  lastName);
       System.out.println("My initials are:" + firstInit+middleInit+lastInit);
       
    }
}
