import java.util.Scanner;

public class AskUser
{
    private final Scanner scanner = new Scanner(System.in);

    public int getNumber()
   {
        int number = 0;
        System.out.println("Input your answer");
        if (scanner.hasNextInt())
        {
           number = scanner.nextInt();
        }
        else
        {
            System.out.println("Input number between 1 to 100");
        }

        return number;
   }
}
