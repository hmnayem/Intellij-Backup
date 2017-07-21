package com.stringgame;

import java.util.LinkedList;

public class GamesTester {

    public static void main(String[] args) {

        String[] words = {"lol", "love", "play", "game", "text", "line", "word", "good", "you", "fine", "very"};

        GameQuestions gameQuestions = new GameQuestions(words);

        LinkedList<Questions> questions = gameQuestions.getList();

        for (Questions qu : questions) {
            System.out.println(qu);
        }
    }
}
