package Strings;
import java.util.*;
public class test1 {

    public static void Palin_drome(String check){

        for(int i=0;i<check.length()/2;i++){
           char first = check.charAt(i);
           char last  = check.charAt(check.length()-1);
           int first_ind = i;
           int last_ind = check.length()-1;

           
           check.setCharAt(first_ind,first);

           check. 


        }
    }

    public static void Shortest_Path(String S){

        int w=0;
        int s =0;
        int n = 0;
        int e = 0;

        int x=0;
        int y=0;

        

    }
    

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String check = sc.nextLine();

        // Palin_drome(check);
        Shortest_Path(check);

    }
}
