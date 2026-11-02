/*
*Student Name: OYEWOLE  AISHAT BUSOLA 
  * Matric No:25/16421
  */
import java.util.Scanner

Public class IteamCost{
  Public static void main (String[] args){
    Scanner input= new Scaner (System.in);

  System.out.print("Enter item name :");
    String itemName= input.nextLine();

  System.out.print("Enter quantity:");
    int quantity= input.nextInt();

  System.out.print("Enter unit price :");
    double unitprice =input.nextDouble();

  double totalcost=quantity*unitprice;
    
    System.out.println("Item:"+itemname);
    System.out.println("Quantity:"+ quantity);
    System.out.println("Unitprice:%.2%fn",unitprice);
    System.out.println("Total cost : %.2f%n",totalcost);
    input.close();
  }
}
