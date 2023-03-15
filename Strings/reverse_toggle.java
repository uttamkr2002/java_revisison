package Strings;

public class reverse_toggle {
   public static void main(String args[]){
    String st = "this is javatpoint";
    String spl[] = st.split(" ");
    String reversetoogle =" ";
    for(String w : spl) {
        StringBuilder rev = new StringBuilder(w);
        rev.reverse();
        String first = rev.substring(0,1);
        String last = rev.substring (1);
        reversetoogle+=first+last.toUpperCase()+" ";
            }
            System.out.println(reversetoogle);
   } 
}
