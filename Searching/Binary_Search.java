public class Binary_Search{


    public static int Binary_Sear(int a[], int key){

        // Iterartive approach
//  Time complexity 0(logn)
   


   int start = 0;
   int end = a.length-1;
   int mid = (start+end)/2;

   while(start < end){

   if(a[mid] == key){
    return mid;
   }
   if( a[mid] > key){
    end = mid-1;    
   }
   if( a[mid] < key){
    start =mid+1;
   }
   }
   return -1;

    }

    public static void main(String args[]){
        int a[] = {1,2,3,4};
        int key = 0;
        System.out.println(Binary_Sear(a,key));

     }
}