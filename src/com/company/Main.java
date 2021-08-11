package com.company;

public class Main {

    public static void main(String[] args) {

        Dictionary dictionary = new DictionaryImpl();

        Menu menu = new Menu(dictionary);
        menu.open();



    }
}
