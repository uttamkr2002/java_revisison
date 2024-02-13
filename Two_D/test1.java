package Two_D;

public class test1 {
   

    public static void Spiral_Matrix(int a[][]){

       int start_row = 0;
       int start_cols = 0;
       int end_row = a.length;
       int end_cols =a.length ;

    //    top
       for(int j=start_cols;j<end_cols;j++ ){

        System.out.print(a[start_row][j] +" " );
       }

    //    right
    for(int i=start_row;i<end_cols;i++){

        System.out.print( a[]);
    }

    }
    
    public static void main(String args[]){
        int a[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        Spiral_Matrix(a);
    }
}
