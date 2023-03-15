package Arrai;

public class clone_ofarrai {
    public static void main(String [] args){
        



        // Since, Java array implements the Cloneable interface, we can create the clone of the Java array. If we create the clone of a single-dimensional array, it creates the deep copy of the Java array. It means, it will copy the actual value. But, if we create the clone of a multidimensional array, it creates the shallow copy of the Java array which means it copies the references.
        int a[]={1,2,3,4};
        System.out.println("printing the actual array");
        for( int i:a)
        System.out.println(i);
        int b[]=a.clone();
        System.out.println("printing the clone" );
        for(int i:b)
        System.out.println(i);

        System.out.println(a==b);





        int a1[][]={{1,2,3},{4,5,6}};
        for(int i=0;i<a1.length;i++){
        for(int j=0;j<a1[0].length;j++){
        System.out.print(a1[i][j]);}
        System.out.println();
        }
          

        int b1[][]=a1.clone();
        for(int i=0;i<b1.length;i++){
            for(int j=0;j<b1[0].length;j++){
            System.out.print(b1[i][j]);}
            System.out.println();
            }

            System.out.println(a1==b1);
    }
}

