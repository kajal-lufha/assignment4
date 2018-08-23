import java.util.Scanner;
class reverse
{
public static void main(String[] args)
{
Scanner S=new Scanner(System.in);
int rem;
int rev=0;
System.out.println("enter any number");
int a=S.nextInt();
while(a!=0)
{
rem=a%10;
rev=((rev*10)+rem);
a=a/10;
}
System.out.println("Reverse of the number is:"+rev);
}
}



