package Array_List;

import java.util.ArrayList;

public class test3 {
    
    public static void Pair_Sum(ArrayList<Integer> l, int target){

        int left = 0;
        int Right = l.size()-1;

        while(left < Right){

            if(l.get(left)+l.get(Right) == target){
              System.out.println(l.get(left));
              System.out.println(l.get(Right));
              return;
            }
            else{
                if(l.get(Right) >= target){
                    Right--;
                }
                if(l.get(left)+l.get(Right) < target){
                    left++;
                }
            }

        }
        System.out.println("No Pair Found");
    }

    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Pair_Sum(list, 44);

    }
}
