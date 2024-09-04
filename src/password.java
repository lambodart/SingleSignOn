
public class password {

	private static int getCount(String pwd) {
		char[] charArray = pwd.toCharArray();
		int countFlips =0;
		//101101
		for (int i = 0; i < charArray.length; i+=2) {
			
			if (charArray[i] !=  charArray[i+1]) {
				countFlips++;
			}
		}		
		return countFlips;		
	}
	
	public static void main(String[] args) {
		String pwd="101001";
		int count = getCount(pwd);
		System.out.println("Count :: "+count);		
	}
}
