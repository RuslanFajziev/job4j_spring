package ru.job4j.di;

public class StartUI {
    private ConsoleInput consoleInput;

    public StartUI(ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
    }

    public String askStr(String question) {
        return consoleInput.askStr(question);
    }
}