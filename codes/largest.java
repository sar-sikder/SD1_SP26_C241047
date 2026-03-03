// Find the maximum of 3 numbers: Take 3 numbers from user input, print the largest.

import java.util.*; 
public class largest {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter first number: "); 
    int num1 = input.nextInt(); 

    System.out.print("Enter second number: "); 
    int num2 = input.nextInt(); 

    System.out.print("Enter third number: "); 
    int num3 = input.nextInt(); 

    int max; 

    if(num1 >= num2 && num1 >= num3){
      max = num1; 
    }
    else if(num2 >= num1 && num2 >= num3){
      max = num2; 
    }
    else{
      max = num3; 
    }
    System.out.println("The largest number is: " + max); 
    input.close(); 
  }
}
