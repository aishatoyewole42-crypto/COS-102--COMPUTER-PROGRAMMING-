/*
* Student Name: OYEWOLE AISHAT BUSOLA 
* Matric No: 25/16421
* Programme: COMPUTER SCIENCE 
  */
import java.util.scanner;

Public class AverageCalculator {
  Public static void main (String[] args ){
    Scanner input =nnew Scanner (System.in);

    System.out.print("Enter first score:");
    double scorce1 = input.nextDOUBLE();
    System.out.print("Enter second score:");
    double scorce2 = input.nextDouble();
    System.out.print("Enter third score:");
    double score3=input.nextDouble();

    double total= score1+score2+score3;
    double average =total/3;

    System.out.printif("Total:%.2f%n",total );
    System.out.printf("Average:%.2f%n",average;
    input.close();
  }
}
  
