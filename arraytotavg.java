import java.util.*;
class ArrayTotAvg
{
public static void main(String args[])
{
int arr[]=new int[10];
int sum=0;
Scanner s=new Scanner(System.in);
System.out.println("enter no of  subjects");
int n=s.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("enter subject marks "+(i+1));

arr[i]=s.nextInt();

sum=sum+arr[i];
}
System.out.println("total="+sum);
int avg=sum/n;
System.out.println("average="+avg);

}

}