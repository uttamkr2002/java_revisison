package Arrai;

public class count_evenodd {
    public static void main(String args[]){
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
             };
             int even=0,odd=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        } 
        
        System.out.println("total count of even"+ even);

        System.out.println("total count of odd"+ odd);

}
}