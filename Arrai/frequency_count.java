package Arrai;

public class frequency_count {
    public static void main(String args[]){
        int a[]={1,2,3,4,1,2,3,4};
        int f[]=new int [a.length];
        for(int i=0;i<a.length;i++){
            int count =1;
            for(int j=1+i;j<a.length;j++){
                    if(a[i]==a[j]){
                        count++;
                    }
            }


            
        }

        
    }
}
