import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String[] questions = { "What is the capital of France?", "What is the currency of Japan?", "What is the largest planet in our solar system?" };
        String[][] options = {
                {"Paris", "London", "Berlin", "Rome"},
                {"Yen", "Dollar", "Euro", "Pound"},
                {"Jupiter", "Saturn", "Uranus", "Neptune"}
        };
        String[] answers = {"Paris", "Yen", "Jupiter"};

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println((j+1) + ": " + options[i][j]);
            }

            System.out.print("Enter the correct answer: ");
            int userAnswer = sc.nextInt();
            if (options[i][userAnswer-1].equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is: " + answers[i]);
            }

        }

        sc.close();


    }
}
