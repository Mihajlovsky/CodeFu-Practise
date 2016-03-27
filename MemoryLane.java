/*
*http://codefu.mk/community9.html?subpage=problem&problemid=2365
*
*/

public class MemoryLane {
  public String valentineWish(int[] lane) {
    for (int i=0;i<lane.length;i++)
		 {
			 if (i>=2){
			 if (lane[i]==lane[i-1])
			 {
				 int temp=lane[i-1];
				 lane[i-1]=lane[i-2];
				 lane[i-2]=temp;
			 }
			 }
			 else{
				 if (lane[i]==lane[i+1])
				 {
					 int temp=lane[i+1];
					 lane[i+1]=lane[i+2];
					 lane[i+2]=temp;
				 }
			 }
			 
		 }
		 
		 for (int i=0;i<lane.length-1;i++)
		 	{
			 if (lane[i]==lane[i+1])
			 {
				 return "J.K. will be spending his Valentine's Day alone :(";
			 }
		 	}
		 return "Love is in the air! <3";
  }
}
