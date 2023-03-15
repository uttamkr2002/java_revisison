package Arrai.ARRAI_REVISION;

public class find_frequency {
    public static void main( String args[]){
        int a[]={1, 2, 8, 3, 2, 2, 2, 5, 1};
        int f[]=new int [a.length];
        int count,visited=-1;
        for(int i=0;i<a.length;i++){
             count =1;
             for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    f[j] = visited;
                }
            
             }
             if(f[i]!=visited){
                f[i]=count; }
             }


        // displaying

        for(int i=0;i<f.length;i++){
            if(f[i]!=visited){
                System.out.println(f[i]);
            }
        }
    }
}
