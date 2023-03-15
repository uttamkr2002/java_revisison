package SORTING;

public class basicsorting {
   public static void  buuble_sort(int a[]){
    System.out.println("welcomes you in bubble sort");

    for(int i=0;i<a.length-1;i++){
        for(int j= 0;j<a.length-i-1;j++){
           if(a[j]> a[j+1]){
           int  temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
           }
        }
    }

    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
   } 


   public static void selection_sort(int a[]){
    

    for(int i=0;i<a.length-1;i++){
        int smallest = i;
        for(int j=i+1;j<a.length;j++){
            if(a[smallest]>a[j]){
                smallest=j;
            }
        }
           int  temp = a[smallest];
            a[smallest]= a[i];
            a[i]=temp;
        
    }

    for(int i=0;i<a.length;i++){
        System.out.println( a[i]+" ");
    }
   }


   public static void insertion_sort(int a[]){
  
   }



   public static void main(String args[]){
    int a[]={1,3,5,4,2};
    // selection_sort(a);
    insertion_sort(a);
    // buuble_sort(a);

   }
}
