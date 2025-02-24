Import //JOptionPane class

/**
 * ProChall15 class does the following:
 * 1) Add Steps
 * 
 * @author Name, optional email
 * @version v1.0
 * @since date
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
        temp = JOptionPane.showInputDialog ("Enter number of shares purchased");
        numShares = Integer.parseInt (temp);
        //Repeat these steps as appropriate to get pricePerShare.  ////NOTE-pricePerShare is a double

        ////computations
        //assign totalCostShares with product of what and what?
        //assign commission with product of what (hint step above) and what?
        //assign total with addition of what and what (hint look at above two values)

        ////display output
        JOptionPane.showMessageDialog(null, String.format("Total cost of shares are: $%,.2f",totalCostShares) +
            String.format("\nCommission cost is: $%,.2f",commission) +
            String.format("\nTotal Cost is: $%,.2f",total));

        //make sure to add System.exit(0) :-)
    }//// end main()
}//// end class