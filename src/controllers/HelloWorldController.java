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

    //TODO: method has side effects, gonna change later
    public void addWordInput(String word) {
        if (!isInputValid(word)) return;

        model.addWord(word);
        showSuccessfulInsertionInfo();
    }

    //TODO: method has side effects, gonna change later
    private boolean isInputValid(String word) {
        if (word == null || word.isEmpty()) {
            showEmptyValueError();
            return false;
        }
        if (!model.isWordCorrect(word)) {
            showWrongValueError();
            return false;
        }

        return true;
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
