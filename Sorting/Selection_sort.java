package Sorting;

public class Selection_sort {

    public static void Print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }

    public static void selection_sort(int a[]){

        for(int i=0;i<a.length;i++){
            int min = i;
            for(int j=i+1;j<a.length;j++){

                if(a[min] > a[j]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] =a[i];
            a[i] = temp;
        }
        Print(a);
    }

    public static void main(String args[]){

        int a[]= {4,1,2,5,3};

        selection_sort(a);
    }
    
}
