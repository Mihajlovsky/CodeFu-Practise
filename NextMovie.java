/**
 *CodeFu Online Round 2 // 100 points 
 * Problem: http://codefu.mk/practice.html?subpage=problem&problemid=2191
 *
 * @author Mihajlovsky
 *
 */

public class NextMovie {

	public static void main(String[] args) {
	
		
	String[] names= {"Inglorious Basterds","X-Men: Days Of Future Past","Gone Girl","Guardians Of The Galaxy","The Dark Knight Rises","V For Vendetta","Rush","Boyhood"};
	int[] years = {2009,2014,2014,2014,2012,2005,2013,2014};
		
	
	System.out.println(getNextMovie(names,years));

	

	}

	 public static String getNextMovie(String[] names, int[] years) {
		
	
			 
		 int newest=0;
		 
		 int Lenght=years.length;
		 int i=0;
		 
		 //naoganje na najnovata godina
		 while(Lenght>0)
		 {
			 if (years[i]>newest)
			 {
				 newest=years[i];
			 } 
			 i++;
			 Lenght--;
		 }
		 
		 
		 Lenght=years.length;
		 i=0;
		 
		 int Index=0;
		 boolean first=true;
		 
		 
		 //se sortiraat spored ASCII vrednostite
		 while(Lenght>0)
		 {
			 if (years[i]==newest)
			 {
				 
				 //se zema indeksot na prviot element od novi filmovi
				 //ostanatite se sporeduvaat so nego
				 if (first)
				 {
					 Index=i;
					 first=false;
				 }
				 
				 else{
					 
					 //ako ima poveke, se sporeduvaat bukva po bukva
					 //se proveruva dodeka prviot string ima bukvi, zatoa sto abc e pred abcd
					 // ako se odi do dolzinata na vtoriot string, mozebi ke se sporedi so null karakter
					 //ako prviot string nema veke bukvi
					 for (int y=0;y<names[Index].length();y++)
					 {
						 
						 if (names[i].charAt(y)<names[Index].charAt(y))
						 {
							 Index=i;
							 break;
						 }
						 
						 else if (names[i].charAt(y)>names[Index].charAt(y))
						 {
							 break;
						 }
						 
					 }
					
				 }
							 
			 }
			 i++;
			 Lenght--;
		 }
		 
		 
		 return names[Index];   
	  }
	 
}
