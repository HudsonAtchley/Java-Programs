public class Lab814
{
	public static void main(String [] args)
	{
		//code to define an initially empty double 2D array size 3x3

		double [][] list = new double[3][3];

		//code to output all original values		
        System.out.println(list[0][0]);
        System.out.println(list[0][1]);
        System.out.println(list[0][2]);
        System.out.println(list[1][0]);
        System.out.println(list[1][1]);
        System.out.println(list[1][2]);
        System.out.println(list[2][0]);
        System.out.println(list[2][1]);
        System.out.println(list[2][2]);
		//code to change five of the values to positive
        list[0][0] = 4;
        list[2][1] = 9;
        list[1][2] = 54;
        list[1][1] = 94;
        list[0][1] = 48; 
		//and the other four to negtive
        list[0][2] = -89;
        list[2][2] = -8192;
        list[1][0] = -100;
        list[2][0] = -9871;
		//code to output a blank line separating output sets
        System.out.println();
		//code to output all array elements
        System.out.println(list[0][0]);
        System.out.println(list[0][1]);
        System.out.println(list[0][2]);
        System.out.println(list[1][0]);
        System.out.println(list[1][1]);
        System.out.println(list[1][2]);
        System.out.println(list[2][0]);
        System.out.println(list[2][1]);
        System.out.println(list[2][2]);
	}

}
