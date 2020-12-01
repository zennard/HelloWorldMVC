package controllers;

import models.HelloWorldModel;
import views.HelloWorldView;

import java.util.List;

public class HelloWorldController {
    private HelloWorldModel model;
    private HelloWorldView view;

    public HelloWorldController(HelloWorldModel model, HelloWorldView view) {
        this.model = model;
        this.view = view;
    }

    public void showEmptyValueError() {
        view.showEmptyValueError();
    }

    public void showWrongValueError() {
        view.showWrongValueError();
    }

    public void showInputError(String input) {
        if (input == null || input.isEmpty()) {
            showEmptyValueError();
        }
        if (!model.isWordCorrect(input)) {
            showWrongValueError();
        }
    }

    public void showIncorrectOptionError() {
        view.showIncorrectOptionError();
    }

    public void showMainMenu() {
        view.showMainMenu();
    }

    public void showGreetings() {
        view.showGreetings();
    }

    public void showRules() {
        view.showRules();
    }

    public void showInputInfo() {
        view.showInputInfo();
    }

    public void showSuccessfulInsertionInfo() {
        view.showSuccessfulInsertionInfo();
    }

    public void showExitInfo() {
        view.showExitMessage();
    }

    public boolean addWordInput(String word) {
        if (!isInputValid(word)) return false;

        model.addWord(word);
        return true;
    }

    private boolean isInputValid(String word) {
        if (word == null || word.isEmpty()) return false;

        return model.isWordCorrect(word);
    }

    public void showCurrentResult() {
        List<String> wordsList = model.getWords();
        StringBuilder res = new StringBuilder();

        for (String word : wordsList) {
            res.append(word);
            res.append(" ");
        }

        view.showResult(res.toString());
    }

}
