/**
 *CodeFu "Shortest Solution" :D // 100 points 
 
 * Problem: http://codefu.mk/shortest-8.html?subpage=problem&problemid=2108
 *
 * @author Mihajlovsky
 *
 */
 
import java.util.ArrayList;


public class Hamming {

	public static void main(String[] args) {
		
		int[] numbers={15,16,19,21};
		
	System.out.println(minSumNumber(numbers));
		
		
	}
	  public static int minSumNumber(int[] numbers)
	  {
		  ArrayList<String> list = new ArrayList<String>();
	
		  
		  for (Integer i:numbers)
		  {
			  String num=Integer.toBinaryString(i);
			  list.add(num);
		  }
		  
		  int Count=10000000;
		  int Temp=0;
		  int Smallest=10000000;
		  
		     for (int i=0;i<list.size();i++){
			 for (int j=0;j<list.size();j++)
			 {
				//ako binarnata sekvenca koja se sporeduva so drugite ima poveke bitovi
				 if (list.get(i).length()>list.get(j).length()){
					 
					 //se naoga dolzinata na pokratkata sekvenca, za da ne se sporeduva so null
					 int y=list.get(j).length()-1;
					 for (int x=list.get(i).length()-1;x>=0;x--)
					 {
						 //dodeka pokratkata sekvenca ima bitovi, se sporeduvaat
						 if (y>=0){
						if (list.get(i).charAt(x)!=list.get(j).charAt(y))
						{
							Temp++;							
						}
						 }
						 // koga ke nema veke bitovi pokratkata sekvenca znaci site se 0 do pocetokot
						 //ako se najde 1 kaj podolgata znaci bitovite se razlicni
						 else
						{
							 if(list.get(i).charAt(x)=='1')
							 {
								 Temp++;
							 }
						}
						y--; 
					 
					 	}
					 }
					 else
					 { 
						 //ako prvata sekvenca ima pomalku bitovi
						 int y=list.get(i).length()-1;
						 for (int x=list.get(j).length()-1;x>=0;x--)
						 {
							 if (y>=0){
									if (list.get(j).charAt(x)!=list.get(i).charAt(y))
									{
										Temp++;							
									}
									 }
									 else
									{
										 if(list.get(j).charAt(x)=='1')
										 {
											 Temp++;
										 }
									}
								y--; 
						 }
					 
					 }}
			 
			 System.out.printf("%d: %d\n",numbers[i],Temp);
			 if (Temp<Count)
			 {
				 
				 Smallest=i;
				 
				 Count=Temp;
				 
				 
			 }
			 else if (Temp==Count)
			 {
				 if (numbers[i]<numbers[Smallest])
				 {
					 Smallest=i;
					 Count=Temp;
					 
				 }
			 }
			 Temp=0;
		     }
		     
		     	  
		  return numbers[Smallest];
				
	  }

}
