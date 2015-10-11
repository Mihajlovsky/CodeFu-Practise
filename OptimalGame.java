import java.util.Arrays;
import java.util.Collections;

/**
 *CodeFu Community 7 // 200 points 
 * Problem: http://codefu.mk/community7.html?subpage=problem&problemid=2306
 *
 * @author Mihajlovsky
 *
 */

public class OptimalGame {

	public static void main(String[] args) {
		int[] seraphim={24,39,45,41,46,3,9,27,11,35,9,48,12,0,44,45,5,0,45,41,45,43,19,37,37,1,2,16,43,38,30};
		int[] opponent={32,3,25,3,9,37,2,28,2,24,7,13,11,48,29,5,27,15,0,18,35,50,25,17,27,21,37,4,49,38,18};
		
		System.out.println(getMaxPoints(seraphim,opponent));

	}
	  public static int getMaxPoints(int[] team, int[] rivals)
	  {
		  int Count=0;
		  int n=0,m=0;
		  
		  Arrays.sort(team);
		  Arrays.sort(rivals);
		  
		  		  
		  while(n<team.length){
			  
			if (team[n]>rivals[m])
			{
				n++;
				m++;
				Count++;
				
			}
			else{
				n++;
			}
			
		  }
			
				  
		  return Count;
	  }
}
