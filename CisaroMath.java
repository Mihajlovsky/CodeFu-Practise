/**
 *CodeFu Community 7 // 100 points 
 * Problem: http://codefu.mk/community7.html?subpage=problem&problemid=2305
 *
 * @author Mihajlovsky
 *
 */
 
public class CisaroMath {

	public static void main(String[] args) {

		System.out.println(solve(2, 18, 2));
		System.out.println(solve(-1, 8, 3));
		System.out.println(solve(0, 0, 10));
		System.out.println(solve(1, 16, 5));
		System.out.println(solve(0, 1, 29));
		System.out.println(solve(3, 0, 4)); 
		System.out.println(solve(1, 1000, 1));
		System.out.println(solve(7, 896, 7));
		System.out.println(solve(-1, -1, 5));
		System.out.println(solve(93929278, 939292780, 9));
		
	
	}

	  public static String solve(int a, int b, int n)
	  {
		
		String finalNumber="No solution";
		
		int i=0; 
		int temp=0;
		
		if (b==0){ //ako krajniot rezultat e 0 znaci x mora da e 0
			finalNumber=String.valueOf(0);
		}
		else if (a==0){//ako a=0 , togas za niedna vrednost na X nema da se dobie rezultatot
			finalNumber="No solution";
		}
		else if (n==1){// ako n==1 , togas X==(b/a)
			finalNumber=String.valueOf(b/a);
		}
		else{
		int number=b/a; //brojot za koj se bara logaritam
		
		if (number>0){ //positive 
		i=0;
		while (i<=number){	
			
		temp=i;

		for (int x=1;x<n;x++)
		{
			i*=temp; // brojot na koren (pr: ako n=3 za brojot 2 se izvrsuva 2*2*2)
			
		}
		if (i==number)
		{
			finalNumber=String.valueOf(temp); //ako se dojde do brojot koj se bara zavrsuva
			break;
		}
		i=temp;
		i++;
			
		}}
		
		
		else if (number<0){ //negative
		i=-1;
		
		while (i>=number){	//isto kako pozitivniot samo se namaluva i
			
			temp=i;

			for (int x=1;x<n;x++)
			{
				i*=temp;
				
			}
			if (i==number)
			{
				finalNumber=String.valueOf(temp);
				break;
			}
			i=temp;
			i--;
				
			}
			
		
		}}
		
		//ako prethodnite ciklusi ne najdat rezultat se vraka default vrednosta (No solution)
		  
		return finalNumber;
	  }
	  
	
	 
}
