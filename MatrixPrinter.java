/**
 *CodeFu Seasonal 2015 SUMMER // 200 points 
 * Problem: http://codefu.mk/codefu2015summer.html?subpage=problem&problemid=2266
 *
 * @author Mihajlovsky
 *
 */

public class MatrixPrinter {

	public static void main(String[] args) {

		String m="1 2 3 4 5 6 7 8 9 0 1 2";
		
		System.out.println(printMatrix(3, 4, m ));
	}

	 public static String printMatrix(int rows, int columns, String matrix)
	 {
		 int n=0;
		 String f="";
		 String[] nums = matrix.split(" ");
		 String[][] m = new String[rows][columns];
		 
		 //string -> matrix
		 for (int i=0;i<rows;i++)
		 {
			 for (int j=0;j<columns;j++)
			 {
				m[i][j]=nums[n];
				n++;
			 }
		 }
		 
		 n=0;
		 
		 //print
		 for (int i=0;i<rows;i++)
		 {
			 for (int j=0;j<columns;j++)
			 {
				System.out.printf(m[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
		 //solution
		 while(n<=rows*columns){
		 for (int i=0;i<rows;i++)
		 {
			 for (int j=0;j<columns;j++)
			 {
				if (i+j==n)
				{
					f+=m[i][j]+" ";
				}
			 }
		 }
		 n++;
		 }
		 
		 return f;
	 }
}
