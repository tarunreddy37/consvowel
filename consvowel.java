import java.util.*;
class consvowel
{
public static void main(String args[])
{
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a character:");
	ch=sc.next().charAt(0);
	switch(ch)
	{
		case 'a': 
		case 'e':
		case 'i':
		case 'o':
		case 'u': System.out.println("vowel character.");break;
		default:System.out.println("consonant character.");
	}
}
}