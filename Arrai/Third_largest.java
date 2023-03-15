package Arrai;

public class Third_largest {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int first,second,third;


        if(a.length==1){
        first=a[a.length-1];
        System.out.println("largest will be"+first);
        }


        else if (a.length==2){
            if(a[0]>a[1]){
                first=a[0];
                second=a[1];
            }
            else{
                second=a[0];
                first=a[1];
            }
        }
          
        else{
            for(int i=0;i<a.length-1;i++){
               first=a[0];
                for( int j=i+1;j<a.length;i++){
                        if(a[i]<a[j]){
                            first=a[j];
                            second=a[i];
                        }
                }
            }
            System.out.println(first+" "+second);

        }

       
    }
}
