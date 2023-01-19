import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an array of questions
        String[] questions = {
                "What is the chemical symbol for gold?",
                "What is the process of photosynthesis?",
                "Who discovered DNA?",
                "What is the most abundant gas in the Earth's atmosphere?"
        };
    
        // Create a 2D array of options for each question
        String[][] options = {
                {"Au", "Ag", "Pt", "Fe"},
                {"The process of converting light energy into chemical energy", "The process of converting heat energy into mechanical energy", "The process of converting chemical energy into electrical energy", "The process of converting mechanical energy into heat energy"},
                {"James Watson", "Francis Crick", "James Watson and Francis Crick", "Rosalind Franklin", "Rosalind Franklin and Maurice Wilkins", "Maurice Wilkins"},
                {"Oxygen", "Nitrogen", "Carbon dioxide", "Argon"}
        };

        String[] answers = {"Au", "The process of converting light energy into chemical energy", "James Watson and Francis Crick", "Nitrogen"};

        // Initialize a variable to keep track of the score
        int score = 0;

        // Loop through the questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            // Loop through the options for each question
            for (int j = 0; j < options[i].length; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }

            // Read the user's answer
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

            // Check if the answer is correct
            if (options[i][answer-1].equalsIgnoreCase(answers[i])) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is:" + answers[i]);
            }
        }
        // Print the final score
        System.out.println("Your final score is: " + score + "/" + questions.length);

    }
}
