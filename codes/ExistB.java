/*
You are given 2 integers - A and C. You need to find if there exists 
any integer B which meets the following condition
B must be an integer
B is the average of A and C
 */

import java.util.*; 

public class ExistB{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in); 

    System.out.println("Enter A: "); 
    int A = input.nextInt(); 

    System.out.println("Enter B: "); 
    int C = input.nextInt(); 

    int sum = A + C; 

    if(sum % 2 == 0){
      int B = sum / 2;
      System.out.println("B exists: " + B); 
    }
    else{
      System.out.println("Integer B doesn't exists"); 
    }


  }
}