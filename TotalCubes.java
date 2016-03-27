// http://codefu.mk/practice.html?subpage=problem&problemid=680
// Shortest Solution

public class TotalCubes {

	public static void main(String[] args) {
		  
		  System.out.println(howMany(	
				  900000, 1000000));
		  

	}
	  public static int howMany(int A, int B)
	  {
		 int c=0;
		 
		 for (int i=1;i<=100;i++)
		 {
			 
			 int Cube=i*i*i;
			 
			 if (Cube>=A && Cube<=B )
			 {
				  c++;
			 }
		 }	  
		  
		 return c; 
	  }

}
