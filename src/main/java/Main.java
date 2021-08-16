package main.java;

import main.java.Dictionary.Dictionary;
import main.java.Dictionary.DictionaryImpl;
import main.java.Menu.Menu;

public class Main {

    public static void main(String[] args) {

        Dictionary dictionary = new DictionaryImpl();

        Menu menu = new Menu(dictionary);
        menu.open();
        String a ="jde";
        String b="dne";
        if(a.equals(b)){
            System.out.println("rfn");
        }



    }
}
