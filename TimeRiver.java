/**
 *Practice  // 200 points 
 * Problem: http://codefu.mk/practice.html?subpage=problem&problemid=761
 *
 * @author Mihajlovsky
 *
 */
 
public class TimeRiver {

	public static void main(String[] args) {
		
System.out.println(getPercentage("March 26, 2016 17:45"));
	}
	
	public static String getPercentage(String curDateTime)
	{
		String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
		
		String[] splitdate=null;
		String[] time=null;
		
		float secondsInYear=0;
		float secondsTillNow=0;
		
		splitdate=curDateTime.split(",");
		splitdate=curDateTime.split(" ");
		boolean leapyear=false;
		
		String month=splitdate[0];
		int day=Integer.valueOf(splitdate[1].substring(0, 2));
		int year=Integer.valueOf(splitdate[2]);
		String hours=splitdate[3];
		time=hours.split(":");
		int hour=Integer.valueOf(time[0]);
		int min=Integer.valueOf(time[1]);
		
		
		if (year%400==0 || (year%4==0 && year%100!=0)){
	
			secondsInYear=366*24*60*60;
			leapyear=true;
				
		}
		//leap year
		else{
			secondsInYear=365*24*60*60;
		}
		
		//elapsed time
		int i=0;
		
		
		while (months[i].compareTo(month)!=0){
	
			if (leapyear && i==1)
			{
				secondsTillNow+=29*24*60*60;
			}
			else{
				secondsTillNow+=days[i]*24*60*60;
			}
			i++;
		}
		
		float currentMonth=(((day-1)*24*60*60)+(hour*60*60)+(min*60));
		secondsTillNow+=currentMonth;
		
		float percent= (100/secondsInYear)*secondsTillNow;
		
		
		
		
		
		return String.valueOf((double)Math.round(percent * 10000d) / 10000d);
	}

}
