package Strings;

public class Capitalize{
    public static void main(String [ ]args){
     String st ="this is javatpoint";
      String words[] =st.split("@");
      String CapitalizeWord="";
      for(String w:words){
        String first = w.substring(0,1);
        String after = w.substring(1);
        CapitalizeWord =first.toUpperCase()+after+" ";
      }
        System.out.println(CapitalizeWord.trim());
    }
}
