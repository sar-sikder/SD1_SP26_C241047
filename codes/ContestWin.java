/*
An IIUCian has reached the finals of the Annual Inter-university Declamation 
contest.
For the finals, students were asked to prepare 10 topics. However, he was only able 
to prepare three topics, numbered A,B and C; he is totally blank about the other 
topics. This means he can only win the contest if he gets the topics A,B or C to 
speak about.
On the contest day, he gets topic X. Determine whether he has any chances of 
winning the competition.
Print "Yes" if it is possible to win the contest, else print "No".
*/


import java.util.*; 

public class ContestWin {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 

    System.out.println("Enter Number of topics he prepare: "); 
    int A = sc.nextInt(); 
    int B = sc.nextInt(); 
    int C = sc.nextInt(); 

    System.out.println("Topic he gets to speak: "); 
    int X = sc.nextInt(); 

    if(X == A || X == B || X == C)
      System.out.println("Yes"); 
    else
      System.out.println("No"); 
    sc.close(); 
  }
}
