import java.util.Scanner;
class prime
{
public static void main(String[ ] args)
{ 
System.out.println("Enter any number");
Scanner S=new Scanner(System.in);
int a=S.nextInt();

for(int i=1;i<=a;i++)
{
   int flag=1;
for(int j=2;j<i;j++)
{
   if(i%j==0)
{
flag++;
}
}
if(flag==1)
{
System.out.println(i);
}
}
}
}