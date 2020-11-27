package views;

public class HelloWorldView {
    private static final String GREETINGS = "Welcome to mvc hello world example!";
    private static final String RULES = "You can type words and make a sentence  from them.";
    private static final String ALLOWED_WORDS = "Words allowed: 'Hello', 'world!' ";
    private static final String CHOICE = "Please, make your choice: ";
    private static final String CHOICE1 = "1. show rules again.";
    private static final String CHOICE2 = "2. type word for concatenation.";
    private static final String CHOICE3 = "3. show currently built sentence.";
    private static final String CHOICE4 = "4. Exit.";
    private static final String WRONG_VALUE = "This value is incorrect, please type allowed words, for more see rules.";
    private static final String EMPTY_VALUE = "The value cannot be empty, please type something.";
    private static final String INCORRECT_OPTION = "Cannot have such option, please change it. Option must be a number between 1 and 4.";
    private static final String INPUT = "Write your input: ";
    private static final String WORD_INSERTED = "Your word has been accepted and added!";
    private static final String RESULT = "Current result sentence is: ";
    private static final String GOODBYE = "Goodbye! See you next time!";

    public void showGreetings() {
        String text = String.format("%s\n", GREETINGS);
        System.out.println(text);
    }

    public void showRules() {
        String text = String.format("RULES\n%s\n%s\n\n",
                RULES, ALLOWED_WORDS);

        System.out.print(text);
    }

    public void showMainMenu() {
        String text = String.format("\n%s\n%s\n%s\n%s\n%s\n",
                CHOICE, CHOICE1, CHOICE2, CHOICE3, CHOICE4);
        System.out.print(text);
    }

    public void showWrongValueError() {
        String text = String.format("%s\n\n", WRONG_VALUE);
        System.out.print(text);
    }

    public void showEmptyValueError() {
        String text = String.format("%s\n\n", EMPTY_VALUE);
        System.out.print(text);
    }

    public void showIncorrectOptionError() {
        String text = String.format("%s\n\n", INCORRECT_OPTION);
        System.out.print(text);
    }

    public void showInputInfo() {
        String text = String.format("%s\n", INPUT);
        System.out.print(text);
    }

    public void showSuccessfulInsertionInfo() {
        String text = String.format("%s\n\n", WORD_INSERTED);
        System.out.print(text);
    }

    public void showResult(String resString) {
        String text;
        if (resString.isEmpty()) {
            text = String.format("%s\nEMPTY\n", RESULT);
        } else {
            text = String.format("%s\n%s\n", RESULT, resString);
        }

        System.out.print(text);
    }

    public void showExitMessage() {
        String text = String.format("%s\n\n", GOODBYE);
        System.out.print(text);
    }

}
