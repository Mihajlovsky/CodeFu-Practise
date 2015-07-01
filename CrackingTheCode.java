/**
 *CodeFu Shortest Solution // 100 points 
 * Problem: http://codefu.mk/shortest-8.html?subpage=problem&problemid=2105
 *
 * @author Mihajlovsky
 *
 */
public class CrackingTheCode {

	public static void main(String[] args) {

		String[] codes = {"62775","63309","17430","61115","60768"};
		String intercepted= "6????";
		
		System.out.println(howMany(codes,intercepted));

	}
	
	public static int howMany(String[] zipCodes, String message){
		
		int N=0;
		boolean tf=true;
		
		for (String code:zipCodes)
		{
			for (int i=0;i<message.length();i++)
			{
				if (message.charAt(i)!='?'){
				if (code.charAt(i)!=message.charAt(i))
				{
					tf=false;
					break;
				}
				}
			}
			if (tf)
			{
				N++;
			}
			tf=true;
		}		
		
		return N;
	}

}
