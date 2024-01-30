package Sorting;

public class Bubble_sort {


    public static void Print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }

    public static void bubble_sort(int a[]){

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){

                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        Print(a);
    }


    public static void main(String args[]){

        int a[] = {4,2,5,1,7};

        bubble_sort(a);
        
    }
    
}
