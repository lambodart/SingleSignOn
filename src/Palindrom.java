import java.util.Arrays;

public class Palindrom {

	static boolean isPal(String str) {
		char[] charArray = str.toCharArray();
		System.out.println("String :: "+str+ " Char :: "+ Arrays.toString(charArray) + " Length :" +charArray.length);
	
		int start = 0;
		int end = charArray.length -1;
		
		while(start < end)
		{
			if (charArray[start] != charArray[end]) {
				return false;
			}
			start += 1;
			end -= 1;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "assa";
		boolean pal = isPal(str);
		if (pal) 
			System.out.println("Pal");
		else
			System.out.println("Not Pal");
	}

	
}
