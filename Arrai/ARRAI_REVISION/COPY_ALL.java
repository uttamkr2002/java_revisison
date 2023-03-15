package Arrai.ARRAI_REVISION;

public class COPY_ALL {
    public static void main(String [] args){
        int a []={1,2,3,4,5};
        int b[]= new int [a.length];

        // copy functio 
    System.arraycopy(a, 1, b, 0, 4);
   System.out.print("copying");
   for(int i=0;i<b.length;i++)
    System.out.print(b[i]+" ");

System.out.print("cloning");
    int c[]= a.clone();
    for(int i=0;i<c.length;i++)
    System.out.print(c[i]+" ");

System.out.println("index coping");
   int d[]= new int [a.length];
   for(int i=0; i<a.length;i++){
          d[i]=a[i];
   }
     
   for(int i=0; i<d.length;i++){
    System.out.print(d[i]+" ");
   }

    }
}
