import controllers.HelloWorldController;
import models.HelloWorldModel;
import views.HelloWorldView;

import java.util.Scanner;

public class Main {
    private HelloWorldController controller;
    private Scanner scanner;

    public void setController(HelloWorldController controller) {
        this.controller = controller;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        Main main = new Main();

        HelloWorldModel model = new HelloWorldModel();
        HelloWorldView view = new HelloWorldView();

        main.setController(new HelloWorldController(model, view));
        main.setScanner(new Scanner(System.in));

        main.startProgram();
    }

    public void startProgram() {
        boolean isRunning = true;

        controller.showGreetings();
        controller.showRules();
        do {
            controller.showMainMenu();

            int option = getOptionFromUser();

            if (option == 1) {
                controller.showRules();
            } else if (option == 2) {
                String word = getWordFromUser();
                controller.addWordInput(word);
            } else if (option == 3) {
                controller.showCurrentResult();
            } else if (option == 4) {
                controller.showExitInfo();
                isRunning = false;
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
