import java.util.Scanner;
class pattern
{
static public void main(String[] args)
{
Scanner S=new Scanner(System.in);
System.out.println("Enter number of rows");
int n=S.nextInt();
for(int i=0;i<n;i++)
{
for(int j=n;j>i;j--)
{
System.out.print("*");
}
System.out.print("\n");
}
}
}
