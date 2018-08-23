import java.util.Scanner;
class armstrong
{
public static void main(String[] args)
{
Scanner S=new Scanner(System.in);
System.out.println("Enter any number");
int num=S.nextInt();
int c=0,sum=0,rem,temp;
temp=num;
while(num!=0) 
{
num=num/10;
++c;
}
while(num!=0)
{
rem=num%10;
sum+=Math.pow(rem, c);
num=num/10;
}
if(sum==temp)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not an Armstrong Number");
}
}
}