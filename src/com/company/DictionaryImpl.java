package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryImpl implements Dictionary {
    Map<String, String> rusEnglishDict = new HashMap<String, String>();
    Map<String, String> engRusDict = new HashMap<String, String>();
    Scanner scanner = new Scanner(System.in);

    public DictionaryImpl() {
        rusEnglishDict.put("красный", "red");
        engRusDict.put("red", "красный");

        rusEnglishDict.put("желтый", "yellow");
        engRusDict.put("yellow", "желтый");

        rusEnglishDict.put("розовый", "pink");
        engRusDict.put("pink", "розовый");

        rusEnglishDict.put("черный", "black");
        engRusDict.put("black", "черный");

        rusEnglishDict.put("небо", "sky");
        engRusDict.put("sky", "небо");

        rusEnglishDict.put("вода", "water");
        engRusDict.put("water", "вода");

        rusEnglishDict.put("озеро", "lake");
        engRusDict.put("lake", "озеро");

        rusEnglishDict.put("река", "river");
        engRusDict.put("river", "река");

        rusEnglishDict.put("дом", "house");
        engRusDict.put("house", "дом");

        rusEnglishDict.put("крыша", "roof");
        engRusDict.put("roof", "крыша");
    }


    @Override
    public void setMap(String EnglishWord, String RussianWord) {
        engRusDict.put(EnglishWord, RussianWord);
        rusEnglishDict.put(RussianWord, EnglishWord);
    }

    @Override
    public void translateEnglishWord(String EnglishWord) {
        System.out.println(engRusDict.get(EnglishWord));
    }

    @Override
    public void translateRussianWord(String RussianWord) {
        System.out.println(rusEnglishDict.get(RussianWord));
    }

    @Override
    public void getWordsAmount() {
        System.out.println(engRusDict.size());
    }

    @Override
    public void quiz() {
        int arraySize = engRusDict.size();
        ArrayList<String> keys = new ArrayList<>(arraySize);
        ArrayList<String> values = new ArrayList<>(arraySize);
        int correctAnswers = 0;
        double percentCorrectAnswers;

        ArrayList<String> incorrectKeys = new ArrayList<>();
        ArrayList<String> incorrectUserValues = new ArrayList<>();
        ArrayList<String> correctValues = new ArrayList<>();

        for (Map.Entry<String, String> entry : engRusDict.entrySet()) {
            String key = entry.getKey();
            keys.add(key);
            String value = entry.getValue();
            values.add(value);
        }
        for (int i = 0; i < 5; i++) {
            int randomNumber = (int) (Math.random() * arraySize);
            String randomWord = keys.get(randomNumber);

            System.out.println("Translate and write the word: " + randomWord);
            String consoleWord = scanner.next();

            if (consoleWord.equals(values.get(randomNumber))) {
                correctAnswers++;
            } else {
                incorrectKeys.add(randomWord);
                incorrectUserValues.add(consoleWord);
                correctValues.add(values.get(randomNumber));
            }

        }
        percentCorrectAnswers = correctAnswers / 5. * 100;


        System.out.println("Percent of correct answers: " + percentCorrectAnswers);
        if (percentCorrectAnswers < 100) {
            System.out.println("Words that you translate incorrect: ");
        }
        for (int i = 0; i < incorrectKeys.size(); i++) {
            System.out.println("English word: " + incorrectKeys.get(i) + "\t" +
                    "Your variant: " + incorrectUserValues.get(i) + "\t" + "Correct variant: " + correctValues.get(i));
        }

    }

    @Override
    public void writeDict() {
        System.out.println(rusEnglishDict.toString());
    }

}
