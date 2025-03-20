import javax.swing.JOptionPane;

/**
 * ProChall15 class does the following:
 * 1) program ask user for input by using a dialog box
 * 2) it will then calculate 
 * 
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 2/23/2025
 */

public class ProChall15
{
    public static void main (String[] args)
    {
        int numShares;
        double pricePerShare, totalCostShares, commission, total
        final double COMM_RATE = 0.02;
        String temp; // var to receive Input Dialog box contents

        ////get input for number of shares and cost per share using Dialog boxes
        temp = JOptionPane.showInputDialog ("Enter price per share", numShare);
        numShares = Integer.parseInt (temp);
        
        temp = JOptionPane.showInputDialog ("Enter number of shares purchased", pricePerShare);
        pricePerShare = Double.parseDouble(); 
        
        temp = JOptionPane.showInputDialog ("Enter number of shares purchased", pricePerShare);

        ////computations
        totalCostShares = with product of what and what?
        commission = with product of what (hint step above) and what?
        total = with addition of what and what (hint look at above two values)

        ////display output
        JOptionPane.showMessageDialog(null, String.format("Total cost of shares are: $%,.2f",totalCostShares) +
            String.format("\nCommission cost is: $%,.2f",commission) +
            String.format("\nTotal Cost is: $%,.2f",total));

        //make sure to add System.exit(0) :-)
    }//// end main()
}//// end class