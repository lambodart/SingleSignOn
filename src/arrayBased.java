import java.util.Arrays;
import java.util.Iterator;

public class arrayBased {

	private static void SortStudentsMarks(int m, int s, int[][] input) {
		// TODO Auto-generated method stub
		double avg []= new double[s];
		int av= 0;
		//int sum=0; //sum :: 1131 avg :: 377.0 array :: [73.0, 153.0, 223.0, 296.0, 377.0]
		//calculating avg 
		for (int i = 0; i < s; i++) {
			int sum=0;	//avg :: 80.0 array :: [73.0, 79.0, 70.0, 73.0, 80.0]
			
			for (int j = 0; j < m; j++) {
				sum += input[j][i];
				}
			av = (int)sum/m;
			avg[i] = sum/m;
		}
		
		
		//index of student less avg
		double lowIndex =avg[0];
		double lowestIndex = 0;
		for (int i = 1; i < avg.length; i++) {
			//73.0, 79.0, 70.0, 73.0, 80.0
			// 79 > 73 70 > 73
			if (avg[i] < lowIndex ) {
				lowIndex = avg[i];
				lowestIndex = i;
			}
		}
		//store total mrk each st exc low
		double finalAvgMarks[]= new double[m];
		for (int i = 0; i < m; i++) {
			int total = 0;
			for (int j = 0; j < s; j++) 
			{	
				//System.out.println("total :: "+total);
				if (j != lowestIndex) {	
					total += input[i][j];
				}
				
			}
			finalAvgMarks[i] = total;
			System.out.println("total End:: "+total);
		}
		
		System.out.println("finalAvgMarks :: "+ Arrays.toString(finalAvgMarks));
		System.out.println("avg :: "+av+ " array :: " + Arrays.toString( avg));
		System.out.println("Lowest Avg Marks :: "+lowIndex + " LowestIndex : "+lowestIndex);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3;
		int s=5;
		
		int [][] input = {
			   //m
		/* s */
				{75,76,65,87,87},
				{78,76,68,56,89},
				{67,87,78,77,65}
		};
		System.out.println(" i :: "+input[0][0] + " i :: "+input[0][1] + " i :: "+input[0][2]+" i :: "+input[0][4]);
		System.out.println(" i :: "+input[1][0] + " i :: "+input[1][1] + " i :: "+input[1][2]+" i :: "+input[1][4]);
		System.out.println(" i :: "+input[2][0]);
		SortStudentsMarks(m,s,input);
	}
}
