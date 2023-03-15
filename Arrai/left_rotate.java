package Arrai;

public class left_rotate {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};

    //  1,2,3,4,5  for(0 to len-1)
    //2,3,4,5,1   a[i]=a[i+1];   // a[i]=first;


        // code for left rotate

        // int n=3, first,j;
        // for(int i=0;i<n;i++){
        //      first = a[0];
        //   for( j=0;j<a.length-1;j++){
        //     a[j]=a[j+1];
        //   }
        //   a[j]=first;
        // }


        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }


        // code for right rotate

        //1,2,3,4,5
        //5,1,2,3,4
        //4,5,1,2,3
        //3,4,5,1,2

        int last,m=3,j;
        for(int i=0;i<m;i++){
            last=a[a.length-1];
            for(j=a.length-1;j>0;j--){
             a[j]=a[j-1];
            }
            a[0]=last;
        }

    
        System.out.println("printing ");
        for( j=0;j<a.length;j++)
        System.out.print(a[j] + " ");
    }
}

