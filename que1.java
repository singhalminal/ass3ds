import java.util.Scanner;
class que1
{
public static void main(String[] args)
{
Scanner s1= new Scanner(System.in);
String str=s1.nextLine();
char[] arr=str.toCharArray();
int i,j,n;
n=str.length();
j=n-1;
for(i=0;i<n/2;i++)
{
char temp;
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
--j;
}
String ab=new String(arr);

if(ab.equals(str))
{
System.out.println("palindrome");

}
else
{
System.out.println(" not palindrome");
}
}
}