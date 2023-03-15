package Arrai;

public class Transpose {
    public static void main(String args[]){
    int a[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9}
         };
     int i;
      int b[][]= new int[3][3] ;
      for( i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            b[i][j]=a[j][i];
        }
      } 
      
      
      for( i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            System.out.print(b[i][j]+ " ");

}
System.out.println();
      }

    }
}
