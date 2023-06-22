package Java;
public class Lab816
{
	public static void main(String [] args)
	{

		//code to define an initially empty int 2D array, minimum size 4x4
        int [][] WholeGrade = new int [4][4];
		//code to output all original values		
        System.out.println(WholeGrade[0][0]);
        System.out.println(WholeGrade[0][1]);
        System.out.println(WholeGrade[0][2]);
        System.out.println(WholeGrade[0][3]);
        System.out.println(WholeGrade[1][0]);
        System.out.println(WholeGrade[1][1]);
        System.out.println(WholeGrade[1][2]);
        System.out.println(WholeGrade[1][3]);
        System.out.println(WholeGrade[2][0]);
        System.out.println(WholeGrade[2][1]);
        System.out.println(WholeGrade[2][2]);
        System.out.println(WholeGrade[2][3]);
        System.out.println(WholeGrade[3][0]);
        System.out.println(WholeGrade[3][1]);
        System.out.println(WholeGrade[3][2]);
        System.out.println(WholeGrade[3][3]);

		//code to change half the values to even positive numbers
        WholeGrade[0][0] = 14;
        WholeGrade[0][1] = 20;
        WholeGrade[0][2] = 100;
        WholeGrade[0][3] = 98;
        WholeGrade[1][0] = 96;
        WholeGrade[1][1] = 72;
        WholeGrade[1][2] = 86;
        WholeGrade[1][3] = 44;
		//and the other half to negative odd numbers
        WholeGrade[2][0] = -54;
        WholeGrade[2][1] = -79;
        WholeGrade[2][2] = -3;
        WholeGrade[2][3] = -5;
        WholeGrade[3][0] = -39;
        WholeGrade[3][1] = -27;
        WholeGrade[3][2] = -7;
        WholeGrade[3][3] = -33;
		//code to output a blank line separating output sets
        System.out.println();
		//code to output all array elements
        System.out.println(WholeGrade[0][0]);
        System.out.println(WholeGrade[0][1]);
        System.out.println(WholeGrade[0][2]);
        System.out.println(WholeGrade[0][3]);
        System.out.println(WholeGrade[1][0]);
        System.out.println(WholeGrade[1][1]);
        System.out.println(WholeGrade[1][2]);
        System.out.println(WholeGrade[1][3]);
        System.out.println(WholeGrade[2][0]);
        System.out.println(WholeGrade[2][1]);
        System.out.println(WholeGrade[2][2]);
        System.out.println(WholeGrade[2][3]);
        System.out.println(WholeGrade[3][0]);
        System.out.println(WholeGrade[3][1]);
        System.out.println(WholeGrade[3][2]);
        System.out.println(WholeGrade[3][3]);
	}
}