/*
Capitalization is writing a word with its first letter as a capital letter. Your task is to 
capitalize the given word.
Note, that during capitalization all the letters except the first one remains 
unchanged
 */

import java.util.*; 
public class Capitalization {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 

    System.out.println("Enter a Word: "); 
    String word = sc.nextLine(); 

    if(word.length() > 0){
      String result = Character.toUpperCase(word.charAt(0)) + word.substring(1); 
      System.out.println("Result: " + result); 
    }
    sc.close(); 
  }
}
