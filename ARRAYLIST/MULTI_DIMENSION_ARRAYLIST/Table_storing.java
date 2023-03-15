package ARRAYLIST.MULTI_DIMENSION_ARRAYLIST;
import java.util.ArrayList;
public class Table_storing {
   public static void main(String args[]){
    ArrayList<ArrayList<Integer>> mainlist= new ArrayList<>(); 
     

    // Creating sublist
    ArrayList<Integer> list1 = new ArrayList<> ();
    ArrayList<Integer> list2 = new ArrayList<> ();
    ArrayList<Integer> list3 = new ArrayList<> ();

    for(int i=1;i<=5 ;i++){
        list1.add(i);
        list2.add(i*2);
        list3.add(i*3);
    }

    mainlist.add(list1);
    mainlist.add(list2);
    mainlist.add(list3);



    System.out.println(mainlist);


    // for printing in loop 

    for(int i=0;i<mainlist.size();i++){
        ArrayList<Integer> temp = mainlist.get(i);
        for(int j=0;j< temp.size();j++){
            System.out.print(temp.get(j)+" ");
        }
        System.out.println();
    }




    // here we can do jagron array also
   } 
}
