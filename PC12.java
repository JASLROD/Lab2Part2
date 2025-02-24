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
public class PC12
{
    public static void main(String[] args)
    { 
        String cityName = ("San Diego");
        String upper = cityName.toUpperCase();
        String lower = cityName.toLowerCase(); 
        char ltr = upper.charAt(0);
        int stringSize = cityName.length();
        
       Scanner keyboard = new Scanner (System.in);
       
       System.out.print("Enter a city:");
       cityName = keyboard.nextLine();
       

       
       System.out.println("The city entered has:"+ stringSize + "chars");
       System.out.println("In upper case:"+ upper);
       System.out.println("In lower case:" + lower);
       System.out.println("First character:" + ltr);
    }
}
