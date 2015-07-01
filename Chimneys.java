/**
 *CodeFu Shortest Solution // 300 points 
 * Problem: http://codefu.mk/shortest-8.html?subpage=problem&problemid=2107
 *
 * @author Mihajlovsky
 *
 */
 
public class Chimneys {

	public static void main(String[] args) {
		
	int[] x ={6,1,7,4,1,4};
	int[] y= {8,9,7,4,4,7};

	System.out.println(getArea(x,y));
	}

	 public static int getArea(int[] x, int[] y)
	 {
		int a=0;
		 
		 int minX=x[0]; int maxX=x[0];
		 int minY=y[0]; int maxY=y[0];
		 
		 for (Integer i:x)
		 {
			 if (i<minX)
			 {
				 minX=i;				 
			 }
			 
			 if (i>maxX)
			 {
				 maxX=i;				
			 }
		 }
		 
		 for (Integer i:y)
		 {
			 if (i<minY)
			 {
				 minY=i;				 
			 }
			 
			 if (i>maxY)
			 {
				 maxY=i;				 
			 }
		 }
		 
		 if ((maxX-minX) > (maxY-minY))
		 {
			 a=maxX-minX;
			 a=a*a;
		 }
		 else{
			 a=maxY-minY;
			 a=a*a;
		 }
		 
		 return a;
		 
	 }
}
