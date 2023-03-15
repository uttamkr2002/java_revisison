package Strings;

public class StringBuilder_java {
    public static void main(String args[])
{
StringBuilder name= new StringBuilder("uttam");
name.append("kumar");
System.out.println(name);
System.out.println(name.insert(0,"Er " ));
System.out.println(name.delete(8, 13));
System.out.println(name.replace(0,2,"CTO"));
System.out.println(name.reverse());

}

}
