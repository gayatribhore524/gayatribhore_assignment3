import java.util.Scanner;
class Pallindrome
{
public static void main(String args[])
{
String s,rev="";
Scanner in=new Scanner(System.in);
System.out.println("enter string:");
s=in.nextLine();
int len=s.length();
for(int i=len-1;i>=0;i--)
rev=rev+s.charAt(i);
if(s.equals(rev))
System.out.println(" true       "+ s +"is a pallindrome");
else
System.out.println(" false      "+ s +"is not  a pallindrome");
}
}
