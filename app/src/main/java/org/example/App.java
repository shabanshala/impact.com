package org.example;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "greet", mixinStandardHelpOptions = true, version = "1.0",
         description = "impact.com - SaaSquatch division!")
public class App implements Runnable {

    @Override
    public void run() {
        System.out.println("Welcome to impact.com - SaaSquatch division!");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}
