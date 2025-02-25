import java.util.Scanner;
/**
 * The Scanner class will read city name input from the keyboard we can use
 * to print out the strin size, the city in upper case 
 * and lower case, as well as the first letter
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.1
 * @since 2/25/2025
 */
public class PC12
{
    public static void main(String[] args)
    { 
        //variables
        String cityName,upper, lower;
        char firstLtr;
        int stringSize;
        // getting input
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter a city: ");
        cityName = keyboard.nextLine();
        //operations
        upper = cityName.toUpperCase();
        lower = cityName.toLowerCase(); 
        firstLtr = upper.charAt(0);
        stringSize = cityName.length();
        //output
        System.out.println("The city entered has: "+ stringSize + " chars");
        System.out.println("In upper case: "+ upper);
        System.out.println("In lower case: " + lower);
        System.out.println("First character: " + firstLtr);
    }
}
