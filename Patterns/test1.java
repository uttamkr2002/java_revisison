package Patterns;

public class test1 {

    public static void Inv_Rot( int row){

       for(int i=1;i<=row;i++){
        for(int j=1;j<=row-i;j++){
            // Spaces
            System.out.print( "_ ");
        }
        // for stars
        for(int k=1;k<=i;k++){
            System.out.print("*"+" ");
        }
        System.out.println(" ");
       }
    } 


    public static void Floyds(int row){
        int count= 0;
        for(int i=1;i<=row;i++){
          
            for(int j=1;j<=i;j++){
                count++;
                System.out.print( count+" ");
            } 
            System.out.println( " ");

        }
    }


    public static void  Zero_One(int row){
     int c = 0;
        // Outer Loop
        for(int i=1;i<=row;i++){

            // Inner Loop
            for(int j=1;j<= i;j++){
             c = (c == 0)? 1 :0;
             System.out.print( c+" ");
            }
            System.out.println( " ");
        }
    }


    public static void ButterFly(int row){

        for(int i=1;i<= row;i++){
           
            // inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            // for spaces
            for(int k=1;k<=(2*row)-2*i;k++){
                System.out.print("_"+" ");
            }
            // for again star
            for(int m =1;m<=i;m++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }

        // Just Oposite to above
        Just_Oposite(4);
    }

    public static void Just_Oposite(int row){

        for(int i=row;i>=1;i--){

            // 1 st Star
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            // Spaces
            for(int k=1;k<= (2*row)-(2*i);k++){
                   System.out.print("_"+ " ");
            }
            for(int m=1;m<=i;m++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
  
    public static void main(String args[]){
        Inv_Rot(4);
        Floyds(5);
        Zero_One(5);
        ButterFly(4);
    }

}
