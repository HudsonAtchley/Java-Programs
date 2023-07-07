import java.util.ArrayList;
import java.util.Scanner;
public class AddVowels 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		ArrayList<String> text = new ArrayList<String>();

		System.out.print("Enter a word: ");
		String word = kb.next();		

		//missing code
		for(int i = 0; i < word.length(); i++)
		{
			char eachChar = word.charAt(i);
			String letter = Character.toString(eachChar);
			
			if(letter.equals("a")||letter.equals("e")||letter.equals("i")||letter.equals("o")||letter.equals("u"))
			{

			text.add(letter);
			}
			text.add(letter);
		}
    
		for(String s:text)
		{

			System.out.print(s);	
	
		}
		System.out.println();
		kb.close();
	}
}