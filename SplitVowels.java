/**
 *CodeFu Shortest Solution // 200 points 
 * Problem: http://codefu.mk/shortest7.html?subpage=problem&problemid=1741
 *
 * @author Mihajlovsky
 *
 */
 
public class SplitVowels {

	public static void main(String[] args) {
		
		String word="This is a long sentence";
		
		System.out.println(split(word));

	}

	
	  public static String split(String sentence)
	  {
		  String x="AEIOUYaeiouy";
		  String v="";
		  String non="";
		  String Word="";
		  String[] ss=sentence.split(" ");
		  
		  for (String s:ss){
		  for (int i=0;i<s.length();i++)
		  {
			  String c=String.valueOf(s.charAt(i));
			  
			  if (x.contains(c)){				  
				  v+=c;
			  }
			  else{
				  non+=c;
			  }
		  }
		  Word+=non+v+" ";
		  non="";
		  v="";
		  }		  
		  
		  return Word;
	  }
}
