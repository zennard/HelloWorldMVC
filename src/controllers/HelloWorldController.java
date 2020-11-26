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

    public void addWordInput(String word) {
        if (word == null || word.isEmpty()) {
            showEmptyValueError();
            return;
        }
        if (!model.isWordCorrect(word)) {
            showWrongValueError();
            return;
        }

        model.addWord(word);
        showSuccessfulInsertionInfo();
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
