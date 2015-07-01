/**
 *CodeFu Shortest Solution // 200 points 
 * Problem: http://codefu.mk/shortest-8.html?subpage=problem&problemid=2106
 *
 * @author Mihajlovsky
 *
 */
public class Triathlon {

	public static void main(String[] args) {
		
		
		String[] players={"Anna Washington;8.53;39.73;6.44","Louise Cooper;9.91;41.73;15.49","Carl Nelson;7.44;21.2;3.16","Jacqueline Kelly;2.58;22.82;4.13"};

		System.out.println(getWinner(players));
						

	}

	public static String getWinner(String[] results)
	{
		float B=0;
		float T=0;
		String F="";
		
		for (String s:results)
		{
			String[] ss=s.split(";");
			T=Float.parseFloat(ss[1])+Float.parseFloat(ss[2])+Float.parseFloat(ss[3]);
			if (T>B)
			{
				B=T;
				F=ss[0];
				T=0;
			}
		}
				
		return F;
	}
}
