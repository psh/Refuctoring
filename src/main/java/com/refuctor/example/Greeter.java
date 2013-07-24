package com.refuctor.example;

public class Greeter {

    public String getGreeting() {
        StringBuilder builder = new StringBuilder();

        for (Getter g : new GetterIterator()) {
            builder.append(g.getStr());
        }

        return builder.toString();
    }

}
