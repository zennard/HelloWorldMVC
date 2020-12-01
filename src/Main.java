import controllers.HelloWorldController;
import models.HelloWorldModel;
import views.HelloWorldView;

import java.util.Scanner;

public class Main {
    private HelloWorldController controller;
    private Scanner scanner;

    private static final int SHOW_RULES = 1;
    private static final int TYPE_WORD = 2;
    private static final int SHOW_RESULT = 3;
    private static final int EXIT = 4;

    public Main() {

    }

    public Main(HelloWorldController c, Scanner sc) {
        this.controller = c;
        this.scanner = sc;
    }

    public static void main(String[] args) {
        HelloWorldModel model = new HelloWorldModel();
        HelloWorldView view = new HelloWorldView();

        HelloWorldController controller = new HelloWorldController(model, view);
        Scanner sc = new Scanner(System.in);

        Main main = new Main(controller, sc);
        main.startProgram();
    }

    public void startProgram() {
        boolean isRunning = true;

        controller.showGreetings();
        controller.showRules();
        do {
            controller.showMainMenu();

            int option = getOptionFromUser();

            switch (option) {
                case SHOW_RULES:
                    controller.showRules();
                    break;

                case TYPE_WORD:
                    String word = getWordFromUser();
                    if (!controller.addWordInput(word)) {
                        controller.showInputError(word);
                    } else {
                        controller.showSuccessfulInsertionInfo();
                    }

                    break;

                case SHOW_RESULT:
                    controller.showCurrentResult();
                    break;

                case EXIT:
                    controller.showExitInfo();
                    isRunning = false;
                    break;
            }

        } while (isRunning);
    }

    public boolean isOptionCorrect(int option, int minRangeValue, int maxRangeValue) {
        return option >= minRangeValue && option <= maxRangeValue;
    }

    private String getWordFromUser() {
        String word = "";

        controller.showInputInfo();
        if (scanner.hasNextLine()) {
            scanner.nextLine();
            word = scanner.nextLine();
        }

        return word;
    }

    public int getOptionFromUser() {
        int option;

        while (true) {
            controller.showInputInfo();

            if (!scanner.hasNextInt()) {
                controller.showIncorrectOptionError();
            } else if (!isOptionCorrect(option = scanner.nextInt(), 1, 4)) {
                controller.showIncorrectOptionError();
            } else {
                break;
            }
        }

        return option;
    }
}
