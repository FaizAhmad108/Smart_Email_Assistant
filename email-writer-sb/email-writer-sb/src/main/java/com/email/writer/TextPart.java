package com.email.writer;

public class TextPart {
    private String text;

    public TextPart(String text){
        this.text=text;
    }

    // new getter so other model classes can extract the raw string
    public String getText() {
        return text;
    }
}
