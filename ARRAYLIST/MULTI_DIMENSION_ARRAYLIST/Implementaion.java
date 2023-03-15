package ARRAYLIST.MULTI_DIMENSION_ARRAYLIST;
import java.util.*;
public class Implementaion {
  public static void main(String args[]){
    ArrayList<ArrayList<Integer>> mainlist = new ArrayList<> ();

    // now generate  new objects for sublist or rows 
    ArrayList<Integer> list1 = new ArrayList<> ();
    list1.add(1);
    list1.add(2);
    // list1.add(5);
    // list1.add(9);

    // now inser this list in main list
   mainlist.add(list1);

//    now add more list to mainlist
ArrayList<Integer> list2 = new ArrayList<> ();
list2.add(3);
list2.add(2);
// list2.add(7);
// list2.add(4);

mainlist.add(list2);



//  for printing the mainlist

for(int i=0;i<mainlist.size();i++){
//    now for accessing the lists
  ArrayList<Integer> temp = mainlist.get(i);
  for(int j=0;j<temp.size();j++){
    System.out.print(temp.get(j)+" ");
  }
  System.out.println();
}


System.out.println(mainlist);
}  
}
