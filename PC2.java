import java.util.Scanner;
/**
 *This program gets first name, middle name and last name input
 *from the user. Then prints out full name and initals. 
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.1
 * @since 2/25/2025
 */
public class PC2
{
    public static void main(String[] args)
    { 
        String firstName,middleName, lastName;
        char firstInit,middleInit,lastInit;

        Scanner keyboard = new Scanner (System.in);

        System.out.print("Enter your first name:");
        firstName = keyboard.nextLine();
        firstInit = firstName.charAt(0);
        
        System.out.print("Enter your middle name:");
        middleName = keyboard.nextLine();
        middleInit = middleName.charAt(0);

        System.out.print("Enter your last name:");
        lastName = keyboard.nextLine();
        lastInit = lastName.charAt(0);

        System.out.println("My name is: " + firstName +" "+  middleName +" "+  lastName);
        System.out.println("My initials are: " + firstInit + middleInit  + lastInit);

    }
}
