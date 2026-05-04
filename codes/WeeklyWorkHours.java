/*
Recently You joined a new company. In this company, the employees have to work 
for X hours each day from Saturday to Wednesday. Also, in this company, 
Wednesday is called Chill Day, employees only have to work for Y hours (Y<X) on 
Wednesday. 
Determine the total number of working hours in one week.
*/

import java.util.*;

public class WeeklyWorkHours {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 

    System.out.println("Enter Sat to Tues Work Hours: "); 
    int X = sc.nextInt(); 

    System.out.println("Enter Wed Work Hours: "); 
    int Y = sc.nextInt(); 

    if(Y >= X){
      System.out.println("Invalid Input. Y must be less than X"); 
    }
    else{
      int totalHours = (4 * X) + Y; 
      System.out.println("Total Weekly Work Hours are: " + totalHours); 
    }
    sc.close(); 

  }
}
