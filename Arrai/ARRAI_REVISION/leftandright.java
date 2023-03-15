package Arrai.ARRAI_REVISION;

public class leftandright {

    public static int [] left_rotate(int a[], int n){
        int i,j,front;
        for(i=0;i<n;i++){
            front =a[i];
            for(j=0;j<a.length-1;j++){
               a[j]=a[j+1];
            }
            a[j]=front;
           }
           return a;

    }



    // rotate right

    public static int [] right_rotate( int []a, int n){
        int i,j,back;
        
        for(i=0;i<n;i++){
            back = a[a.length];
            for(j = a.length-1; j > 0; j--){    
                //Shift element of array by one    
                a[j] = a[j-1];    
            } 
        a[0]=back;
        }
        return a;
    }
  public static void main(String [] args){
    int a[]={1,2,3,4,5};
    int n=2;
    int b[]=right_rotate(a,n);
    for( int  i=0;i<b.length;i++){
        System.out.println(b[i]);
    }
  }  
}
