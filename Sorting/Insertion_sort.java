package Sorting;

public class Insertion_sort {

    public static void Print(int a[]){
        System.out.println("Hi");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }


    public static void insertion_sort(int a[]){
        System.out.println("Hi");

        for(int i=1;i<a.length;i++){
            System.out.println("Hi _ I am Inside");
            int j=i-1;
            int temp = a[i];

            while(j>=0  && temp <= a[j]){
                a[j+1] = a[j];
            }
            a[j] = temp; 
            // Print(a);         

        }
        Print(a);

    }
    

    public static void main(String args[]){
        System.out.println("Hi");
        int a[] = {6,1,3,5,9,0};
           Print(a);
        insertion_sort(a);

    }
}
