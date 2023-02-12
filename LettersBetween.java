import java.util.*;
public class LettersBetween 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		System.out.print("Enter your word: ");
		String s = kb.next();
		for(int i = 0; i < s.length(); i++)
			list.add(s.substring(i, i + 1));
		System.out.print("Enter a letter: ");
		String letter = kb.next();		
		//missing code
        int start = indexOf(list, letter);
        if(start == -1)
        {
            System.out.print(letter+" is not present in computer");
        }
        else
        {
        int last = lastIndexOf(list, letter);
        if(last == -1)
        {
            System.out.println(letter+" only appears one time in "+s);
        }
        else
        {
        System.out.println("There are "+last+" letters between\nthe first and last occurrence of "+letter);
        }
        }
        kb.close();
	}

	public static int indexOf(ArrayList<String> list, String target)
	{

		//missing implementation
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).equals(target))
            {
                return i;
            }
        }
        return -1;
	}	

	public static int lastIndexOf(ArrayList<String> list, String target)
	{
        int L = -1;
        int S = 0;
		//missing implementation
        for(int z = 0; z < list.size(); z++)
        {
            if(list.get(z).equals(target))
            {
                if(L == -1)
                {
                    S = z;
                    L = 0;
                }
                else
                {
                    L = z-1;
                }
            }
        }
        if(L == 0)
        {
            return -1;
        }
        return L - S;
	}
}