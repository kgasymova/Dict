package com.company;

public interface Dictionary {

    void setMap(String EnglishWord, String RussianWord);

    void translateEnglishWord(String EnglishWord);
    void translateRussianWord(String RussianWord);

    void getWordsAmount();
    void writeDict();

    void quiz();





}
