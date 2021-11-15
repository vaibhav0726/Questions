import java.util.Scanner;
class String_q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int length=a.length();
		String b = "";
		char[] arr = a.toCharArray();
		for(int i=length-1;i>=0;i--)
		{
			b+=arr[i];
		}
		if(a.equals(b))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}