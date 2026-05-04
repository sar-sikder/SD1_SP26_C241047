/*
There are N children and an IIUCian wants to give them 1 candy each. He already 
has X candies with him. To buy the rest, he visits a candy shop. In the shop, packets 
containing exactly 4 candies are available.
Determine the minimumnumber of candy packets he must buy so that he is able 
to give 1 candy to each of the N children
*/

import java.util.*; 

public class CandyDistribution {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 

    System.out.println("Number of Children: "); 
    int N = sc.nextInt(); 

    System.out.println("Candy has: "); 
    int X = sc.nextInt(); 

    int CandyNeeded = N - X; 
    if(CandyNeeded <= 0) 
      System.out.println("Candy Packets Needed: " + 0); 
    else{
      int Packets = (CandyNeeded + 3) / 4; 
      System.out.println("Candy Packets needed: " + Packets); 
    }
    sc.close(); 
  }
}
