// Given a string and an int n, return a string made of n repetitions of the last n characters of the string. 
// You may assume that n is between 0 and the length of the string, inclusive. 
// For example, if the inputs are “Niraj” and 3, then the output should be “rajrajraj.

import java.util.Scanner;
public class String_q5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int n = sc.nextInt();
        s1 = s1.substring(s1.length()-n);
        for(int i=0;i<n;i++)
        {
            System.out.print(s1);    
        }
    }
}
