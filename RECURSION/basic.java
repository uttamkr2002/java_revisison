package RECURSION;
import java.util.*;
public class basic {
  
    public static void Decreasing_print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        else{
            System.out.println(n);
            Decreasing_print(n-1);
            }
    }



    // To print number in increasing order
    
    public static void Increasing_print(int n){
       // int i=1;
        if(n==1){
            System.out.println(n);
            return;
        }
        else{
            // System.out.println(i);
            Increasing_print(n-1);
        System.out.println(n);}
        }



        // Factorial

        public static int factorial( int n){
       if(n==1){
        return 1;
       }
       else
       return n*factorial(n-1);
        }
    

        // Sum of n natural number

        public static int Summof(int n){
           if(n==1){
            return 1;
           }
           else{
            return n+Summof(n-1);
           }
        }



        // Print nth fibonacci

        public static int Fact(int n){
            if(n==0||n==1){
               // System.out.println(n);
              return n;  
            }
            else{
                int f1=Fact(n-1);
                int f2= Fact(n-2);
              
              return f1+f2;
            }
        }



        public static boolean isSorted(int a[],int i){
          if(i==a.length-1){
            return true;
          }
          if(a[i] > a[i+1]){
            return false;
          }
          return isSorted(a , i+1);
        }
    

        // last occurance of element

    public static int last_occur(int a[],int i,int k){
      if(a[i]==k){
        return i;
      }
       return last_occur( a, i+1,k);
    }    

   public static void main(String [ ] args){
    //   Decreasing_print(10);
    //    Increasing_print(10);
    //    System.out.println(factorial(5));
    //    System.out.println(Summof(10));
      // System.out.println(Fact(50));
        int brr[] =  {1,2,3,4,3};
       System.out.println(isSorted(brr,0));
       System.out.println(last_occur(brr,0,3));

   } 
}
