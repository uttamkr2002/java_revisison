package Strings;
import java.text.SimpleDateFormat;
import java.util.Date;
public class String_to_date {
   public static void main(String args[]) {
   String sDate1 ="31/12/1998";
   Date date1 = new SimpleDateFormat("dd/MM/yyyy").prase(sDate1);
   System.out.println(sDate1+"\t"+date1);
   } 
}
