import java.util.Scanner;
class Test{
    /**
     * @param args
     */
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Simple Test Login and Sign Up: ");
        System.out.print("1 to Login, 2 to Sign Up: ");
        int startChoice = kb.nextInt();
        if(startChoice == 1) //Login Screen
        {
            System.out.print("Username: ");
            String loginUserName = kb.next();
            System.out.print("Password: ");
            int loginPassword = kb.nextInt();
            System.out.println("Welcome back, "+loginUserName+"!"+"\nWe hope you enjoy your stay!");
        }
        else //Sign Up Section
        {
            System.out.println("Enter a Username for your account: ");
            String newUserName = kb.next();
            System.out.println("Enter a Password for your account: ");
            int newPassword = kb.nextInt();
            System.out.println("First name: ");
            String firstName = kb.next();
            System.out.println("Last name: ");
            String lastName = kb.next();
            System.out.print("Hello there "+newUserName+"!"+" Welcome to Test.");
        }
    }
}