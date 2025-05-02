import java.util.*;
class usernameExp extends Exception
{
usernameExp(String s)
{
super(s);
}
}
class passwordExp extends Exception
{
passwordExp(String s)
{
super(s);
}
}
class authentication
{
public static void main(String args[])
{
String str1="password@123";
Scanner sc=new Scanner(System.in);
try
{
System.out.println("enter the username");
String str=sc.nextLine();
if(str.length()<6)
{
throw new usernameExp("invalid username");
}
try
{

System.out.println("enter the password:");
String str2=sc.nextLine();
if(str2.equals (str1))
{

System.out.println("authentication successfull");
}
else
{
throw new passwordExp("invalid password");
}
}
catch(passwordExp e)
{
System.out.println(e);
}
}
catch(usernameExp e)
{
System.out.println(e);
}
}
}


