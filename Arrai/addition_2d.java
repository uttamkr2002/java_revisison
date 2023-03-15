package Arrai;
import java.util.*;
public class addition_2d {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a2[][]= new int[3][2];
        int a3[][]={{1,2},{3,4},{5,6}};
        int c3[][]= new int[3][2];
        System.out.println("scanning 1 array");
        for(int i=0;i<a2.length;i++){
            for(int j=0;j<a2[0].length;j++){
              a2[i][j]=sc.nextInt();
            
            }
          }


         if(a2.length==a3.length  && a2[0].length== a3[0].length){
            for(int i=0;i<a2.length;i++){
                for(int j=0;j<a2[0].length;j++){
                  
                  c3[i][j]=a2[i][j]+a3[i][j];
                }
              }
         }

        //  for printing sum
        System.out.println("sum of the array");
        for(int i=0;i<c3.length;i++){
            for(int j=0;j<c3[0].length;j++){
              System.out.print(c3[i][j]+ " ");
              
            }
            System.out.println();
          }

    }
}
