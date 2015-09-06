/**
 *CodeFu Seasonal 2015 SUMMER // 100 points 
 * Problem: http://codefu.mk/codefu2015summer.html?subpage=problem&problemid=2265
 *
 * @author Mihajlovsky
 *
 */

public class FaultyCompressor {

	public static void main(String[] args) {
	
		String word="abbcccddddeeeeeffffff";
		
		 System.out.println(compressMe(word)); 
		

	}
	
	public static String compressMe(String input){
		
		String f="";
		
		int i=0;
		int n=1;
		int count=1;
		boolean sub=true;
		
		
		while (i<input.length())
		{
			f+=input.charAt(i);
			while (n<input.length() && sub)
			{
				if (input.charAt(i)==input.charAt(n))
				{
					count++;
					n++;
					sub=true;
				}
				else{
					sub=false;
				}
			}
			f+=count;
			i=n;
			n=i+1;
			count=1;
			sub=true;
		}
		
		return f;
	}

}
