package Array_List;
import java.util.*;
public class test1 {

    public static void Swap(int id1, int id2, ArrayList<Integer> a){
        int temp = a.get(id1);
        a.set(id1,a.get(id2) );
        a.set(id2,temp);
    }
    

    public static void main(String args[]){

        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(5);
        a.add(9);
        a.add(3);
        a.add(6);
        System.out.print(a);
        Swap(1,3,a);
        System.out.println(a);
    }
}
