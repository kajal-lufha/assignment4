import java.util.Scanner;
class findelement
{
public static void main(String[ ] args)
{
int flag=0;
int[] arr=new int[]{1,4,6,7,8,9,10};
System.out.print("enter any number to find");
Scanner S=new Scanner(System.in);
int n=S.nextInt();
for(int j=0;j<arr.length;j++)
{
if(arr[j]==n)
{
flag=1;
}
}
if(flag==1)
{
System.out.print("found");
}
else
{
System.out.print("not found");
}
}
}

