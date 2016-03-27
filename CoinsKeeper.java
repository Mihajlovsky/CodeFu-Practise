/**
 *CodeFu Community 10 // 200 points 
 * Submitted Solution: http://codefu.mk/community10.html?subpage=results&competitorid=17172&problemid=2386
 *
 * @author Mihajlovsky
 *
 */


public class CoinsKeeper {
  public int solve(int X, int Y, int Z, int P) {
     int Count=X+Y+Z;
		  
		  
		  while (P>0)
		  {
			  if (P>=5 && Z>0)
			  {
				  P-=5;
				  Z--;
				  Count--;
			  }
			  else if (P>=2 && Y>0)
			  {
				  P-=2;
				  Y--;
				  Count--;
			  }
			  else if (P>=1 && X>0)
			  {
				  P-=1;
				  X--;
				  Count--;
			  }
			 
		  }
		  
		  
	    return Count;
  }
}
