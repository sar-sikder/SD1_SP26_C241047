/*
You are given three digits a, b, c. Two of them are equal, but the third one is 
different from the other two.
Find the value that occurs exactly once.
 */

import java.util.*; 
public class UniqueNumber {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 

    System.out.println("Enter three numbers: "); 

    int a = sc.nextInt(); 
    int b = sc.nextInt(); 
    int c = sc.nextInt(); 

    int result; 

    if(a == b)
      result = c; 
    else if(a == c)
      result = b; 
    else 
      result = a; 
    System.out.println("Result: " + result); 

    sc.close(); 
  }
}
