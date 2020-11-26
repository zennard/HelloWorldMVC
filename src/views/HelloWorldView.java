package views;

public class HelloWorldView {
    private static final String GREETINGS = "Welcome to mvc hello world example!\n";
    private static final String RULES = "You can type words and make a sentence  from them.\n";
    private static final String ALLOWED_WORDS = "Words allowed: 'Hello', 'world!' \n";
    private static final String CHOICE = "\nPlease, make your choice: \n";
    private static final String CHOICE1 = "1. show rules again.\n";
    private static final String CHOICE2 = "2. type word for concatenation.\n";
    private static final String CHOICE3 = "3. show currently built sentence.\n";
    private static final String CHOICE4 = "4. Exit.\n";
    private static final String WRONG_VALUE = "This value is incorrect, please type allowed words, for more see rules.\n";
    private static final String EMPTY_VALUE = "The value cannot be empty, please type something.\n";
    private static final String INCORRECT_OPTION = "Cannot have such option, please change it. Option must be a number between 1 and 4. \n";
    private static final String INPUT = "Write your input: \n";
    private static final String WORD_INSERTED = "Your word has been accepted and added!\n";
    private static final String RESULT = "Current result sentence is: \n";
    private static final String GOODBYE = "Goodbye! See you next time!\n";

    public void showGreetings() {
        System.out.println(GREETINGS);
    }

    public void showRules() {
        System.out.println("RULES");
        System.out.print(RULES);
        System.out.println(ALLOWED_WORDS);
    }

    public void showMainMenu() {
        System.out.print(CHOICE);
        System.out.print(CHOICE1);
        System.out.print(CHOICE2);
        System.out.print(CHOICE3);
        System.out.print(CHOICE4);
    }

    public void showWrongValueError() {
        System.out.println(WRONG_VALUE);
    }

    public void showEmptyValueError() {
        System.out.println(EMPTY_VALUE);
    }

    public void showIncorrectOptionError() {
        System.out.println(INCORRECT_OPTION);
    }

    public void showInputInfo() {
        System.out.print(INPUT);
    }

    public void showSuccessfulInsertionInfo() {
        System.out.println(WORD_INSERTED);
    }

    public void showResult(String resString) {
        if (resString.isEmpty()) {
            System.out.println(RESULT + "EMPTY" + "\n");
            return;
        }
        System.out.println(RESULT + resString + "\n");
    }

    public void showExitMessage() {
        System.out.println(GOODBYE);
    }

}
