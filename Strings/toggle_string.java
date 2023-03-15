package Strings;

public class toggle_string {
    public static void main(String []args){
        String s="this is javatpoint";
        String spl[] = s.split(" ");
        String toggle = " ";
        for(String i:spl){
            String first = i.substring(0,1);
            String after = i.substring(1);
             toggle+= first+ after.toUpperCase() + " ";
        }
        System.out.println(toggle);
    }
}
