package ARRAYLIST;
import java.util.*;

public class swap {
  
    
    public static void swapy(ArrayList<Integer> list,int ind1,int ind2){
        int temp = list.get(ind1);
        list.set(ind1, list.get(ind2));
        list.set(ind2,temp);
    }


public static void main(String [] args){
ArrayList<Integer> list = new ArrayList<> ();
list.add(1);
list.add(5);
list.add(6);
list.add(8);
list.add(0);

System.out.println(list);

swapy(list,1,3);
System.out.println("after the swap"+" "+list);


}
}