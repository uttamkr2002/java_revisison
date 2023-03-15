package ARRAYLIST;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class max_min {
    

public static int maxy(ArrayList<Integer> list) {
    int max= Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
        if (max<list.get(i)){
            max=list.get(i);
        }
    }
    return max;
}



public static int miny(ArrayList<Integer> list ){
    int min = Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
        if(min> list.get(i)){
         min= list.get(i);
        }
    }
    return min;
}
public static void main(String [] args){
ArrayList<Integer> list = new ArrayList<> ();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);

System.out.println("Maximum value in Array List:"+maxy(list));
System.out.println("Minumum value in Array List"+miny(list));


}
}
