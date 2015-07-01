/**
 *CodeFu Shortest Solution // 400 points 
 * Problem: http://codefu.mk/shortest-8.html?subpage=problem&problemid=2108
 *
 * @author Mihajlovsky
 *
 */
 
public class GoodKids {

	public static void main(String[] args) {
		
	String[] kids ={"Alexander","Madison","Avery","Madelyn","Lily","Lily","Emily","Mia","Chloe","Matthew","Ava","Madelyn","Mason","Jacob","Abigail","Kaylee","Aiden","Jayden","Abigail","Chloe","Brayden","Matthew","Benjamin","Owen","Madelyn","Aubrey","Emma","Lily","Ethan","William","Ava","Hailey","Harper","James","Sophia","Owen","Charlotte","Mason","Emma","Carter","Layla","Elijah","Mia","Emma","Chloe","Jack","Caleb","Kaylee","Matthew","Hailey"};

	System.out.println(getBestKids(kids));
	
	
	}
		
	
	public static String getBestKids(String[] names){
		
		String bestKid="";
		int Count=0; int Temp=0;
	
		for (int i=0;i<names.length;i++){
		for (int j=i+1;j<names.length;j++)
		{
			if (names[i].toLowerCase().matches(names[j].toLowerCase()))
			{				
				Count++;
			}
		}
			if (Count>Temp)
			{
				bestKid=names[i];
				Temp=Count;
			}
			else if (Count==Temp)
			{
				if (bestKid=="")
				{
					bestKid=names[i];
				}
				else {
				bestKid+=","+names[i];
				}
			}
			Count=0;
		}		
		
		
		return bestKid.toLowerCase();
	}

}
