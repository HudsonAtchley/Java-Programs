public class Lab815
{
	public static void main(String [] args)
	{
		//code to define an initially empty String 2D array

		String [][] foods = new String [4][3];

		//code to output all original values		

		System.out.println(foods[0][0]);
		System.out.println(foods[0][1]);
        System.out.println(foods[1][0]);
		System.out.println(foods[1][1]);
        System.out.println(foods[2][0]);
		System.out.println(foods[2][1]);
        System.out.println(foods[3][0]);
		System.out.println(foods[3][1]);
        

		//code to change half the values to foods you like

        foods[0][0] = "Pizza";
        foods[0][1] = "Burger";	
        foods[1][0] = "Pasta";
        foods[1][1] = "Steak";	
		//and the other half to foods you don't like
        foods[2][0] = "Tuna";
        foods[2][1] = "Salmon";	
        foods[3][0] = "Chocolate";
        foods[3][1] = "Milky Way";	
		//foods I like

        foods[0][0] = "Pizza";
        foods[0][1] = "Burger";	
        foods[1][0] = "Pasta";
        foods[1][1] = "Steak";	

		//foods I don't like

        foods[2][0] = "Tuna";
        foods[2][1] = "Salmon";	
        foods[3][0] = "Fried Eggs (I like scrambled eggs)";
        foods[3][1] = "Milky Way";	

		//code to output a blank line separating output sets

		System.out.println();

		//code to output all array elements
		System.out.println(foods[0][0]);
		System.out.println(foods[0][1]);
        System.out.println(foods[1][0]);
		System.out.println(foods[1][1]);
        System.out.println(foods[2][0]);
		System.out.println(foods[2][1]);
        System.out.println(foods[3][0]);
		System.out.println(foods[3][1]);
	}
}




