package Arrai;
import java.util.*;
public class declaration_Arrai {
  public static void main(String []args) {
    // declaration of array in defferent ways
    int a[]={1,2,3,4,5};
    int b[] = { 1,2,3,4,5};

    // it will  be length not length();
    for(int i=0;i< a.length;i++){
    System.out.println(a[i]);}

    for(int j=0;j<b.length;j++){
        System.out.println(b[j]);}


        // for input the arary
        Scanner sc = new Scanner(System.in);
        int c []=new int[5];
        for(int m=0;m<c.length;m++){
             c[m]=sc.nextInt();}


            for(int m=0;m<c.length;m++){ 
              System.out.println(c[m]);}

              // intializing 
              int [] arr=new int [3];
              arr[0]=100;
              arr[1]=200;
              arr[2]=300;
              for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
              }







    // a special kind of for loop
    int a1[]={1,2,3,4};
    for(int i:a1)
    System.out.println(i);// it prints 1,2,3,4

    // declaration and intialization of 2d array
     int a2[][]=new int [3][2];
     int a3[][]={
                  {1,2,3},
                  {4,5,6}
                         };
      // to input 2D array
      for(int i=0;i<a2.length;i++){
        for(int j=0;j<a2[0].length;j++){
          a2[i][j]=sc.nextInt();
          
        }
      }


 
  } 
}
