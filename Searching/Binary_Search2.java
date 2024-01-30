public class Binary_Search2 {
   
    public static  int Binary_Search(int a[], int key, int start, int end){

        int mid = (start+end)/2;

        if( start < end){
            return -1;
        }
          
        if(a[mid] == key){
            return mid;
        }

        if(a[mid] > key){
            // left hand side
            end = mid-1;
            Binary_Search(a, key, start, end);
        }
       if(a[mid]< key){
        start = mid+1;
        Binary_Search(a, key, start, end);
       }

       return -1;  
    //    ?? How can I solve this ??

    }
    
    public static void main(String args[]){
      int a[]= {1,2,3,4,5};
      int key = 0;
      System.out.println(Binary_Search(a,key,0,a.length-1));
    }
}
