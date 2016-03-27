/**
 *Practice Round 2 // 100 points 
 * Problem: http://codefu.mk/practice.html?subpage=problem&problemid=1785
 *
 * @author Mihajlovsky
 *
 */

import java.util.ArrayList;

public class ArraySnakes {
public int sharedPositions(int head1, int tail1, int head2, int tail2) {
int[] pos1=null;
int[] pos2=null;

int Count=0;

ArrayList<Integer> list1= new ArrayList<Integer>();
ArrayList<Integer> list2= new ArrayList<Integer>();


if (head1<tail1)
{
	for (int i=head1;i<=tail1;i++)
	{
		
		list1.add(i);
	}
}
else if (tail1<head1){
	for (int i=head1;i>=tail1;i--)
	{
	
		list1.add(i);;
	}
}


if (head2<tail2)
{
	for (int i=head2;i<=tail2;i++)
	{
		
		list2.add(i);
	}
}
else{
	for (int i=head2;i>=tail2;i--)
	{
	
		list2.add(i);
		
	}
}

for (int i=0;i<list1.size();i++)
{
	
	for (int j=0;j<list2.size();j++)
	{
		if (list1.get(i)==list2.get(j))
		{
			Count++;
		}
	}
}


return Count;
}
}
