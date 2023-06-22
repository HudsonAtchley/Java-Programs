package Java;
import java.util.*;
public class Question743
{
		public static int countPositives(ArrayList<Integer> list)
		{
  		int count = 0;
        for(int i = 0; i < list.size(); i++)    
        {
        if(list.get(i) >= 0)
            {
                count++;
            }
        }
            return count;
        }
        

	//DO NOT ALTER THIS METHOD DEFINITION
	public static void main(String[] args) 
	{
		ArrayList<Integer> values = new ArrayList<Integer>();
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = kb.nextInt();
		while(n!=-999)
		{
			values.add(n);
			System.out.print("Enter number:");
			n = kb.nextInt();
		}
		System.out.println(countPositives(values));
		kb.close();
	}
}