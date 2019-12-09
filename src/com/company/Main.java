package com.company;

import java.util.ArrayList;

public final class Main {

    public static void main(String[] args) {

        Forum forum = new Forum("Programmation orient´ee objet");
        Theme theme1 = new Theme("Constructeurs");
        Theme theme2 = new Theme("Design patterns");
        Salon salon1 = new Salon("H´eritage");
        Salon salon2 = new Salon("Composition");
        Salon salon3 = new Salon("Pattern Composite");
        Message message1 = new Message("J’ai un probl`eme", "voila, j’ai essay´e ...");
        Message message2 = new Message("Au secours", "¸ca marche pas ...");
        Message message3 = new Message("Diff´erence ?", "quelle est la diff´erence entre l’aggregation et la composition ");
        Message message4 = new Message("Question", "quand utilise-t-on le pattern composite ?");
        forum.add(theme1);
        forum.add(theme2);
        theme1.add(salon1);
        theme1.add(salon2);
        theme2.add(salon3);
        salon1.add(message1);
        salon1.add(message2);
        salon2.add(message3);
        salon3.add(message4);
        System.out.println(forum.toString());
    }
}
