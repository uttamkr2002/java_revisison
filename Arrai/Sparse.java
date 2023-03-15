package Arrai;

public class Sparse {
    public static void main(String args[]){
        // if most of the element are 0 then it is sparse matrix
      

        int a[][]={
            {4,0,0},
            {0,5,0},
            {0,0,6}};
        int count=0, total=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j< a[0].length;j++){
                total++;
                if(a[i][j]==0){
                    count++;
                }
            }
        }

        if(count>total/2){
            System.out.println("it is spare matrix");
        }
        else{
            System.out.println("it is not spare");
        }
    }
    
}
