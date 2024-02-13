package Arrays;
import java.util.*;
public class test1 {

    public static void Elements(int a[]){
        int la = Integer.MIN_VALUE;
        int se_la = Integer.MIN_VALUE;
        int th_la = Integer.MIN_VALUE;

        for(int i=0;i<a.length-1;i++){

            if(a[i] > a[i+1]){
                  la = a[i];
            }
            if( la < se_la){
                la = se_la;
            }
            if(se_la < th_la){
                se_la = th_la;
            }

        }
        System.out.println("Largest="+ la);
        System.out.println("Second Largest ="+ se_la);
        System.out.println("Third Largest ="+ th_la);
    }

    public static void Print(int a[]){

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }

    public static void Reverse(int a[]){

        for(int i=0;i<a.length/2;i++){
           int temp = a[i];
           a[i] = a[a.length-i-1];
           a[a.length-i-1] = temp;
        }
        Print(a);
    }
   

    // Pairs
    public static void Pairs(int a[]){

        for(int i=0;i<a.length;i++){
            
            for(int j=i+1;j<a.length;j++){
                System.out.print("("+a[i] + " " + a[j]+")");
            }
            System.out.println(" ");
        }
    }

    public static void Sub_array(int a[]){

        for(int i=0;i<a.length;i++){
            int start = i;
            for(int j=0;j<a.length;j++){
                int end = j;

                for(int k= start;k<=end;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println(" ");
            }
        }
    }

    public static void Max_Sub_array(int a[]){

        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;



        for(int i=0;i<a.length;i++){
            int start = i;
            for(int j = i+1;j<a.length;j++ ){
                int end = j;
                 curr_sum = 0;
                for(int k= start;k<=end;k++){
                    curr_sum += a[k];
                }
                max_sum = Math.max(max_sum,curr_sum);                     
            }
        }
        System.out.println(max_sum);
    }

    public static void Prefix_array(int a[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        // Creating a prefix array
        int prefix[] = new int [a.length];
        prefix[0]= a[0];

        // put the values in prefix array 
        for(int i=1;i<a.length;i++){

            prefix[i] = prefix[i-1]+a[i];            
        }

        for(int k =0; k<a.length;k++){
            int start = k;
             curr_sum =0;
            for(int m=k+1;m<a.length;m++){
                int end = m;

                curr_sum = (start==0) ? prefix[end] : prefix[end] -prefix[start-1];

            }
            max_sum =   Math.max(curr_sum,max_sum);
        }
        System.out.println("Max sum will be"+ max_sum);
    }

    public static void kadnesh(int a[]){

        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){

            curr_sum += (a[i] >= 0)? a[i] : 0; 
            max_sum = Math.max(max_sum, curr_sum);

        }
        System.out.println(max_sum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();

        int a[] = new int[size];

        for(int i=0;i<a.length;i++){
            System.out.print("Entering the element at index = "+i +" ");
            a[i] = sc.nextInt();
        }

        // Elements(a);
        // Reverse(a);
        // Pairs(a);
        // Sub_array(a);
        // Max_Sub_array(a);
        // Prefix_array(a);
        kadnesh(a);



    }
}
