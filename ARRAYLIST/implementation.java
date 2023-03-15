package ARRAYLIST;
import java.util.*;

// how is array list differtent from array?
// arrays have fixed length whereas arraylist have dynamic length
// arrays have primitive integer and arraylist have dynamic size
public class implementation {
    
public static void main(String args[]){
    ArrayList <Integer> list1= new  ArrayList<> ();
    ArrayList <String> list2 = new ArrayList<> ();
    ArrayList <Boolean> list3 = new ArrayList<>();


    list1.add(1);// O(n)
    list1.add(2);// O(n)
    list1.add(3);// O(n)
    list1.add(4);// O(n)

    System.out.println(list1);


    // having function
    // ArrayList .add();//o(1)
    // ArrayList.remove(index); //o(n)
    // ArrayList.set( index, value);//O(N);
    //ArrayList.get(index);//o(1);



    // list.size();  gives the length of array list


    // this is similsr to adding element at that index and shifting element at further index
    list1.add(1,9);  // O(n);
    System.out.println(list1);

   list1.remove(2);  //O(n)
   System.out.println(list1);


   System.out.println(list1.size());  // 4

   list1.set(2, 8);
   System.out.println(list1);

   System.out.println(list1.get(1));


   System.out.println(list1.contains(1));
   System.out.println(list1.contains(11)); 

 



//    for(int i=0;i<list1.size();i++){
//     System.out.println(list1.get(i));
//    }


   // for(int i= list1.size()-1;i>=0;i--){
   //  System.out.println(list1.get(i));
   // }


   int max = Integer.MIN_VALUE;
   for(int i=0;i< list1.size();i++){
      if(max <list1.get(i)){
         max= list1.get(i);

      }
     // System.out.println(max);
   }
 


   

}
}