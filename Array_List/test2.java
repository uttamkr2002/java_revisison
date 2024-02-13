package Array_List;
import java.util.*;

public class test2 {

    public static int Most_Water(ArrayList<Integer> height){
       int cur_h =0,cur_w = 0,cur_a =0,max_area = Integer.MIN_VALUE;
        for( int i=0;i<height.size();i++){
           int left = i;
            for(int j=height.size()-1;j >= 1;j--){
                int right = j;
                cur_h = Math.min(height.get(left),height.get(right));
                cur_w = right - left;
                cur_a = cur_h*cur_w;
                max_area = Math.max(max_area, cur_a);               

            }

        }
        return max_area;
    }
   
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(height);
        System.out.println(Most_Water(height));

    }
}
