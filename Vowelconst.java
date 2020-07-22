class Vowelconst
{
public static void main(String[] args)
{
String str="program";
int vowles=0,constants=0;
str=str.toLowerCase();
for(int i=0;i<str.length();++i)
{
char ch=str.charAt(i);
 if(ch == 'a' || ch=='e' || ch == 'i' || ch=='o' || ch == 'u')
{
++vowles;
}
else
{
++constants;
}
}
System.out.println( + vowles  +"vowles");
System.out.println(+constants +"constants");
}
}
