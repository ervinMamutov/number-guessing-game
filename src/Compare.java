public class Compare
{
    public String compare(int randomNumber, int userNumber)
    {
        if (randomNumber > userNumber) return ">";
        if (randomNumber < userNumber) return "<";
        return "=";
    }
}
