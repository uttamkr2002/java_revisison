package Arrai;

public class Identity {
   public static void main(String args[]){
     boolean isidentity=true;
     int a[][]={
        {1,0,0},
        {0,1,0},
        {0,0,1}
     };
     if(a.length!=a[0].length){
        isidentity=false;
     }

     for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            if((i==j)&&(a[i][j]!=1)){
                isidentity=false;
            }
            else if((i!=j)&&(a[i][j]!=0)){
                isidentity=false;
            }
        }
     }

     if(isidentity){
        System.out.println("it is identity matrix");
     }
     else{
        System.out.println("not an identity ");
     }
   } 
}
