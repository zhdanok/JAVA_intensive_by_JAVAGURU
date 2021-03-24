package io.github.zhdanok.callulator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public interface Consoleble {
    Logger logger = LoggerFactory.getLogger(Consoleble.class);

    String readFromConsole() throws IOException;

    void printToConsole(String task, String result);
}
