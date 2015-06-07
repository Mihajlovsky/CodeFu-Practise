/**
 *CodeFu Online Round 1 // 100 points 
 * Problem: http://codefu.mk/practice.html?subpage=problem&problemid=2170
 *
 * @author Mihajlovsky
 *
 */
public class TableTennisScore {

public static String whoWon(String score){
		
		StringBuilder sb= new StringBuilder();
		
		String playerOne;
		String playerTwo;
		
		int scorePlayerOne=0;
		int scorePlayerTwo=0;
		
		String finalScore="";

		int score1=0;
		int score2=0;
		
		 //to initialize the players
		if (score.charAt(0)=='a' || score.charAt(0)=='A' )
				{
					playerOne="Anna";
					playerTwo="Peter";
				}
				else
				{
					playerOne="Peter";
					playerTwo="Anna";
				}
				
				//while the char ':' is in the input we check who has the better score and 
				//then we remove that score and check the others
				while(score.lastIndexOf(':')>0)
				{
					int colon=score.lastIndexOf(':')+1;
				
					
					score1=(score.charAt(colon-3)-'0')*10+score.charAt(colon-2)-'0';
					score2=(score.charAt(colon)-'0')*10+score.charAt(colon+1)-'0';
					
					if (score1>score2)
					{
						scorePlayerOne++;
					}
					else if(score2>score1){
						scorePlayerTwo++;
					}
					
					//for the next score the values must be 0
					score1=0;
					score2=0;
					
					//remove the score that we checked
					score=score.substring(0, colon-1);
				}
				
				//The final score
				if (scorePlayerOne>scorePlayerTwo)
				{
					sb= new StringBuilder();
					sb.append(scorePlayerOne);
					sb.append(":");
					sb.append(scorePlayerTwo);
					
					finalScore=playerOne+" "+sb.toString();
				
				}
				
				else if (scorePlayerTwo>scorePlayerOne)
				{
					sb= new StringBuilder();
					sb.append(scorePlayerTwo);
					sb.append(":");
					sb.append(scorePlayerOne);
					
					finalScore=playerTwo+" "+sb.toString();
				}
				
				return finalScore;
				
	}
}
