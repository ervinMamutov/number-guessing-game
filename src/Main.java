//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int random = RandomNumber.randomNumber();
        // System.out.println(random);

        AskUser input = new AskUser();

        Compare compare = new Compare();
        int stop;
        int userInput;
        String result;

        do
        {

            userInput = input.getNumber();
            System.out.println(userInput);

            result = compare.compare(random, userInput);

            System.out.println(("random" + " " + result + " " + userInput));

        }
        while (random != userInput);


    }
}