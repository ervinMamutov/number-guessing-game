import java.util.Random;

public class RandomNumber
{
    static int randomNumber()
    {
        Random random = new Random();
        int randomInt = random.nextInt(101);
        return randomInt;
    }
}
