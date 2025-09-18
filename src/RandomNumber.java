import java.util.Random;

public class RandomNumber
{
    static int randomNumber()
    {
        Random random = new Random();
        return random.nextInt(101);

    }
}
