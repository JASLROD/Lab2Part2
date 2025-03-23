import javax.swing.JOptionPane;

/**
 * ProChall15 class does the following:
 * This program calculates the total cost of purchasing stocks, 
 * including a 2% commission fee. It uses dialog boxes to collect 
 * user input for number of shares and price per share.
 * A dialog box will display the results 
 * of the total cost, including commission. 
 * 
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.1
 * @since 3/22/2025
 */

public class ProChall15
{
    public static void main (String[] args)
    {
        //variables
        int numShares;
        double pricePerShare, totalCostShares, commission, total;
        final double COMM_RATE = 0.02;
        String temp;

        ////get input for number of shares and cost per share using Dialog boxes
        
        temp = JOptionPane.showInputDialog ("Enter price per share: ");
        pricePerShare = Double.parseDouble(temp);
        
        temp = JOptionPane.showInputDialog ("Enter number of shares purchased: ");
        numShares = Integer.parseInt(temp);
        
        

        ////computations
        totalCostShares = pricePerShare * numShares;
        commission = totalCostShares * COMM_RATE;
        total = totalCostShares + commission;

        ////display output
        JOptionPane.showMessageDialog(null, String.format("Total cost of shares are: $%,.2f",totalCostShares) +
            String.format("\nCommission cost is: $%,.2f",commission) +
            String.format("\nTotal Cost is: $%,.2f",total));

        System.exit(0);
    }//// end main()
}//// end class