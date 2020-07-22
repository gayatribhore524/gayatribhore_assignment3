import java.util.HashMap;
import java.util.Scanner;
public class Nonrepeated
{
public static void main(String args[])
{
System.out.println("enter a string:");
Scanner sn=new Scanner(System.in);
String s=sn.nextLine();
char c=firstNonRepeatedCharacter(s);
System.out.println("first non repeated character:"+c);
}
public static Character firstNonRepeatedCharacter(String str)
{
HashMap<Character,Integer>cha=new HashMap<Character,Integer>();
int j,len;
Character c;
len=str.length();
for(j=0;j<len;j++)
{
c=str.charAt(j);
if(cha.containsKey(c))
{
cha.put(c,cha.get(c)+1);
}
else
{
cha.put(c,1);
}
}
for(j=0;j<len;j++)
{
c=str.charAt(j);
if(cha.get(c)==1)
return c;
}
return null;
}
}