//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int random = RandomNumber.randomNumber();
        AskUser input = new AskUser();

        Compare compare = new Compare();
        int userInput;
        String result;
        int count = 0;

        do
        {
            userInput = input.getNumber();
            System.out.println(userInput);

            result = compare.compare(random, userInput);

            System.out.println(("random" + " " + result + " " + userInput));
            count++;
        }
        while (random != userInput);

        System.out.println("You made " + count + " steps");
        System.out.print("Excellent!");

        input.closeScaner();
    }
}