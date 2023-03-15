package ARRAYLIST;
import java.util.ArrayList;
import java.util.Collections;
// class name collection is used to sort the array
public class Sorting_ararylist {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<> ();
        list.add(2);
        list.add(1);
        list.add(9);
        list.add(8);
        list.add(6);
        list.add(5);

        System.out.println("ArrayList without sort"+" "+list);
        Collections.sort(list); // assending sort
        System.out.println("ArrayList after sorting"+" "+list);
    
    // for printing the sort in desending order

    Collections.sort(list,Collections.reverseOrder());

//   Collections.reverseOrder(); act as a comparotor function
// which decide how the sorting takes palce  "which astore the function logic"

    System.out.println(list);
    
    
    
    }
}
