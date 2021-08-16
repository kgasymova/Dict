package main.java.Menu;

import main.java.Dictionary.Dictionary;

import java.util.Scanner;

public class Menu {

    public static final String WELCOME_MESSAGE = "Press:" +
            "\n 1 - setMap" +
            "\n 2 - translateEnglishWord" +
            "\n 3 - translateRussianWord" +
            "\n 4 - getWordsAmount" +
            "\n 5 - writeDict" +
            "\n 6 - QUIZ" +
            "\n 7 - Exit";
    public static final int SETMAP = 1, TRANSLATEENGLISHWORD = 2, TRANSLATERUSSIANWORD = 3, GETWORDSAMOUNT = 4, WRITEDICT = 5, QUIZ = 6, EXIT = 7;
    public static final String DELIMITER = "\n////////////////////////////////////////////////////\n";

    Scanner scanner = new Scanner(System.in);
    Dictionary dictionary;


    public Menu(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void open() {

        while (true) {
            System.out.println(WELCOME_MESSAGE);
            System.out.println(DELIMITER);
            int consoleChoice = scanner.nextInt();

            if (consoleChoice == EXIT) {
                break;
            }

            switch (consoleChoice) {
                case SETMAP:
                    System.out.println("Write english word: \n");
                    String englishWord = scanner.next();

                    System.out.println("Write russian word: \n");
                    String russianWord = scanner.next();

                    dictionary.setMap(englishWord, russianWord);
                    break;

                case TRANSLATEENGLISHWORD:
                    System.out.println("Write English word: \n");
                    dictionary.translateEnglishWord(scanner.next());
                    break;

                case TRANSLATERUSSIANWORD:
                    System.out.println("Write Russian word: \n");
                    dictionary.translateRussianWord(scanner.next());
                    break;

                case GETWORDSAMOUNT:
                    dictionary.getWordsAmount();
                    break;

                case WRITEDICT:
                    dictionary.writeDict();
                    break;

                case QUIZ:
                    dictionary.quiz();
                    break;

            }
        }


    }
}
