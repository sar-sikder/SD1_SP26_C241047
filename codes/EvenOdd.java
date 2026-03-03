// Check if a number is even or odd

import java.util.*; 
public class EvenOdd {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter a Number: "); 
    int num = input.nextInt(); 
    if(num % 2 == 0){
      System.out.println(num + " is even."); 
    }
    else{
      System.out.println(num + " is odd."); 
    }
    input.close(); 
  }
}
