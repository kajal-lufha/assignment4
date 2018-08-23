import java.util.Scanner;
class even
{
public static void main(String[] args)
{
Scanner S=new Scanner(System.in);
System.out.println("Enter any number");
int a=S.nextInt();
for(int i=0;i<=a;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}

