package Arrai;

import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;

public class lower_upper_triangular {
   public static void main(String args[]){
    int a[][]={
        {1,2,3},
        {4,5,6},{7,8,9}};
    

        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[0].length;j++){
        //         if(j>i){
        //             a[i][j]=0;
        //         }
        //     }
        // }

        // // for printing lower

        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[0].length;j++){
        //         System.out.print(a[i][j]+" ");
        //         }System.out.println();
        //     }
        // }

//for printing upper
for(int i=0;i<a.length;i++){
    for(int j=0;j < a[0].length;j++){
        if(i>j){
            a[i][j]=0;
        }
    }
}


// for printing
for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            System.out.print(a[i][j]+" ");
            }System.out.println();
        }
    }

}

