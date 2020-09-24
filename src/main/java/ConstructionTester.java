import java.util.Scanner;
public class ConstructionTester{
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the sales tax rate:");
       double myTaxRate = in.nextDouble();
       System.out.println("How many boards do you need?");
       int myNumBoards = in.nextInt();
       System.out.println("How many windows do you need?");
       int myNumWindows = in.nextInt();
 
       Construction myC = new Construction(8, 11, myTaxRate);
 
       double myTotal = myC.lumberCost(myNumBoards) + myC.windowCost(myNumWindows);
       System.out.println("Total: " + myTotal);
       System.out.println("Grand Total: " + myC.grandTotal(myTotal));
   }
}