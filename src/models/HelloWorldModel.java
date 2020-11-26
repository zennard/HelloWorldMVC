package models;

import java.util.LinkedList;
import java.util.List;

public class HelloWorldModel {
    private List<String> words;
    private static final String HELLO_VALUE = "Hello";
    private static final String WORLD_VALUE = "world!";

    public HelloWorldModel() {
        words = new LinkedList<>();
    }

    public boolean isWordCorrect(String word) {
        boolean isHello = word.equals(HELLO_VALUE);
        boolean isWorld = word.equals(WORLD_VALUE);
        boolean isThereHello = words.contains(HELLO_VALUE);
        boolean isThereWorld = words.contains(WORLD_VALUE);

        if (!(isHello || isWorld)) return false;

        if (isThereHello && isHello) return false;
        else return (!isThereWorld && isThereHello) || !isWorld;
    }

    public void addWord(String word) {
        words.add(word);
    }

    public List<String> getWords() {
        return words;
    }
}
