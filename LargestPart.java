/**
 *CodeFu Seasonal 2015 Winter // 100 points 
 * http://codefu.mk/codefu2015winter.html?subpage=problem&problemid=2145
 *
 * @author Mihajlovsky
 *
 */

public class LargestPart {

	public static void main(String[] args) {
		
		int[] nums={-95,205,669,32,-210,-765,3,-48,748,-248,79,467,-57,339,410,-793,460,-534,124,257,177,-66,0,-834,-454,-337,967,-312,25,163,791,551,-603,-128,-133,-232,365,-505,-66,845,-292,980,-939,282,207,-316,277,474,903,820,-193,343,263,479,-16,852,344,-446,559,-913};
		System.out.println(getLargest(nums));
		
	}

	public static String getLargest(int[] array)
	{
		String largest="";
		int num = array.length/3;
		int num2=num;
		int num3=num*2;
		
		int sum1=0,sum2=0,sum3=0;
		
		for (int i=0;i<num;i++)
		{
			sum1+=array[i];
			sum2+=array[num2];
			sum3+=array[num3];
			num2++;
			num3++;
		}
		
		if (sum1>sum2 && sum1>sum3){
			largest="First";
		}
		else if (sum2 >sum1 && sum2>sum3)
		{
			largest="Second";
		}
	
		else if (sum3 >sum1 && sum3>sum2)
		{
			largest="Third";
		}
		else{
			largest="Ambiguous";
		}
		
		return largest;
	}
}
