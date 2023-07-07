import java.util.*;
public class Sorted 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print("Enter 8 whole numbers: ");
		for(int x = 0; x <= 7; x++)	
        list.add(kb.nextInt());
		if(isSorted(list))
        {
			System.out.println("Sorted");
        }
		else
        {
			System.out.println("Not Sorted");
        }
		kb.close();
	}	

	public static boolean isSorted(ArrayList<Integer> list)
	{
		//missing implementation
        ArrayList<Integer> sortedList = new ArrayList<Integer>(list);
        Collections.sort(sortedList);
        return sortedList.equals(list);
    
	}
	
}


