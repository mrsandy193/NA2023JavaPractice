//Write a program to check two different strings equality.

package stringMenupulation;

public class StringComparison {
	
	public boolean compareString1(String s1, String s2)
	{
		if(s1.equals(s2))
			return true;
		else 
			return false;
	}
	
	public boolean compareString2(String s1, String s2)
	{
		boolean flag = true;
		
		if(s1 == null || s2 == null)
			return false;
		
		if(s1.length() != s2.length())
			return false;
		
		for (int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String args[])
	{
		String s1 = "sas";
		String s2 = "sasg";
		StringComparison c = new StringComparison();
		boolean result = c.compareString1(s1, s2);
		if(result)
			System.out.println("Strings '" + s1 + "' and '" + s2 + "' is equal." );
		else
			System.out.println("Strings '" + s1 + "' and '" + s2 + "' is not equal." );
		
		s1 = null;
		s2 = "fasg";
		result = c.compareString2(s1, s2);
		if(result)
			System.out.println("Strings '" + s1 + "' and '" + s2 + "' is equal." );
		else
			System.out.println("Strings '" + s1 + "' and '" + s2 + "' is not equal." );
	}
}