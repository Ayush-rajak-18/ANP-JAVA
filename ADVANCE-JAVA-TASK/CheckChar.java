
//Q9. 1. Check whether the character is alphabet or not
// 2. If character is alphabet then check if it is in lower case or upper case
//3. If it is in upper case then convert it into lower case
//4. Check if it is vowel or not

import java.util.Scanner;
class CheckChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a character :");
		char ch=sc.next().charAt(0);
		
		char r=
		(ch>='A' && ch<='Z')  || (ch>='a' && ch<='z')?
		(ch>='A' && ch<='Z')?(char)(ch+32):ch
		: '0';

		System.out.println(r=='0' ? "Provided value is not an alphabet":"Result : "+r);

		System.out.println(r=='a' || r=='e' || r=='i' || r=='o' || r=='u'? ch+" is a vowel" : ch+" is not a vowel");

	}
}
