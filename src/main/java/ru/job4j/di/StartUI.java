package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class StartUI {
    @Autowired
    private ConsoleInput consoleInput;

    public String askStr(String question) {
        return consoleInput.askStr(question);
    }
}