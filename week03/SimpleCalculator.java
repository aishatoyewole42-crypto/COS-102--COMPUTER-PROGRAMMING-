/*
*Student Name :OYEWOLE AISHAT BUSOLA 
  * Matric No: 25/16421 
  *Programme:COMPUTER SCIENCE 
  */
import java.util.Scanner;

Public class SimpleCalculator{
  Public static void main (String[]args){
    Scanner scanner=new Scanner( System.in);
    System.out.print("Enter first number:");
    double firstNumber= scanner.nextDouble();
    System.out.print("Enter second number:");
    double secondNumber=scanner.nextDouble();
    System.out.print("Enter operator(+,-,*,/:"));
    char operator= scanner.next().charAt(0);

  double result=0
    boolean valid=true;

  switch(operator) {
    case '+': result=firstNumber+ secondNumber;break;
      case'-':result =firstNumber-secondNumber;break;
      case'*':result=firstNumber*secondNumber;break;
      case'/':
      if(secondNumber!=0) result=fistNumber/secondNumber;
      else{ System.out.println("Error:Division by zero not allowed."); valid =false;}
      break;  
        default:System.out.println("Invalid operator.");valid =false;
  }
    if (valid){
      System.out.printf("result:%.2f  %c %.2f=%.2f%n",fisrtNumber,operator,secondNumber,result);
    }
    scanner.close();
  }
}
