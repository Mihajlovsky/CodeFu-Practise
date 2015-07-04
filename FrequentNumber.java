import java.util.ArrayList;

/**
 *CodeFu Shortest Solution // 300 points 
 * Problem: http://codefu.mk/shortest7.html?subpage=problem&problemid=1742
 *
 * @author Mihajlovsky
 *
 */
 
public class FrequentNumber {

	public static void main(String[] args) {
		
	String[] numbers={"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH",
			"ZASMVBQQPSWUVGEQIDFEDXZGZC",
			"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH",
			"AWGDMWOBJHVDLGAPVXDLQGXXCNAJLONFIUIEYUV",
			"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH",
			"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH",
			"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH",
			"AWGDMWOBJHVDLGAPVXDLQGXXCNAJLONFIUIEYUV",
			"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH",
			"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH",
			"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH",
			"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH",
			"AWGDMWOBJHVDLGAPVXDLQGXXCNAJLONFIUIEYUV",
			"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH",
			"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH",
			"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH",
			"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH",
			"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH",
			"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH",
			"KWFWNWIWYNNGGPQVDTVUTWKGFOWFZZPPLVJKAH"};
	
	System.out.println(mostFrequentNumber(numbers));	
	}
	
	public static String mostFrequentNumber(String[] letterNumbers)
	{
		ArrayList<String> n = new ArrayList<String>();
		
		String[] numbers={"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		String value="";
		
		
			for (String num:letterNumbers){
			for (int i=0;i<num.length();i++)
			{
				String cur=String.valueOf(num.charAt(i));
				for (int j=0;j<numbers.length;j++)
				{
					if (numbers[j].contains(cur))
					{
						value+=j;
					}
				}			
			}
		
			n.add(value);
			value="";
			}
			
			String temp="";
			int count=0;
			int most=0;
			String val="";
			for (int i=0;i<n.size();i++)
			{
				temp=n.get(i);
				for (int j=0;j<n.size();j++)
				{
					if (n.get(j).compareTo(temp)==0)
					{
						count++;
					}
				}
				if (count>=most)
				{
					if ((most==0) || (count>most)){
					most=count;
					val=n.get(i);					
					}
					else{
						if (n.get(i).compareTo(val)<0)
						{
							most=count;
							val=n.get(i);
							
						}
					}
				}
				count=0;
			}
			
		
		return val;
	}
}
