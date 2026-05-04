/*
You know that 1 kg of pulp can be used to make1000 pages and1 notebook 
consists of 100 pages.
Suppose a notebook factory receives N kg of pulp, how many notebooks can be 
made from that?
*/

import java.util.*; 

public class NumberOfBook {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 

    System.out.println("Number of pulps: ");
    int X = sc.nextInt(); 

    int totalNoteBooks = (X * 1000) / 100; 

    System.out.println("Total Notebooks: " + totalNoteBooks); 

    sc.close(); 
  }
}
