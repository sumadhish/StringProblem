package jUnitTest;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString = "Madhavi Karna";
		String replacedString = "";
		char ch = 'a';
		String str2BeRemoved = "a";
		
		RemoveChar rcl = new RemoveChar();
		replacedString = rcl.removeOneCharViaLooping(originalString, ch);
		
		System.out.println("Replaced String using char method = " + replacedString);
		
		replacedString = rcl.removeUsingStringMethods(originalString, str2BeRemoved);
		
		System.out.println("Replaced String using String Methods = " + replacedString);
	}
	
	protected String removeOneCharViaLooping(String str, char c)
	{
		String tempStr = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == c)
				continue;
			else
				tempStr += str.charAt(i);
		}	
		
		return tempStr;
	}
	
	protected String removeUsingStringMethods(String str, String c)
	{
		String tempStr = "";
		
		tempStr = str.replace(c, "");
		
		return tempStr;
	}
}
