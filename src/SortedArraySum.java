import java.util.Arrays;

public class SortedArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] 	= {-1,0};
		int target	= -1;
		int[] sumOfArray = sumOfArray(arr,target);
		System.out.println(Arrays.toString(sumOfArray));
		int[] twoSum = findTwoSum(arr, target);
		System.out.println("SUM :: "+Arrays.toString(twoSum));
	}

	private static int[] sumOfArray(int[] arr, int target) {
		int start 	= 0;
		int end		= start+1;
		int op[]	= new int[arr.length-1];		
		//int op[]	= {};	
		for (int i = 0; i < arr.length-1; i++) {			
			if(arr[start] + arr[end] == target) {
				System.out.println(arr[start] +" : "+ arr[end]);
				//return true;
				return new int[] { arr[start] , arr[end]};
			} 
			start++;
			end++;
				
		}
		return op;
	}

	
	private static int[] findTwoSum(int[] arr, int target) { 
		//2,7,11,15
		int start 	= 0;
		int end		= arr.length-1;
		//int sum;
		while (start < end) {
			int sum = arr[start] + arr[end] ;	//17
			
			if(sum == target) {			
				return new int[] { arr[start] , arr[end]};
			}
			else if( sum < target ){ // 17 < 9    	
				start++;
			}
			else {
				end--;
			}
			
		}		
		return null;
	}
}
