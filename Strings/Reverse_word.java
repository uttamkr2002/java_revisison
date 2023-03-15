package Strings;

public class Reverse_word {
   public static void main(String args[]){
    String st ="this is javatpoint";
    String sp [] = st.split(" ");
    String rever =" ";
    for(String i :sp){
        StringBuilder re = new StringBuilder(i);
        re.reverse();
      rever += re+ " ";

    }
   System.out.println(rever);

   } 
}
