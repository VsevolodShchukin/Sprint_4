package com.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        int count = 0;
        for (char element: name.toCharArray()){
            if (element == ' ') count++;
        }

        return !(name.length() < 3 | name.length() > 19 | name.startsWith(" ") | name.endsWith(" ") | count != 1);
    }

}
